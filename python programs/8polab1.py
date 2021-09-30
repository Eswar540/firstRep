#python code to print the dict contains a number between 1 to n in form of x,x*x
"""
    Program No.         :LS:08 PL:01
    Program Name        :8inlab4.py
    Author              :Eswar
    Date                :
    Topics              :Introduction to Dictionaries
                        Creating a Dictionary
                        Accessing and changing Dictionary items
                        Dictionary Comprehensions
                        Dictionary operators
                        Dictionary methods
"""
n = int(input("Enter the number:"))
list1 = []
for i in range(1,n+1):
    list1.append(i)
list2 = list(map(lambda x:x**2,list1))
list1 = list(zip(list1,list2))
print(dict(list1))