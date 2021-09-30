#a python program to count all the vowels, consonants, digits and special character in string
'''
Program No.        : LS:03 PoL: 03
Program Name        : 3polab3.py
Author               : Eswar
Date                 : 15/05/2021
topics               : Creating a string, Slicing and splitting strings
                        String operators, Accesing a strings, String methods
'''
a = input("Enter a string: ")
vow = "aeiouAEIOU"
v,c,d,s = 0,0,0,0
for i in a:
    if i.isalpha() and i in vow:
        v+=1
    elif i.isalpha() and i not in vow:
        c+=1
    elif i.isdigit():
        d+=1
    else:
        s+=1
print(f"Vowels: {v}")
print(f"Consonants: {c}")
print(f"Digits: {d}")
print(f"Special Characters: {s}")
