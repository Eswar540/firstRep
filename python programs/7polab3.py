#
"""
    Program No.         :LS:07 PL:03
    Program Name        :7polab3.py
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
l = [(10,20,40),(40,50,60),(70,80,90)]
l1 = []
n = int(input("Enter the number:"))
for i in l:
    a = list(i)
    a[-1] = n
    l1.append(tuple(a))
print(l1)







