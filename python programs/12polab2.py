'''
Program No.          : LS: 12 PL: 02
Program Name         : 12polab2.py
Author               : Eswar
Date                 : 17/07/2021
topics               : Creating classes, adding members, creating objects, implementing OOP concepts.
'''
class Ticket:
    def __init__(self,price,time):
        self.time = time
        self.price = price

    def __str__(self):
        return "(" + str(self.price) + " , " + self.time + ")"

    def is_evening_time(self):
        return self.time >= "18:00"

    def bulk_discount(self,n):
        if 5<=n<=9:
            return 10
        elif n>=10:
            return 20
        else:
            return 0

class MovieTicket(Ticket):
    def __init__(self,price,time,name):
        self.name = name
        self.price = price
        self.time = time

    def __str__(self):
        return "(" + str(self.price) + "," + self.time + "," + self.name + ")"

    def afternoon_discount(self):
        if "12:00"<=self.time<="17:59":
            return 10
        else:
            return 0

price = float(input("Enter the cost of ticket:"))
time = input("Enter the time of show:")
name = input("Enter movie name:")
ticket = MovieTicket(price,time,name)
print(ticket.__str__())
if ticket.is_evening_time():
    print("Yes it is evening show")
else:
    print("No it is not evening show")
n = int(input("Enter the number of tickets:"))
discount = ticket.bulk_discount(n)
print("Discount obtained is:",discount,"%")
afternoon = ticket.afternoon_discount()
print("After noon discount:",afternoon,"%")