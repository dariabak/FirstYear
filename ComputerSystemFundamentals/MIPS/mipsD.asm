.data 
        str1: .asciiz "Orc "
        str2: .asciiz "Dragon "
        str3: .asciiz "Sword "

.text   
	li $t1, 1
	begin:
	li $a1, 12   #generate random number 1 - 12
	li $v0, 42
	syscall
	add $s0, $a0, 1   #save input --> $s0
	#$s0:1,2,3,4,5 dragon
	#$s0:6,7,8 sword
	#$s0: 9,10,11,12 orc
	blt $s0, 6 dragon    #if $s0 is less than 6, then go to dragon
	blt $s0, 9 sword     #if $s0 is less than 9, then go to sword
	blt $s0, 12 orc       #if $s0 is less than 12, then go to orc

	orc:  
	li $v0, 4  #print "orc"
	la $a0, str1
	syscall
	j somewhere #jump to somewhere

	dragon:
	li $v0, 4 #print "dragon"
	la $a0, str2
	syscall
	j somewhere #jump to somewhere

	sword:
	li $v0, 4  #print "sword"
	la $a0, str3
	syscall
	j somewhere #jump to somewhere

	somewhere:
	sub $t1, $t1, 1
	beqz $t1, begin  #if $t1 = 0, then go to begin

	

