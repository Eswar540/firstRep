# a python program that determines whether a positive integer is perfect or not
'''
Program No.        : LS:10 PL: 01
Program Name     : 10polab1.py
Author                 : Eswar
Date                     : 15/05/2021
topics                   : Exception handling
'''


class NotPerfectError(Exception):
    def __init__(self, value):
        self.value = value


while True:
    try:
        def isPerfect(n):
            tot = 1
            i = 2
            while i * i <= n:
                if n % i == 0:
                    tot += i + n / i
                i += 1
            if tot == n and n != 1:
                print(f"{n} is a perfect number")
            else:
                raise NotPerfectError(n)


        n = input("Enter a number: ")
        if n == "":
            break
        else:
            isPerfect(int(n))
    except NotPerfectError as np:
        print(f"{np.value} is not a perfect number")
