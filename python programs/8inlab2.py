#python program to count the number of unique characters in a gi en stirng using Dictionary
"""
    Program No.         :LS:08 IL:02
    Program Name        :8inlab2.py
    Author              :Eswar
    Date                :
    Topics              :Introduction to Dictionaries
                        Creating a Dictionary
                        Accessing and changing Dictionary items
                        Dictionary Comprehensions
                        Dictionary operators
                        Dictionary methods
"""
#create a dictionary with a name uniqueDictLetters in a function uniqueLetter(string)

def uniqueLettrs(string):
    uniqueDictLettrs = {}
    for c in string:
        if(c.isalpha()):
            uniqueDictLettrs[c] = 1
    return len(uniqueDictLettrs)
"""
def uniqueLetters(string):
    return len(set(string))
message = input("Enter message: ")
print(f"The number of unique characters is {uniqueLetters(message)}")

"""

ipText = input("Enter message:")
result_unique_letters = uniqueLettrs(ipText)
print(result_unique_letters)



