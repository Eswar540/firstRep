#a python program to deal with classes and objects
'''
Program No.          : LS: 12 PL: 01
Program Name         : Ticket.py
Author               : Eswar
Date                 : 17/07/2021
topics               : Creating classes, adding members, creating objects, implementing OOP concepts.
'''
import datetime
from typing import NamedTuple

class Ticket:
    def __init__(self, price, startTime):
        self.price = price
        self.startTime = startTime

    def __str__(self):
        return f"{self.price} - {self.startTime}"

    def is_evening_time(self):
        startTime_var = datetime.datetime.strptime(self.startTime, "%H:%M")
        x = datetime.datetime.strptime("18:00", "%H:%M")
        y = datetime.datetime.strptime("23:59", "%H:%M")
        return x < startTime_var < y

    @staticmethod
    def bulk_discount(n):
        if 5 <= n <= 9:
            return 10
        elif n >= 10:
            return 20
        else:
            return 0

if __name__ == "__main__":
    t1 = Ticket(30, "19:00")
    print(t1)
    print(t1.is_evening_time())
    print(Ticket.bulk_discount(7))
