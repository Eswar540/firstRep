#develop a python program that reads a temperature value in celcius degrees from the keyboard and covert to forenhiet
"""
    Program No.    	 :LS:02 IL:01
    Program Name           : 2inlab1.py
    Author         		 :Eswar
    Date            		:08/05/2021
    Topics         	             :Variables,Data types,operators,control statements
"""
#collect the input from the user in celsius
celsius=float(input("Enter the temperature in Celsius:"))
#calculate the temperature in Fahrenheit
fahreinheit=(celsius*(9/5))+32
print("%0.1f celsius is equal to the %.1f fahrenheit" %(celsius,fahreinheit))
