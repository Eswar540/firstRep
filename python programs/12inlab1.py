#python program to deal with classes and objects
"""
    Program No.         :LS:12 IL:01
    Program Name        :12inlab1.py
    Author              :Eswar
    Date                :17/07/2021
    Topics              :creating classes ,adding members,creating objects,implementing OOP concepts

"""
class BankAccount:
    def __init__(self,accName,accBalance,interest_rate):
        self.accName = accName
        self.accBalance = accBalance
        self.interest_rate = interest_rate
        print("Your balance before applying interest:", self.accBalance)
    def apply_interest(self):

        interest_amt = ((self.interest_rate)/100)*self.accBalance
        self.accBalance = self.accBalance + interest_amt

    def getDetails(self):
        print("Your account balance after applying interest is:",self.accBalance)


b = BankAccount('Eswar',1000,3)
b.apply_interest()
b.getDetails()
b.interest_rate = 2
b.apply_interest()
b.getDetails()

