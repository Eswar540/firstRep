# a python Program that examines each block and determines the total purchase price by multiplying shares and purchase price of the portfolio
'''
Program No.          : LS:07 PL: 01
Program Name            : 7polab1.py
Author                 : Eswar
Date                     : 29/05/2021
topics                   : introduction to tuples, creating a tuple, accessing and slicing tuple items indirectly,
                               slicing and splitting a tuple, packing and unpacking a tuple, tuple operators, tuple methods
'''
n = int(input("Enter number of block of stocks: "))
print("Enter stock information:")
portfolio = []
for i in range(n):
    portfolio.append(tuple(input().split(",")))

totalPurchasePrice = 0
for stock in portfolio:
    totalPurchasePrice += float(stock[1]) * int(stock[2])
print(totalPurchasePrice)
