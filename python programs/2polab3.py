"""
Program Number      	: LS-02 PL-03
Program Name    	    : 2polab3.py
Author          		    : Eswar
Date             		   : 08/05/2021
Topics Covered   	   : Variables
                    		    Data Types
                  		    Operators
                 		     Control Statements
"""
P = int(input("Enter principle amount : "))
R = float(input("Enter rinterest rate per month : "))
N = int(input("Enter number of months : "))
if(P == 0) :
    print("null")
else :
    R = R/(12*100)
    emi = (P*R*((1+R)**N))/(((1+R)**N)-1)
    print("%.1f"%(emi))
