# A python program to partition an array of integers into 3 distinct subsets that all have equal sum and they completely cover the set
'''
Program No.        : LS:04 PL: 01
Program Name        : 4polab1.py
Author               : Eswar
Date                 : 12/06/2021
topics               : Creating arrays, processing the array elements
                        Slice and range operator, array operations
'''


def solution(arr, ind, n, ness, sums, subsets):
    # Here ness stores the number of non empty subsets to check base cases
    # Base case when we reach end of array i.e., all elements are added to subsets
    if (ind == n):
        # When we have filled all three subsets we need to check id sums are all equal
        if (ness == 3):
            if (sums[0] == sums[1] and sums[1] == sums[2]):
                print(subsets)
        return
    # Iterate through the subsets to add the element
    for i in range(3):
        # If we are adding the element to non empty subset
        if (len(subsets[i]) > 0):
            subsets[i].append(arr[ind])
            sums[i] += arr[ind]
            solution(arr, ind + 1, n, ness, sums, subsets)
            sums[i] -= arr[ind]
            subsets[i].pop()
        else:
            subsets[i].append(arr[ind])
            sums[i] += arr[ind]
            solution(arr, ind + 1, n, ness + 1, sums, subsets)
            sums[i] -= arr[ind]
            subsets[i].pop()
            break


# Driver Code
print("Enter the array : ")
arr = list(map(int, input().split()))
n = len(arr)
total_sum = sum(arr)
# an array to keep track of the sums of subsets
sums = [0, 0, 0]
subsets = [[] for i in range(3)]
if (n < 3 or total_sum % 3 != 0):
    print("Partition Not possible")
else:
    solution(arr, 0, n, 0, sums, subsets)
