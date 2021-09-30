class Test:
    def __init__(self,age):
        self.age = age
class A(Test):
    def __init__(self,age,name):
        Test.__init__(self,age)
        self.name = name
    def display(self):
        print(self.age)
        print(self.name)
a = A(19,'name')
a.display()
