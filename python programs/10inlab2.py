#a python program to solve the roots of a quadratic function and generate exceptions whenever necessary
'''
Program No.        : LS:10 IL: 02
Program Name    : 10inlab2.py
Author                 : Eswar
Date                     : 15/05/2021
topics                   :
'''
import math
try:
	a,b,c = map(int, input("Enter a,b,c values: ").split())
	if a==0:
		raise ZeroDivisionError("a value cannot be zero")
	dis = (b**2)-(4*a*c)
	if dis<0:
		raise ValueError("It does not have real roots")
	dis = math.sqrt(dis)
	root1 = (-b-dis)//(2*a)
	root2 = (-b+dis)//(2*a)
	print(f"The roots of the given quadratic function are {root1} and {root2}")
except ZeroDivisionError as z:
	print(z)
except ValueError as v:
	print(v)
