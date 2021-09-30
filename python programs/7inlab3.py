#python program to create a histogram function that identifies the number and its repetitions
#and places it in sorted order
"""
    Program No.         :LS:07 IL:02
    Program Name        :7inlab2.py
    Author              :Eswar
    Date                :
    Topics              :Introduction to Tuples
                        Creating a Tuples
                        Accesing and changing tuples items indirectly
                        slicing and splitting tuple
                        packing and unpacking tuples
                       Tuple operators
                       Tuple methods
"""
def histogram(l):
    count = 0
    x = []
    y = []
    for i in range(len(l)):
        index = i
        count = 0
        for j in range(index,len(l)):
            if l[index] == l[j] and l[index] not in y:
                count += 1
        y = y +[l[index]]
        if(count !=0):
            x = x + [(l[index],count)]
    x.sort()
    x=sorted(x,key = lambda x:x[1])
    return x

#Read the list of elements into the tuple
a= (13,12,11,13,14,13,7,7,13,14,12)
print(histogram(a))

