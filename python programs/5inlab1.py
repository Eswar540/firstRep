#Program to find the length od the hypotenuse of a right angle triangle
"""
Program Number      : LS-05 IN-1
Program Name        : 5inlab1.py
Author              : Eswar
Date                : 
Topics Covered      : Creating functions
                      Parameters and return values 
                      Keyword arguments 
                      global and local variables
"""
#import math module for sqrt
import math

#defining a function
def hypotenuse(a,b) :
    return math.sqrt(a*a + b*b)

#Driver Code

print("Lenghts of the shorter sides of the triangle :")
a = int(input("a : "))
b = int(input("b : "))
print("The lenght of the hypotenuse is",hypotenuse(a,b))

