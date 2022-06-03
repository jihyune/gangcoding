from collections import deque
import sys
input = sys.stdin.readline

n, k = map(int, input().split())

dq = deque([i for i in range(1, n+1)])

i = 1
result = []

while len(dq) != 0:
    if i % k != 0:
        dq.append(dq.popleft())
        i += 1
    else:
        result.append(str(dq.popleft()))
        i += 1


print("<", ', '.join(result), ">", sep="")    
