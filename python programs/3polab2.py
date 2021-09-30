#a python program to print the abbrevations of the surname
"""
    Program No.   	  :LS:03 PL:02
    Program Name  	  :3polab2.py
    Author       		   :Eswar
    Date         		   :15/05/2021
    Topics         		 :Strings
                      	 Slicing and Splitting String
                    	  String Operators
                	  Accessing a String
                     	 String Methods
"""

name=input("Enter your full name:")
split_name=name.split(' ')
print(split_name[0][0],split_name[1][0],split_name[2])
