#Program to find and print the maximum integer of the array
"""
Program Number      : LS-04 IN-2
Program Name        : 4inlab2.py
Author              : Eswar
Date                :
Topics Covered      : Creating arrays
                      Processing arrays
                      range slice operators
                      array operations
"""
#input number of elements
n = int(input("Enter number of elements : "))
arr = []
for i in range(n) :
    arr.append(int(input("Enter %d element : "%(i+1))))

max = arr[0]
for i in arr :
    if (i > max) :
        max =i

print("Largest element :",max)

#Find the odd position elements and even position elements sums
oddsum = 0
evensum = 0
print("Even position elements")
for i in range(0,n,2) :
    print(arr[i],end = ' ')
    evensum += arr[i]
print("\nEven position elements sum :",evensum)
print("Odd position elements")
for i in range(1,n,2) :
    print(arr[i],end = ' ')
    oddsum += arr[i]
print("\nOdd position elements sum :",oddsum)