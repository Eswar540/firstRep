t = [int(i) for i in input().split()]
l = list(set(t))
lst = [[] for i in range(len(l))]

for i in range(len(l)):
    lst[i].append(t.count(l[i]))
    lst[i].append(l[i])

lst.sort()
t = []
for i in lst:
    i.reverse()
    t.append(tuple(i))
print(t)
