#python code to combime two dicts having common keys
"""
    Program No.         :LS:08 PL:02
    Program Name        :8polab2.py
    Author              :Eswar
    Date                :
    Topics              :Introduction to Dictionaries
                        Creating a Dictionary
                        Accessing and changing Dictionary items
                        Dictionary Comprehensions
                        Dictionary operators
                        Dictionary methods
"""
a = list(input("Enter d1 keys: ").split())
b = list(map(int, input("Enter d1 values: ").split()))
c = list(input("Enter d2 keys: ").split())
d = list(map(int, input("Enter d2 values: ").split()))
d1 = dict(zip(a,b))
d2 = dict(zip(c,d))
for i in d2:
    if i in d1:
        d1[i]+=d2[i]
    else:
        d1[i]=d2[i]
print(d1)
