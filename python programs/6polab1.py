#a python program that demonstrate your function by displaying all of the sublists of several different lists.
'''
Program No.        : LS:06 PO: 01
Program Name        : 6polab1.py
Author                 : Eswar
Date                     : 29/05/2021
topics                   : introduction to lists, creating a list
		                  accessing and changing list items, slicing and splitting list
		                list operators and methods
'''
def sublist(a):
    n = len(a)
    result = [[]]
    for i in range(n+1):
        for j in range(i):
            result.append(a[j:i])
    return result

def main():
    print("Enter the values in the list: ")
    a = list(map(int, input().split()))
    print(f"The list containing all the sublists of {a} is {sublist(a)}")

main()
