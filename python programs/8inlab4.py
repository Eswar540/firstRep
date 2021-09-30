#a program to print the points for the given word
"""
    Program No.         :LS:08 IL:04
    Program Name        :8inlab4.py
    Author              :Eswar
    Date                :
    Topics              :Introduction to Dictionaries
                        Creating a Dictionary
                        Accessing and changing Dictionary items
                        Dictionary Comprehensions
                        Dictionary operators
                        Dictionary methods
"""
score = {'a':1,'b':3,'c':3,'d':2,'e':1,'d':2,'f':4,'g':2,'h':4,'i':1,'j':8,'k':5,'l':1,'m':3,'n':1,'o':1,'p':3,'q':10,'r':1,'s':1,'t':1,'u':1,'v':4,'w':4,'x':8,'y':4,'z':10}
word = input("enter the word:")
points = 0
def scrabble_word(word):
    global points
    for i in word.lower():
        points = points+score[i]
    return points
#driver code

print("The points of the given word",scrabble_word(word))

