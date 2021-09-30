#a python program that adds line numbers to a file
'''
Program No.        : LS:011 IL: 02
Program Name    : 11inlab2.py
Author                 : Eswar
Date                     : 15/05/2021
topics                   :
'''
try:
	r = open("CricketList.txt","r")
	w = open("OutputList.txt","w+")
	i = 1
	for line in r:
		line = str(i)+": "+line
		w.write(line)
		i += 1
	print("File with line numbers created succesfully")
except:
	print("File Not Found")
finally:
	r.close()
	w.close()
