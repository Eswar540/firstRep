#python program to find out number of elements greater than min value and less than max value
#in a given list
"""
    Program No.         :LS:06 IL:02
    Program Name        :6inlab2.py
    Author              :Eswar
    Date                :
    Topics              :Intrduction to lists
                        creating a lists
                        accessing and changing list items
                        slicing and splitting lists
                        list operators
                        list methods
"""
def countRange(my_list,maximum,minimum):
    #sum() calculates the total of all numerical values in an iterable
    maxcount = sum(i <= maximum for i in my_list)
    mincount = sum(i >= minimum for i in my_list)

    print("The number of elements greater than or equal to minimum",mincount)
    print("The number of elements less than or equal to maximum",maxcount)
n = int(input("Enter the number of elements:"))
my_list = []
for i in range(n):
    my_list.append(int(input("Enter %d element"%(i+1))))
maximum = int(input("Enter maximum value"))
minimum = int(input("Enter minimum value"))
countRange(my_list,maximum,minimum)