from collections import deque
import sys
input  = sys.stdin.readline

n = int(input())
dq = deque(enumerate(map(int, input().split())))
result = []


while len(dq) != 0:
    i, p = dq.popleft()
    result.append(i+1)

    if p > 0:
        dq.rotate(-(p-1))
    elif p < 0:
        dq.rotate(-p)

    
print(*result)