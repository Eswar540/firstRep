#a python program that sums all of the numbers entered by the user while ignoring any lines entered by the user that are not valid numbers
'''
Program No.        : LS:10 IL: 01
Program Name    : 10inlab1.py
Author                 : Eswar
Date                     : 15/05/2021
topics                  :
'''
x = input("Enter: ")
tot = 0
try:
	while True:
		if x=="":
			raise EOFError("The input has been completed")
		elif x.isdigit():
			tot += int(x)
			print(f"total: {tot}")
		else:
			print("Invalid input, only numbers allowed")
		x = input("Enter: ")
except EOFError as e:
	print(e)
