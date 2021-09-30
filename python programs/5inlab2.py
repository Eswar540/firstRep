#Program to convert integer to ordinal number
"""
Program Number      : LS-05 IN-2
Program Name        : 5inlab2.py
Author              : Eswar
Date                : 
Topics Covered      : Creating functions
                      Parameters and return values 
                      Keyword arguments 
                      global and local variables
"""

#defining the function
def myfun(n) :
    s = str(n)
    if(n == 1) :
        return s + "st"
    elif(n == 2) :
        return s + "nd"
    elif(n == 3) :
        return s + "rd"
    elif(n > 3 and n < 13) :
        return s + "th"
    else :
        return ''

#Driver Code
n = int(input("Enter an integer : "))
print(myfun(n))