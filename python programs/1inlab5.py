#python script to covert given seconds into the hours,minutes and seconds
"""
    Program No. 	               :LS:01 IL:05
    Program Name   	 : 1inlab5.py
    Author         		 :Eswar
    Date            		 :24/04/2021
    Topics          		 :Python Software Installation
                     	             	 Python Environment Setup
                     		 Python Program Structure
                     		 Python Execution
"""
#import the required modules
import datetime
x=int(input("enter the seconds:"))
print("Given seconds in hours,minutes and seconds",datetime.timedelta(seconds=x))
