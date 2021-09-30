'''
Program No.           : LS:03 IL: 01
Program Name          : 3inlab1.py
Author                 : Eswar
Date                  : 15/05/2021
topics                : String operators
                        Accesing a strings
                        String methods
'''
AA = input("Enter a string: ")
BB = input("Enter another string string: ")
print(len(AA)+len(BB))
if AA>=BB:
    print("Yes")
else:
    print("No")
print(AA.capitalize()+" "+BB.capitalize())

