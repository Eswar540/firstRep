#A python program to print the elements of an array present on odd position
'''
Program No.          : LS:04 PoL: 03
Program Name         : 4polab3.py
Author               : Eswar
Date                 : 12/06/2021
topics               : Creating arrays, processing the array elements
                        Slice and range operator, array operations
'''
a = list(input("Enter an array: ").split())
print("The elements at odd position are: ",end=" ")
for i in range(0, len(a), 2):
    print(a[i], end= " ")
