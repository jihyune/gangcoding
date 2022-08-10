import sys
l = []
sum = 0

for i in range(9):
    h = int(sys.stdin.readline())
    l.append(h)
    sum = sum + h

for i in range(9):
    for j in range(i+1, 9):
        if (l[i] + l[j]) == sum - 100:
            a = l[i]
            b = l[j]
            l.remove(a)
            l.remove(b)
            break
    
    if len(l)<9:
        break
        
l.sort()
for i in range(7):
    print(l[i])

