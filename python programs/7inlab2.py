#a python program that removes all tuples in al list of tuples with the USN outside the given range

"""
    Program No.         :LS:07 IL:02
    Program Name        :7inlab2.py
    Author              :Eswar
    Date                :
    Topics              :Introduction to Tuples
                        Creating a Tuples
                        Accesing and changing tuples items indirectly
                        packing and unpacking tuples
                        slicing and splitting tuple
                       Tuple operators
                       Tuple methods
"""
#you must read a list of tuples from the user
usn_y = [('a','12CS039'),('b','12CS320'),('c','12CS055'),('d','12CS100')]
#we must take the lower and upper range of roll numbers
low = int(input("Enter the lower range roll number:"))
upp = int(input("Enter the upper range roll number:"))

#append the prefix '12CS0' to the lower and upper roll numbers
l = "12CS0" + str(low)
u = "12CS" + str(upp)
p = [x for x in usn_y if (x[1]>=l and x[1]<=u)]
print(p)








