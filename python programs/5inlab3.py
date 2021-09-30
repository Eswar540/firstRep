#Program to print N numbers using recursive function
"""
Program Number      : LS-05 IN-3
Program Name        : 5inlab3.py
Author              : Eswar
Date                : 29/05/2021
Topics Covered      : Creating functions
                      Parameters and return values 
                      Keyword arguments 
                      global and local variables
"""

#defining a function
def printnumbers(n) :
    if(n == 0) :
        return
    else :
        printnumbers(n-1)
        print(n, end=' ')

#Driver Code
n = int(input("Enter n : "))
print("Seating stickers : ")
printnumbers(n)