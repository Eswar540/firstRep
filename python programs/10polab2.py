#a python program that converts from letter grades to grade points
'''
Program No.        : LS:10 PL: 02
Program Name    : 10polab2.py
Author                : Eswar
Date                    : 15/05/2021
topics                  :
'''
import random
class InvalidGrade(Exception):
	def __init__(self, value):
		self.value = value
try:
	grade = input("Enter a grade: ")
	if grade == "Ex":
		print("Grade points: %.2f"%random.uniform(9, 10))
	elif grade == "A+":
		print("Grade points: %.2f"%random.uniform(8, 9))
	elif grade == "A":
		print("Grade points: %.2f"%random.uniform(7, 8))
	elif grade == "B":
		print("Grade points: %.2f"%random.uniform(6, 7))
	elif grade == "C":
		print("Grade points: %.2f"%random.uniform(5, 6))
	elif grade == "D":
		print("Grade points: %.2f"%random.uniform(4, 5))
	elif grade == "F":
		print("Grade points: %.2f"%random.uniform(0, 4))
	else:
		raise InvalidGrade(grade)
except InvalidGrade as ig:
	print(f"{ig.value} is an invalid letter grade")
