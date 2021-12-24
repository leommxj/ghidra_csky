package ghidra.app.util.bin.format.elf.relocation;

import ghidra.app.util.bin.format.elf.*;
import ghidra.program.model.address.Address;
import ghidra.program.model.listing.Program;
import ghidra.program.model.mem.Memory;
import ghidra.program.model.mem.MemoryAccessException;
import ghidra.util.exception.NotFoundException;

public class CSKY_ElfRelocationHandler extends ElfRelocationHandler {
	@Override
	public boolean canRelocate(ElfHeader elf) {
		return elf.e_machine() == 39;//39 is csky old/mcore
	}

	@Override
	public void relocate(ElfRelocationContext elfRelocationContext, ElfRelocation relocation, Address relocationAddress) throws MemoryAccessException, NotFoundException {
		ElfHeader elf = elfRelocationContext.getElfHeader();
		if(!canRelocate(elf)) {return;}

		Program program = elfRelocationContext.getProgram();
		Memory memory = program.getMemory();
		
		int type = relocation.getType();
		if(CSKY_ElfRelocationConstants.R_CSKY_NONE == type) {
			return;
		}

		long addend = relocation.hasAddend() ? relocation.getAddend() : memory.getInt(relocationAddress) ;
		long offset = relocationAddress.getOffset();
		long base = elfRelocationContext.getImageBaseWordAdjustmentOffset();

		ElfSymbol sym = null;
		long symbolValue = 0;
		Address symbolAddr = null;
		String symbolName = null;

		int symbolIndex = relocation.getSymbolIndex();
		if (symbolIndex != 0) {
			sym = elfRelocationContext.getSymbol(symbolIndex);
		}
		
		if (sym != null) {
			symbolAddr = elfRelocationContext.getSymbolAddress(sym);
			symbolValue = elfRelocationContext.getSymbolValue(sym);
			symbolName = sym.getNameAsString();
		}
		
		int value32;
		
		switch(type) {
		case CSKY_ElfRelocationConstants.R_CSKY_32:
			value32 = (int)(symbolValue + addend);
			memory.setInt(relocationAddress, value32);
			break;
		case CSKY_ElfRelocationConstants.R_CSKY_PC32:
			value32 = (int)(symbolValue + addend)-(int)offset;
			memory.setInt(relocationAddress, value32);
			break;
		case CSKY_ElfRelocationConstants.R_CSKY_PCRELJSR_IMM11BY2:
			break;
		case CSKY_ElfRelocationConstants.R_CSKY_PCRELJSR_IMM26BY2:
			//Only CK810 will handle this, ignore now
			markAsWarning(program, relocationAddress, "R_CSKY_PCRELJSR_IMM26BY2", symbolName, symbolIndex, "TODO, only for CK810", elfRelocationContext.getLog());
			break;
		case CSKY_ElfRelocationConstants.R_CSKY_ADDR_HI16:
			markAsWarning(program, relocationAddress, "R_CSKY_ADDR_HI16", symbolName, symbolIndex, "TODO", elfRelocationContext.getLog());
			break;
		case CSKY_ElfRelocationConstants.R_CSKY_ADDR_LO16:
			markAsWarning(program, relocationAddress, "R_CSKY_ADDR_LO16", symbolName, symbolIndex, "TODO", elfRelocationContext.getLog());
			break;
		default:
			markAsUnhandled(program, relocationAddress, type, symbolIndex, symbolName, elfRelocationContext.getLog());
			break;
		} 

		
		
		
		
	}
}