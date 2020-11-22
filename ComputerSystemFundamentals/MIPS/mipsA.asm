.data
	str1: .asciiz "Please input your name: "
	str2: .asciiz "Please input your ID: "
	str3: .asciiz "Your name is "
	str4: .asciiz "Your ID is "
	name: .space 20
.text
	li $v0,4  #print str1
	la $a0,str1
	syscall
	li $v0,8  #get input --> name
	la $a0, name
	li $a1, 20
	syscall
	li $v0,4 #print str2
	la $a0, str2
	syscall
	li $v0, 5 #get input --> ID
	syscall
	add $s0, $v0, 0  #read id --> s0
	li $v0, 4
	la $a0, str3 #print str3
	syscall
	li $v0, 4
	la $a0, name #print name
	syscall
	li $v0, 4    
	la $a0, str4  #print str4
	syscall
	add $a0, $s0, 0  
	li $v0, 1   #print ID
	syscall