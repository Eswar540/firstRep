"""
Program Number      : LS-05 IN-4
Program Name        : 5inlab4.py
Author              : Eswar
Date                : 29/05/2021
Topics Covered      : Creating functions
                      Parameters and return values 
                      Keyword arguments 
                      global and local variables
"""
#function to return the precedence of an operator
def precedence(s) :
    if(len(s) != 1) :
        return -1
    elif(s == '+' or s == '-') :
        return 1
    elif(s == '*' or s == '/') :
        return 2
    elif(s == '^') :
        return 3
    else :
        return -1

#Driver Code
s = input("Enter the operator : ")
if(precedence(s) == -1) :
    print("Input is not an operator")
else :
    print("Precedence of " + s + " is",precedence(s))

