#given the meal price,tip percent and tax percent for a meal,find and print the meal's total cost
"""
    Program No.      	  :LS:01 PL:01
    Program Name             : 1polab1.py
    Author             	 :Eswar
    Date                	:24/04/2021
    Topics             	 :Python Software Installation
                         		 Python Environment Setup
                         		 Python Program Structure
                       		  Python Execution

"""
mealCost=int(input("Enter the base cost of the meal:"))
tipPercent=int(input("Enter the tip percent:"))
taxPercent=int(input("Enter the tax percent:"))

tip=mealCost*(tipPercent/100)
tax=mealCost*(taxPercent/100)

totalCost=mealCost+tip+tax
print("Total cost of the meal:",int(totalCost))
