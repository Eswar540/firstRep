#python program to check two strings are anagrams or not
"""
    Program No.  	   :LS:03 IL:02
    Program Name  	  :3inlab2.py
    Author      	    :Eswar
    Date          	     :15/05/2021
    Topics       	   :string methods
                        String
                      	 Slicing and Splitting String
                    	  String Operators
                	  Accessing a String
                     	 String Methods

"""
a=input("enter string1:")
b=input("enter string2:")
a.lower()
b.lower()
if a.isalpha() and b.isalpha() and len(a)<=50 and len(b)<=50:
    if len(a)==len(b) and sorted(a)==sorted(b):
        print("two string are anagrams")
    else:
        print("two strings are not anagrams")
