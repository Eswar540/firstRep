#a python program to capitalize a given string
'''
Program No.        : LS:03 PoL:01
Program Name        : 3polab1.py
Author              : Afrose Hussain
Date                 : 15/05/2021
topics               : Creating a string, Slicing and splitting strings
                        String operators, Accesing a strings, String methods
'''
def capital(a):
    spl = ".!?"
    a = a.capitalize()
    flag = 0
    for x in range(len(a)):
        if flag == 1 and a[x] != ' ':
            a = a[: x] + a[x].upper() + a[x+1:]
            flag = 0
        if a[x] == 'i':
            if x == 0 and a[x + 1] == ' ':
                a = a[: x] + 'I' + a[x+1:]
                continue
            if x == len(a) - 1 and a[x - 1] == ' ':
                a = a[: x] + 'I' + a[x+1:]
                continue
            if a[x - 1] == ' ' and a[x + 1] == ' ':
                a = a[: x] + 'I' + a[x+1:]
                continue
        if a[x] in spl and x != len(a) - 1:
            flag = 1
    return a

def main():
    a = input("Enter a sentence: ")
    print("The capitalized sectence is:")
    print(capital(a))

main()
