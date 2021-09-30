#a python program which takes an array of registration numbers as input and outputs the missing registration Id
'''
Program No.        : LS:06 IL: 04
Program Name        : 6inlab4.py
Author                 : Eswar
Date                     : 29/05/2021
topics                   : introduction to lists, creating a list
		       accessing and changing list items, slicing and splitting list
		       list operators and methods
'''
n = int(input("Enter the number of values:"))
print("Enter the values: ")
a = list(map(int, input().split()))
a.sort()
flag = 0
for i in range(0,n-1,2):
    if a[i]!=a[i+1]:
        flag = 1
        print(a[i])
        break
if flag==0:
    print(a[n-1])
