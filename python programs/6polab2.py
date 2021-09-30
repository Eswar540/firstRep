# a python program to help him find the answer for the same to evaluate the students.
'''
Program No.        : LS:06 PL: 02
Program Name       : 6polab2.py
Author                 : Eswar
Date                    : 29/05/2021
topics                  : introduction to lists, creating a list, accessing and changing list items,
		                 slicing and splitting list, list operators and methods
'''


def isNonDecreasing(a):
    for i in range(1, len(a)):
        if a[i] >= a[i - 1]:
            continue
        return False
    return True


def sub_lists(l):
    c = 0
    for i in range(len(l) + 1):
        for j in range(i):
            if isNonDecreasing(l[j:i]):
                c += 1
    return c


n = int(input("Enter n:"))
a = list(map(int, input("Enter n numbers seperated with space:").split()))
print(sub_lists(a))
