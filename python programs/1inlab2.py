	#A python script to calculate area,diameter,and circumference of a circle
"""
  	 Program No.               :LS:01 IL:02
    Program Name           :1inlab2.py
   	 Author 	             : Eswar
   	 Date            		 :24/04/2021
   	 Topics          		 : Python Software Installation
                     			   Python Environment Setup
                     			   Python Program Structure
                     			   Python Execution
"""
Pi=3.14
radius=float(input("Enter the radius of circle:"))
area=Pi*radius*radius
diameter=2*radius
circumference=2*Pi*radius
print("Area of a circle %.2f" %area)
print("circumference of the circle %.2f" %circumference)
print("diameter of the circle %.2f" %diameter)
