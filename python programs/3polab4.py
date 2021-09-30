#a python program to count all the vowels, consonants, digits and special character in string
'''
Program No.         : LS:03 PoL: 04
Program Name        : LS3PO4.py
Author              : Eswar
Date                : 15/05/2021
topics              : Creating a string, Slicing and splitting strings
                      String operators, Accesing a strings, String methods
'''
s = input("Enter the string : ")
#first subproblem
print("Subproblem 1")
n = len(s)
temp = s
if(n > 3) :
    sub = s[-3:]
    if(sub != 'ing') :
        temp += 'ing'
    else :
        temp += 'ly'
print(temp)
#second subproblem
print("Subproblem 2")
ind1 = s.find('not')
ind2 = s.find('poor')
temp = ""
if(ind1 != -1) :
    print("Index of first appearance of 'not' is :",ind1)
else :
    print("'not' is not in string")
if(ind2 != -1) :
    print("Index of first appearance of 'poor' is :",ind2)
else :
    print("'poor' is not in string")
if(ind1 != -1 and ind2 != -1) :
    ind2 += 4
    temp += s[:ind1]
    temp += 'good'
    temp += s[ind2:]
    print(temp)
else :
    print("No changes to string")
#third subproblem
print("Subproblem 3")
words = []
temp = ""
for w in s.split() :
    if(w not in words) :
        temp += w
        temp += " "
        words.append(w)
print("String after removing duplicates :",temp)
#fourth subproblem
print("Subproblem 4")
chars = []
k = int(input("Enter k ot find kth non repeating character : "))
for c in s :
    if(c!=" " and c not in chars) :
        chars.append(c)
if(k > 0 and k <= len(chars)) :
    print("kth non repeating character is :",chars[k-1])
else :
    print("The string doesn't have k non repeating characters")
#fifth subproblem
print("Subproblem 5")
lower_count = 0
upper_count = 0
for c in s :
    if(c >= 'a' and c <= 'z') :
        lower_count += 1
    if(c >= 'A' and c <= 'Z') :
        upper_count += 1
print("Number of upper case letters :",upper_count)
print("Number of lower case letters :",lower_count)
