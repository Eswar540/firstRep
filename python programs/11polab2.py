# a python program to generate two word random password
'''
Program No.        : LS:011 PL: 02
Program Name    : PassGenerator.py
Author                 : Afrose Hussain
Date                     : 15/05/2021
topics                   : Files, reading a file, writing a file
'''
import random

try:
    f = open("passwords.txt", mode='r')
    a = []
    for line in f:
        a.append(line.strip())

    word1 = random.choice(a)
    word2 = random.choice(a)
    while not 8 <= len(word1 + word2) <= 10:
        word1 = random.choice(a)
        word2 = random.choice(a)
    print("One of the two word random password:")
    print(word1.capitalize() + word2.capitalize())
    f.close()
except Exception as e:
    print(e)
