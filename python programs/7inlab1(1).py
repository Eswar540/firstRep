#python code to sort the list of elements by last index
"""
    Program No.         :LS:07 IL:01
    Program Name        :7inlab1.py
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

# Define a function sorted(Tuple) that in returns the last element of each tuple in increasing order
def last(n):
    return n[-1]
def sort(tuples):
    return sorted(tuples, key=last)
# Take a list of Tuple elements from the user
a=[(1,3),(3,2),(2,1)]
print("Sorted :",end=" ")
print(sort(a))