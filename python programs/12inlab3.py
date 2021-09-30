#python code to create a class item for sale, str method
"""
    Program No.         :LS:12 IL:03
    Program Name        :12inlab1.py
    Author              :Eswar
    Date                :
    Topics              :object oriented programming
"""


class Item:
    def __init__(self, name, price):
        self.name = name
        self.price = price

    def __str__(self):
        return "Item name:" + " " + self.name + "\n" + "Item price:" + str(round(self.price,2))
name = input("Enter the name:")
price = float(input("Enter the price:"))
i = Item(name,price)
print(i)