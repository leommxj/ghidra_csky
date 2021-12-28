### 32 Bit
#### Data operation
##### add-subtract
- [x] ADDU32 Add unsigned
- [x] ADDC32 Add with carry unsigned
- [x] ADDI32 Add immediate unsigned
- [x] SUBU32 Subtract unsigned
- [x] SUBC32 Subtract with borrow unsigned
- [x] SUBI32 Subtract immediate unsigned
- [ ] RSUB32 Reverse subtract
- [ ] IXH32 Index half-word
- [ ] IXW32 Index word
- [ ] IXD32 Index double word
- [x] INCF32 C=0 add immediate
- [x] INCT32 C=1 add immediate
- [x] DECF32 C=0 subtract immediate
- [x] DECT32 C=1 subtract immediate
- [ ] DECGT32 Set C bit when greater than zero in subtraction
- [ ] DECLT32 Set C bit when smaller than zero in subtraction
- [ ] DECNE32 Set C bit when not equal to zero in subtraction
##### logical operation
- [x] AND32 Bitwise AND
- [x] ANDI32 Bitwise AND immediate
- [x] ANDN32 Bitwise AND-NOT
- [x] ANDNI32 Bitwise AND-NOT immediate
- [x] OR32 Bitwise OR
- [x] ORI32 Bitwise OR immediate
- [x] XOR32 Bitwise XOR
- [x] XORI32 Bitwise XOR immediate
- [x] NOR32 Bitwise NOT-OR
- [x] NOT32 Bitwise NOT
##### shift
- [x] LSL32 Logical shift left
- [x] LSLI32 Logical shift left immediate
- [ ] LSLC32 Logical shift left immediate to C
- [x] LSR32 Logical shift right
- [x] LSRI32 Logical shift right immediate
- [ ] LSRC32 Logical shift right immediate to C
- [x] ASR32 Arithmetic shift right
- [x] ASRI32 Arithmetic shift right immediate
- [ ] ASRC32 Arithmetic shift right immediate to C
- [x] ROTL32 Rotate left
- [x] ROTLI32 Rotate left immediate
- [ ] XSR32 Extended shift right
##### compare
- [x] CMPNE32 Compare unequal
- [x] CMPNEI32 Compare unequal immediate
- [x] CMPHS32 Compare unsigned when greater or equal
- [x] CMPHSI32 Compare immediate unsigned when greater or equal
- [x] CMPLT32 Compare signed when smaller
- [x] CMPLTI32 Compare immediate signed when smaller
- [ ] TST32 Null-test
- [ ] TSTNBZ32 Register test without byte equal to zero
##### data transfer
- [x] MOV32 Move
- [x] MOVF32 C=0 Move
- [x] MOVT32 C=1 Move
- [x] MOVI32 Move immediate
- [x] MOVIH32 Move immediate high
- [ ] MTHI32 Write transfer to high bit of accumulator
- [ ] MTLO32 Write transfer to low bit of accumulator
- [ ] MFHI32 Read transfer from high bit of accumulator
- [ ] MFLO32 Read transfer from low bit of accumulator
- [ ] MFHIS32 Read transfer saturate from high bit of accumulator
- [ ] MFLOS32 Read transfer saturate from low bit of accumulator
- [x] MVCV32 C bit reverse move
- [x] MVC32 C bit move
- [ ] MVTC32 Copy overflow bit to C bit
- [ ] CLRF32 C=0 clear
- [ ] CLRT32 C=1 clear
- [x] LRW32 Memory read-in
- [x] GRS32 Sign generation
##### bit operation
- [x] BCLRI32 Bit clear immediate
- [x] BSETI32 Bit set immediate
- [x] BTSTI32 Bit test immediate
##### extract and insert
- [x] ZEXT32 Extract bit and extend unsigned
- [x] SEXT32 Extract bit and extend signed
- [ ] INS32 Bit insert
- [ ] ZEXTB32 Extract byte and extend unsigned
- [ ] ZEXTH32 Extract half-word and extend unsigned
- [ ] SEXTB32 Extract byte and extend signed
- [ ] SEXTH32 Extract half-word and extend signed
- [ ] XTRB0.32 Extract byte 0 and extend unsigned
- [ ] XTRB1.32 Extract byte 1 and extend unsigned
- [ ] XTRB2.32 Extract byte 2 and extend unsigned 
- [ ] XTRB3.32 Extract byte 3 and extend unsigned
- [ ] BREV32 Bit-reverse
- [ ] REVB32 Byte-reverse
- [ ] REVH32 Half-word byte-reverse 
##### Mutliply-divide
- [ ] MULU32 Multiply unsigned
- [ ] MULUA32 Multiply-accumulate unsigned
- [ ] MULUS32 Multiply-subtract unsigned
- [ ] MULS32 Multiply signed
- [ ] MULSA32 Multiply-accumulate signed
- [ ] MULSS32 Multiply-subtract signed
- [ ] MULSH32 16-bit multiply signed
- [ ] MULSHA32 16-bit multiply-accumulate signed
- [ ] MULSHS32 16-bit multiply-subtract signed
- [ ] MULSW32 16x32 multiply signed
- [ ] MULSWA32 16x32 multiply-accumulate signed
- [ ] MULSWS32 16x32 multiply-subtract signed
- [ ] VMULSH32 16-bit multiply signed in two branches
- [ ] VMULSHA32 16-bit multiply-accumulate signed in two branches
- [ ] VMULSHS32 16-bit multiply-subtract signed in two branches
- [ ] VMULSW32 16x32 multiply signed in two branches
- [ ] VMULSWA32 16x32 multiply-accumulate signed in two branches
- [ ] VMULSWS32 16x32 multiply-subtract signed in two branches
- [x] MULT32 Multiply
- [x] DIVU32 Divide unsigned
- [x] DIVS32 Divide signed
##### miscellaneous operation
- [ ] ABS32 Absolute value
- [ ] FF0. 32 Fast find 0
- [ ] FF1. 32 Fast find 1
- [ ] BMASKI32 Bit mask generation immediate
- [ ] BGENR32 Register bit generation
- [ ] BGENI32 Bit generation immediate
#### Branch Jump
##### branch
- [x] BT32 C=1 branch instruction
- [x] BF32 C=0 branch instruction
- [x] BEZ32 Branch instruction when register is equal to zero
- [x] BNEZ32 Branch instruction when register is not equal to zero
- [x] BHZ32 Branch instruction when register is greater than zero
- [x] BLSZ32 Branch instruction when register is smaller than or equal to zero
- [x] BLZ32 Branch instruction when register is smaller than zero
- [x] BHSZ32 Branch instruction when register is greater than or equal to zero
##### jump
- [x] BR32 Unconditional jump
- [x] BSR32 Jump to subprogram
- [x] JMPI32 Jump indirect
- [x] JSRI32 Jump to subprogram indirect
- [x] JMP32 Register jump
- [x] JSR32 Register jump to subprogram
- [x] RTS32 Link register jump
- [ ] JMPIX32 Register index jump
#### Memory Access
##### Immediate operand offset access
- [x] LD32.B Load unsigned and extended byte
- [x] LD32.BS Load signed and extended byte
- [x] LD32.H Load unsigned and extended half-word
- [x] LD32.HS Load signed and extended half-word
- [x] LD32.W Load word
- [x] LD32.D Load double word
- [x] ST32.B Store byte
- [x] ST32.H Store half-word
- [x] ST32.W Store word
- [x] ST32.D Store double word
##### Vector register offset access
- [x] LDR32.B Load unsigned and extended byte in register offset addressing
- [x] LDR32.BS Load signed and extended byte in register offset addressing
- [x] LDR32.H Load unsigned and extended half-word in register offset addressing
- [x] LDR32.HS Load signed and extended half-word in register offset addressing
- [x] LDR32.W Load word in register offset addressing
- [x] STR32.B Store byte in register offset addressing
- [x] STR32.H Store half-word in register offset addressing
- [x] STR32.W Store word in register offset addressing
##### Multi-register access
- [ ] LDQ32 Load consecutive quad word
- [ ] LDM32 Load consecutive multiword
- [ ] STQ32 Store consecutive quad word
- [ ] STM32 Store consecutive multiword
- [x] PUSH32 Push
- [x] POP32 Pop
##### Exclusive access 
- [ ] LDEX32.W Load word exclusive
- [ ] STEX32.W Store word exclusive
- [ ] LRS32.B Load byte sign
- [ ] LRS32.H Load half-word sign
- [ ] LRS32.W Load word sign
- [ ] SRS32.B Store byte sign
- [ ] SRS32.H Store half-word sign
- [ ] SRS32.W Store word sign
#### Co-processor
##### co-processor data transfer
- [ ] CPRGR32 Read transfer from general-purpose register of co-processor
- [ ] CPWGR32 Write transfer to general-purpose register of co-processor
- [ ] CPRCR32 Read transfer from control register of co-processor
- [ ] CPWCR32 Write transfer to control register of co-processor
- [ ] CPRC32 Read transfer from condition bit of co-processor
##### co-processor memory access
- [ ] LDCPR32 Load word to co-processor
- [ ] STCPR32 Store word in co-processor
##### co-processor operation
- [ ] CPOP32 Co-processor operation instruction
#### Privileged instruction
##### control register operation
- [ ] MFCR32 Read from control register
- [ ] MTCR32 Write to control register
- [ ] PSRSET32 Set PSR bit
- [ ] PSRCLR32 Clear PSR bit
##### Low power consumption
- [ ] WAIT32 Enter low power consumption wait mode
- [ ] DOZE32 Enter low power consumption doze mode
- [ ] STOP32 Enter low power consumption stop mode
##### Abnormal return
- [ ] RTE32 Return from abnormal and normal interrupt
- [ ] RFI32 Return from fast interrupt
##### Safe state
- [ ] STRAP32 Enter safe state
- [ ] SRTE32 Return from safe state
#### Special Function
- [ ] SYNC32 Synchronize CPU
- [ ] BKPT32 Breakpoint instruction
- [ ] SCE32 Set conditional execution
- [ ] IDLY32 Ban interrupt identification
- [ ] TRAP32 Unconditional operating system trap
- [ ] PLDR32 Prefetch read data
- [ ] PLDW32 Prefetch write data
- [ ] WE32 Wait event
- [ ] SE32 Send event
- [ ] BMSET32 Set BCTM bit
- [ ] BMCLR32 Clear BCTM bit

### 16 Bit
#### Data Operation
##### add- substract
- [x] ADDU16 Add unsigned
- [x] ADDC16 Add with carry unsigned
- [x] ADDI16 Add immediate unsigned
	- [x] ADDI16 (sp)
- [x] SUBU16 Subtract unsigned
- [x] SUBC16 Subtract with borrow unsigned
- [x] SUBI16 Subtract immediate unsigned
#####  logcial operation
- [x] AND16 Bitwise AND
- [x] ANDN16 Bitwise AND-NOT
- [x] OR16 Bitwise OR
- [x] XOR16 Bitwise XOR
- [x] NOR16 Bitwise NOT-OR
- [x] NOT16 Bitwise NOT
##### shift
- [x] LSL16 Logical shift left
- [x] LSLI16 Logical shift left immediate
- [x] LSR16 Logical shift right
- [x] LSRI16 Logical shift right immediate
- [x] ASR16 Arithmetic shift right
- [x] ASRI16 Arithmetic shift right immediate
- [x] ROTL16 Rotate left
##### compare
- [x] CMPNE16 Compare unequal
- [x] CMPNEI16 Compare unequal immediate
- [x] CMPHS16 Compare unsigned when greater or equal
- [x] CMPHSI16 Compare immediate unsigned when greater or equal
- [x] CMPLT16 Compare signed when smaller
- [x] CMPLTI16 Compare immediate signed when smaller
- [ ] TST16 Null-test
- [ ] TSTNBZ16 Register test without byte equal to zero
##### data transfer
- [x] MOV16 Move
- [x] MOVI16 Move immediate
- [x] MVCV16 C bit reverse move
- [x] LRW16 Memory read-in
##### bit operation
- [x] BCLRI16 Bit clear immediate
- [x] BSETI16 Bit set immediate
- [x] BTSTI16 Bit test immediate
##### extract and insert 
- [x] ZEXTB16 Extract byte and extend unsigned
- [x] ZEXTH16 Extract half-word and extend unsigned
- [x] SEXTB16 Extract byte and extend signed
- [x] SEXTH16 Extract half-word and extend signed
- [x] REVB16 Byte-reverse
- [x] REVH16 Half-word byte-reverse
##### multiply-divide
- [x] MULT16 Multiply
- [x] MULSH16 16-bit multiply signed
#### Branch jump
##### branch
- [x] BT16 C=1 branch instruction
- [x] BF16 C=0 branch instruction
##### jump
- [x] BR16 Unconditional jump
- [x] JMP16 Register jump
- [x] JSR16 Register jump to subprogram
- [x] RTS16 Link register jump
- [ ] JMPIX16 Register index jump
#### Memory Access
##### immediate operand offset access
- [x] LD16.B Load unsigned and extended byte
- [x] LD16.H Load unsigned and extended half-word
- [x] LD16.W Load word
	- [x] LD16.W (SP)
- [x] ST16.B Store byte
- [x] ST16.H Store half-word
- [x] ST16.W Store word
	- [x] ST16.W (SP)
##### multi-register access
- [x] POP16 Pop
- [x] PUSH16 Push
##### Binary translated stack 
- [ ] BPUSH16.H Binary push of translated half-word
- [ ] BPUSH16.W Binary push of translated word
- [ ] BPOP16.H Binary pop of translated half-word
- [ ] BPOP16.W Binary pop of translated word
#####  interrupt nesting acceleration
- [ ] NIE Interrupt nesting enable
- [ ] NIR Interrupt nesting return
- [ ] IPUSH Interrupt push
- [ ] IPOP Interrupt pop

### Float
TBD
