# a python program that takes a name converts it into a slug
'''
Program No.        : LS:09 PL: 01
Program Name    : 9polab1.py
Author                 : Eswar
Date                    : 15/05/2021
topics                  : creating and working with modules
'''
import re


def make_slug(s):
    s = re.sub("[#!@$%^&*() ]", "-", s).strip('-')
    s = re.sub("-+", "-", s)
    return s


head = input("Enter a blog heading: ")
print(make_slug(head))
