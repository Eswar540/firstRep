#python program to calculate the area and circumference of the Triangle/Rectangle
"""
    Program No.              	 :LS:01 IL:03
    Program Name            :Practice2.py
    Author              	:Eswar
    Date                	:24/04/2021
    Topics         	             :Python Software Installation
                         		Python Environment Setup
                         		Python Program Structure
                         		Python Execution

"""
#area of the triangle
b=int(input("Enter the base of the Triangle:"))
h=int(input("Enter the height of the Triangle:"))
area=(1/2)*b*h
print("Area of the Triangle:",area)

#circumference of the triangle
ct=3*b
print("The circumference of the triangle:",ct)

#area of the rectangle
l=int(input("Enter the length of the rectangle:"))
b=int(input("Enter the breadth of the rectangle:"))
area=l*b
print("The area of the rectangle is:",area)

#circumference of the rectangle
cr=2*(l+b)
print("The circumference of the rectangle is:",cr)
