.data 
	str1: .asciiz  "Please  write in one 4-digit number "
	answer: .asciiz "The answer is "
	num: .float 3.3

.text 
	li $v0, 4   #print str1
	la $a0, str1 
	syscall
	li $v0, 5  #get input a number
	syscall
	add $s0, $v0, 0   #read in a num --> $s0
	li $v0, 4  #print answer
	la $a0, answer
	syscall
	mtc1 $s0, $f0 #move $s0 to coprocessor1’s register $f0
	cvt.s.w $f0, $f0 #convert to 32-bit
	l.s $f1, num  #load 3.3
	div.s $f12, $f0, $f1  #divide user’s number by 3.3
	li $v0, 2  #print answer
	syscall
