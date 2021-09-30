# a python Program to filter dates
'''
Program No.        : LS:07 PL: 02
Program Name    : 7polab2.py
Author                 : Eswar
Date                    : 29/05/2021
topics                  : introduction to tuples, creating a tuple, accessing and slicing tuple items indirectly,
                              slicing and splitting a tuple, packing and unpacking a tuple, tuple operators, tuple methods
'''
import datetime

n = int(input("Enter number of cargos:"))
print("Enter Cargo Name,departure date:")
a = []
for i in range(n):
    a.append(tuple(input().split(",")))

filter_date = datetime.datetime.strptime(input("Enter filter date:"), "%d-%m-%Y")

print(a)
for cargo in a:
    if datetime.datetime.strptime(cargo[1], "%d-%m-%Y") > filter_date:
        print(cargo[0])
