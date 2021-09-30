"""
Program Number      : LS-04 IN-3
Program Name        : 4inlab3.py
Author              : Eswar
Date                :
Topics Covered      : Creating arrays
                      Processing arrays
                      range slice operators
                      array operations
"""
#Input the number of rotations
s = int(input("Enter number of shifts : "))

#Reading array
print("Enter array")
arr = [int(x) for x in input().split(' ')]

print("Original array :")
for i in arr :
    print(i,end = ' ')
print()

for i in range(s) :
    arr.append(arr[0])
    arr.remove(arr[0])

print("Rotated array :")
for i in arr :
    print(i,end = ' ')
print()