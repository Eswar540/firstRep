#a python program to remove comments from a file
'''
Program No.        : LS:011 PL: 01
Program Name    : 11polab1.py
Author                 : Eswar
Date                    : 15/05/2021
topics                  : Files, reading a file, writing a file
'''
try:
    old = open(input("Enter File Name: "), mode='r')
    new = open(input("Enter new file name: "), mode='x')
    for line in old:
        for char in line:
            if char == '#':
                break
            new.write(char)
    print("New file has been created after removing all the comments")
except:
    print("File does not exist/ Another File Exists with new file name")
