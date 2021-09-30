#a python program that determines whether or not three lengths can form a triangle
'''
Program No.        : LS:10 IL: 03
Program Name    : 10inlab3.py
Author                 : Eswar
Date                     : 15/05/2021
topics                   :
'''
class InvalidLengths(Exception):
	pass

try:
	def checker(a,b,c):
		if c>=a+b:
			raise InvalidLengths
		else:
			print("The triangle formed from the given lengths is valid")
	lengths = list(map(int, input("Enter the lengths: ").split()))
	lengths.sort()
	checker(lengths[0],lengths[1],lengths[2])
except InvalidLengths:
	print("The triangle formed from the given lengths is invalid")

