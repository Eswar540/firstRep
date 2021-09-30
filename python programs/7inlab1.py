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
                       Tuple operators
                       Tuple methods

"""


#method 2 to sort a list of tuple elements by last index

#a function sort_tuple(tuple) to sort a list of elements by last index in a tuple

def sort_tuple(tuples):
    #first get the length of the tuple
    lst = len(tuples)
    for i in range(0,lst):
        for j in range(0,lst-i-1):
            if (tuples[j][-1]) > tuples[j+1][-1]:
                temp = tuples[j]
                tuples[j] = tuples[j+1]
                tuples[j+1] = temp
    return tuples
a = [(2,5),(1,2),(4,4),(2,3)]
print(sort_tuple(a))
