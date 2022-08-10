import sys

n = int(sys.stdin.readline())
a = []
P = []
Q = []
max = 0

for i in range(n):
    p, q = map(int, sys.stdin.readline().split())
    P.append(p)
    Q.append(q)
    if max <= q:
        max = q
    
for i in range(max):
    a.append(0)

count = 0

for i in range(n):
    l = Q[i] - P[i]

    for j in range(P[i], Q[i]):
        if (a[j] > l) or (a[j] == 0):
            a[j] = l

    
for i in range(max):

    if a[i] == 0:
        continue
    else:
        num = a[i]
        c = num - 1
        for j in range(i+1, i+num):
            if a[j] == num:
                c = c - 1
                a[j] = 0
                if c == 0:
                    count = count + 1
                    break
                else: continue
            else:
                break

print(count)


        