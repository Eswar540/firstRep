#A program

"""
Program Number    	  : LS-02 PL-02
Program Name    		    : 2polab2.py
Author            		  : Eswar
Date           		     : 08/05/2021
Topics Covered  		    : Variables
                    		  Data Types
                  		    Operators
                    		  Control Statements
"""
#importing package
import random
secret = random.randrange(0,100)
guess = 0
try_count = 0
win = False
while(win == False) :
    guess = int(input("Enter your guess : "))
    try_count += 1
    if(guess == secret) :
        win = True
    if(guess > secret) :
        print("Too High")
    if(guess < secret) :
        print("Too Low")

print("You won!!")
print("You made " + str(try_count) + " tries")
print("Thank You")
