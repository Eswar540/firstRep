
			#A python program for calculating electricity bill
"""
Program Number           	 : LS-02 IL-04
Program Name                 : 2inlab4.py
Author           		   : Eswar
Date            		    : 08/05/2021
Topics Covered   	   : Variables
                 		     Data Types
                      Operators
                      Control Statements
                      Loops
"""
no_watts = int(input("Enter number of watts consumed : "))
total = (no_watts*24*30)/1000
rate = 0
if(total < 100) :
    rate = 3
elif(total < 200) :
    rate = 5
else :
    rate = 7
cost = total*rate
print("The total cost of Electricity bill is Rs. " + str(cost))
