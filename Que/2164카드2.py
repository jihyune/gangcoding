import sys
from collections import deque

n = int(sys.stdin.readline())
deq = deque()

if n == 1 :
    print("1")
elif n == 2 :
    print("2")
else:
    for i in range(1, n+1):
        deq.append(i)

    while len(deq)>2 :
        deq.popleft()
        deq.append(deq.popleft())
    print(deq[1])