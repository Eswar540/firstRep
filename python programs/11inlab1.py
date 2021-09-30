#a python program displays the first 10 lines of a file whose name is provided as a command line parameter
'''
Program No.        : LS:011 IL: 01
Program Name    : 11inlab1.py
Author                 : Eswar
Date                     : 15/05/2021
topics                   : Files, reading a file, writing a file
'''
try:
    f = open(input("Enter File Name:"), mode='r')
    for i in range(10):
       print(f.readline(), end="")
    f.close()
except:
    print("File does not exist")
