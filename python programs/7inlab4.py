# a python Program to fine cars
'''
Program No.             : LS:07 IL: 04
Program Name           : 7inlab4.py
Author                 : Eswar
Date                    : 29/05/2021
topics                  : introduction to tuples, creating a tuple, accessing and slicing tuple items indirectly,
                        slicing and splitting a tuple, packing and unpacking a tuple, tuple operators, tuple methods
'''


def fine(car_num, date):
    c = 0
    if date % 2 == 0:
        for i in car_num:
            if i % 2 == 1:
                c += 1
    else:
        for i in car_num:
            if i % 2 == 0:
                c += 1
    return c * 250


a = tuple(map(int, input("Enter Car numbers: ").split()))
d = int(input("Enter date: "))

print(fine(a, d))
