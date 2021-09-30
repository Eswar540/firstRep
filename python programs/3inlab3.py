# Python program to check password
"""
Program Number     	 : LS-03 IL-03
Program Name        	:3inlab3.py
Author              	:Eswar
Date                		: 15/05/2021
Topics Covered      : Strings
                      	 Slicing and Splitting String
                    	  String Operators
                	  Accessing a String
                     	 String Methods
"""


def password_checker(password):
    splsym = ['!', '@', '#', '$', '%', '&', '*']
    val = True
    apl = 0
    dig = 0
    spl = 0
    for i in password:
        if (i.isalpha()):
            apl += 1
        elif (i.isdigit()):
            dig += 1
        else:
            spl += 1
    if (dig < 2):
        print("Password should have atleast two numbers")
        val = False
    if (apl < 2):
        print("Password should have atleast two characters")
        val = False
    if (len(password) < 7):
        print("Length of the password should be atleast 7 characters")
        val = False
    if not any(char.isupper() for char in password):
        print("Password should have atleast one uppercase letter")
        val = False
    c = 0
    for char in password:
        if char in splsym:
            c += 1
    if (c < 2):
        print("Password should have atleast two characters from",splsym)
        val = False

    if (val):
        return val


# Driver code
password = input("Enter the password  : ")
if (password_checker(password)):
    print("Password is Strong")
else:
    print("Password is invalid")
