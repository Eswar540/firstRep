#a python promgram to find the two input strings are anagrams or not
"""
    Program No.         :LS:08 IL:03
    Program Name        :8inlab3.py
    Author              :Eswar
    Date                :
    Topics              :Introduction to Dictionaries
                        Creating a Dictionary
                        Accessing and changing Dictionary items
                        Dictionary Comprehensions
                        Dictionary operators
                        Dictionary methods
"""
def check_anagram(s1,s2):
    """Checks whether two strings are anagrams or not"""
    list1 = list(s1)
    list2 = list(s2)

    #sort the lists
    list1.sort()
    list2.sort()

    i = 0
    matches = True

    while(i<len(s1) and matches):
        if(list1[i] == list2[i]):
            i = i+1
        else:
            matches = False
    return matches
#driver code
first = input("Enter the first word:")
second = input("Enter the second word:")
if(check_anagram(first,second) == True):
    print("anagrams")
else:
    print("not anagrams")

