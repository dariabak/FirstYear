.data
	str1: .asciiz "Please input 2 first numbers of your ID "
	str2: .asciiz "The nearest integer of the quotient "

.text
	li $v0, 4
	la $a0, str1 #print str1
	syscall
	li $v0, 5  #get input --> number
	syscall
	add $s0, $v0, 0  #save input -> $s0
	li $s1, 2
	div $s0, $s1
	mflo $t0   #quotient is in $t0
	mfhi $t1   #remainder is in $t1
	beqz $t1 print  #if $t1 = 0, go to print
	add $t0, $t0, 1  #if not add 1 to $t0
	j print   #then go to print

print:   li $v0, 4
 	la $a0, str2  #print str2
	syscall
	add $a0, $t0, 0  #print $t0
	li $v0, 1
	syscall