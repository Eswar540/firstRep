#python program to convert a text message to frequency of keypad press in a basic mobile phone

"""
    Program No.         :LS:08 IL:01
    Program Name        :8inlab1.py
    Author              :Eswar
    Date                :
    Topics              :Introduction to Dictionaries
                        Creating a Dictionary
                        Accessing and changing Dictionary items
                        Dictionary Comprehensions
                        Dictionary operators
                        Dictionary methods
"""
#create a dictionary with a name keypad in a function textToKey(string)
keypad = {
    1: ['.', ',', '?', '!', ':'],
    2: ['A', 'B', 'C'],
    3: ['D', 'E', 'F'],
    4: ['G', 'H', 'I'],
    5: ['J', 'K', 'L'],
    6: ['M', 'N', 'O'],
    7: ['P', 'Q', 'R', 'S'],
    8: ['T', 'U', 'V'],
    9: ['W', 'X', 'Y', 'Z'],
    0: [' ']
}
def textToKey(string):

    result = ""
    text = string.upper()
    items = list(keypad.items())
    print(items)


    for i in range(len(text)):
        for j in range(len(items)):
            for k in range(len(items[j][1])):
                if(text[i] == items[j][1][k]):

                    result += ((k+1) * str(items[j][0]))
    return  result

#driver code
ipText = input("Enter a text message to check the frequency of keypad:")
print(textToKey(ipText))


