# A python program for copartners train problem statement

"""
Program Number   	   : LS-02 IL-03
Program Name     	   : 2inlab3.py
Author          		    : Eswar
Date         	   	    : 08/5/2021
Topics Covered   	   : Variables
                      Data Types
                      Operators
                      Control Statements
"""
#create a dictionary
compartment = {1:"LB",2:"MB",3:"UB",4:"LB",5:"MB",6:"UB",7:"SL",8:"SU"}

t = int(input("Enter number of test cases : "))
for i in range(t):
    n = int(input("Enter seat number : "))
    k = n%8
    if(k == 1 or k == 2 or k == 3):
        n += 3
    elif(k == 7):
        n += 1
    elif(k == 0):
        n -= 1
    else :
        n -= 3
    print(str(n) + " " + compartment.get(k))
