"""
    Program No.         :LS:08 PL:03
    Program Name        :8polab3.py
    Author              :Eswar
    Date                :
    Topics              :Introduction to Dictionaries
                        Creating a Dictionary
                        Accessing and changing Dictionary items
                        Dictionary Comprehensions
                        Dictionary operators
                        Dictionary methods
"""
import itertools
d ={'1':['a','b'], '2':['c','d']}
x=0
for combo in itertools.product(*[d[k] for k in sorted(d.keys())]):
    print(''.join(combo))
    x+=1
print(x)



