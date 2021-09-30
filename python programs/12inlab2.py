#a python program to deal with classes and objects
'''
Program No.         :LS:12 IL: 02
Program Name        :12inlab2.py
Author              :Eswar
Date                :17/07/2021
Topics              :Creating classes, adding members, creating objects, implementing OOP concepts.
'''
import random

class Avatar:

    def __init__(self, hit_points, attack_power, defense_power):
        self.hit_points = hit_points
        self.attack_power = attack_power
        self.defense_power = defense_power

    def attack(self):
        return random.randrange(1, self.attack_power)

    def defend(self, attack_amount):
        damage_amount = self.defense_power - attack_amount if self.defense_power > attack_amount else self.hit_points
        self.hit_points -= damage_amount
        return damage_amount

    def is_alive(self):
        return self.hit_points > 0

a = Avatar(5, 10, 7)
print(a.attack())
print(a.defend(5))
print(a.is_alive())
