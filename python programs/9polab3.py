# a python program to print directory tree
'''
Program No.        : LS:09 PL: 03
Program Name    : 9polab3.py
Author                 : Eswar
Date                    : 15/05/2021
topics                 : creating and working with modules
'''
import os

path = input("Enter the path of directory:")
for dirname, dirnames, filenames in os.walk(path):
    # print path to all subdirectories first.
    for subdirname in dirnames:
        print(os.path.join(dirname, subdirname))

    # print path to all filenames.
    for filename in filenames:
        print(os.path.join(dirname, filename))

