#Program for equilibrium index of an array
"""
Program Number      : LS-04 IN-1
Program Name        : 4inlab1.py
Author              : Eswar
Date                : 
Topics Covered      : Creating arrays
                      Processing arrays
                      range slice operators
                      array operations
"""
#define a function to find equilibrium index
def equilibrium(arr) :

    n = len(arr)

    #check for index one by one until we find equilibrium index
    for i in range(n) :
        leftsum = 0
        rightsum = 0

        #get left sum value
        for j in range(i) :
            leftsum += arr[j]

        #get right sum value
        for j in range(i+1,n) :
            rightsum += arr[j]

        #Check if leftsum and rightsum are same
        if(leftsum == rightsum) :
            return i
    return -1

#Driver Code
arr = [int(x) for x in input("Enter array : ").split(',')]
l = equilibrium(arr)
if(l == -1) :
    print("No equilibrium")
else :
    print("Equilibrium index :",l)