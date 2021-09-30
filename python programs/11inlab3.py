#a python program that displays frequency of letters in a file
'''
Program No.        : LS:011 IL: 03
Program Name        : 11inlab3.py
Author                 : Eswar
Date                    : 10/07/2021
topics                  : file,reading a file,writing a file,copying from one file to another
'''
import sys
try:
	n = len(sys.argv)
	if n==1 or n>2:
		raise ValueError("Invalid number of arguments")
	r = open(sys.argv[1],"r")
	freq = dict()
	while True:
		char = r.read(1)
		if not char:
			break
		if char.isalpha():
			if char in freq:
				freq[char]+=1
			else:
				freq[char]=1
	for pair in freq.items():
		print(pair)
except ValueError as ve:
	print(ve)
except FileNotFoundError as fnfe:
	print("The file does not exist")
except:
	print("There is some error")
