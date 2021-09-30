#python program to implement negative,zeros and positives in order
"""
    Program No.         :LS:06 IL:01
    Program Name        :6inlab1.py
    Author              :Eswar
    Date                :
    Topics              :Intrduction to lists
                        creating a lists
                        accessing and changing list items
                        slicing and splitting lists
                        list operators
                        list methods
"""
negatives = []
positives = []
zeros = []

while True:
    number = input("Enter the number:")
    if number == "":
        break
    else:
        number = int(number)
        if number < 0:
            negatives.append(number)
        elif number == 0:
            zeros.append(number)
        else:
            positives.append(number)
for i in negatives:
    print(i)

for i in zeros:
    print(i)

for i in positives:
    print(i)




