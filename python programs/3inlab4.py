#a python program to implement a cipher
'''
Program No.        : LS:03 IL:04
Program Name        : 3inlab4.py
Author              : Eswar
Date                : 15/05/2021
topics              : Creating a string, Slicing and splitting strings
                     String operators, Accesing a strings, String methods
'''
import string
n = int(input("Enter the no. of shifts: "))
a = list(input("Enter the message: "))
x = string.ascii_lowercase
y = string.ascii_uppercase
for i in range(len(a)):
    if a[i] in x:
        a[i] = x[(x.index(a[i])+n)%26]
    elif a[i] in y:
        a[i] = y[(y.index(a[i])+n)%26]
print("".join(a))
