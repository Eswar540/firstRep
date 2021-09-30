"""
Program Number               : LS-02,PL-01
Program Name   	     : 2polab1.py
Author           		   : Eswar
Date            		    : 08/05/2021
Topics Covered   	   : Variables
                 		     Data Types
                 		     Operators
                 		     Control Statements
                		      Loops
"""
# Python3 program to generate pythagorean
# triplets smaller than a given limit

# Function to generate pythagorean
# triplets smaller than limit
def pythagoreanTriplets(limits):
    c, m = 0, 2

    # Limiting c would limit
    # all a, b and c
    while c < limits:

        # Now loop on n from 1 to m-1
        for n in range(1, m):
            a = m * m - n * n
            b = 2 * m * n
            c = m * m + n * n

            # if c is greater than
            # limit then break it
            if c > limits:
                break

            print(a, b, c)

        m = m + 1
limit = int(input("Enter the limit:"))
pythagoreanTriplets(limit)
