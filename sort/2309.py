from itertools import combinations
import sys

x =[]
for _ in range(9):
    x.append(int(sys.stdin.readline()))

sum = 0
for i in range(9):
    sum+=x[i]

couple = list(combinations(x, 2))

for y in couple:
    if sum-y[0]-y[1] == 100:
        x.remove(y[0])
        x.remove(y[1])
        break

x.sort()
for i in range(7):
    print(x[i])
