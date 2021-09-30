#a python program to list all the files in the given directory along with their length and last modification time
'''
Program No.        : LS:09 PL: 02
Program Name    : 9polab2.py
Author                 : Eswar
Date                    : 15/05/2021
topics                  : creating and working with modules
'''
import os
import datetime
with os.scandir('.') as it:
    for entry in it:
        if not entry.name.startswith('.') and entry.is_file():
            print(entry.name, "\t\t", entry.stat().st_size, "\t\t", datetime.datetime.fromtimestamp(entry.stat().st_ctime).strftime("%d-%B-%Y"))
