#python program to evalate postfix evaluation
"""
    Program No.         :LS:06 IL:03
    Program Name        :6inlab3.py
    Author              :Eswar
    Date                :
    Topics              :Intrduction to lists
                        creating a lists
                        accessing and changing list items
                        slicing and splitting lists
                        list operators
                        list methods
"""
def postfix_evaluation(s):
    s = s.split()
    n = len(s)

    values = []

    for i in range(n):
        if s[i].isdigit():
            #append() function that appends the number to values list
            values.append(int(s[i]))
        elif s[i] == '+':
            a = values.pop()
            b = values.pop()
            values.append(int(a)+int(b))
        elif s[i] == '/':
            a = values.pop()
            b = values.pop()
            values.append(int(a) / int(b))
        elif s[i] == '*':
            a = values.pop()
            b = values.pop()
            values.append(int(a) * int(b))
        elif s[i] == '-':
            a = values.pop()
            b = values.pop()
            values.append(int(a) - int(b))
    return values.pop()
s = input("Enter the postfix expression:")
print("The value after postfix evaluation is",postfix_evaluation(s))




