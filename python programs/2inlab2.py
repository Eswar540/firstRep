#python program to find the solutions to the qudratic expression(ax^2+bx+c=0) when the values of a,b,c are given
"""
Program No.    	    	  :LS:02 IL:02
Program name  		  : 2inlab2.py
Author        		  :Eswar
Date            		  :08/05/2021
Topics         		 :variables,datatypes,operators and controlstateents
"""
#import required modules
import cmath
a=int(input("Enter a:"))
b=int(input("Enter b:"))
c=int(input("Enter c:"))
d=(b**2)-(4*a*c)
sol1=(-b-cmath.sqrt(d))/(2*a)
sol2=(-b+cmath.sqrt(d))/(2*a)
print("The solution is {} and {}".format(sol1,sol2))
