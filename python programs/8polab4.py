"""
    Program No.         :LS:08 PL:04
    Program Name        :8polab4.py
    Author              :Eswar
    Date                :
    Topics              :Introduction to Dictionaries
                        Creating a Dictionary
                        Accessing and changing Dictionary items
                        Dictionary Comprehensions
                        Dictionary operators
                        Dictionary methods
"""
def last(a):
    return a[-1]
def sort_items(data):
    return sorted(data,key=last,reverse=True)
#driver code
data = {'item1':45.50,'item2':35,'item3':41.30,'item4':55,'item5':24}
data = data.items()
result = dict(sort_items(data))
c = 0
for (item,value) in result.items():
    if(c==3):
        break
    print(item,value)
    c+=1




