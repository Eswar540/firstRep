def myFun():
    s = input("Enter any string")
    return s
def isLapindrom(s):
    s1 = ''
    s2 = ''
    if len(s) % 2 == 0:
        s1 = s[:len(s) // 2]
        s2 = s[len(s) // 2:]
    else:
        s1 = s[:len(s) // 2]
        s2 = s[len(s) // 2 + 1:]
    s1 = list(s1)
    s2 = list(s2)
    s1.sort()
    s2.sort()

    if len(s1) == len(s2) and s1 == s2:
        return "lapindrome"
    else:
        return "not lapindrome"



