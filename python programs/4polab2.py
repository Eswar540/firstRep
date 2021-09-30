#A python program to rotate the array given number of times
'''
Program No.            : LS:04 PoL: 02
Program Name           : 4polab2.py
Author                 : Eswar
Date                    : 12/06/2021
topics                  : Creating arrays, processing the array elements
                        Slice and range operator, array operations
'''
n = int(input("Enter the size of the array: "))
a = []
#taking input into array
for i in range(n):
    x = int(input(f"Enter {i+1}th element: "))
    a.append(x)

fr = [None]*n
visited = -1
for i in range(n):
    count = 1
    for j in range(i+1,n):
        if a[i]==a[j]:
            count+=1
            fr[j] = visited
    if fr[i]!=visited:
        fr[i] = count

#displaying frequency of each element
print("Element    Frequency")
for i in range(len(fr)):
    if fr[i]!=visited:
        print(str(a[i])+"              "+str(fr[i]))
