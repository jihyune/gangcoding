import sys
import heapq

n, m = map(int, sys.stdin.readline().split())
jewel = []
bags = []
count = 0

jewel.sort
for _ in range(n):
    a, b = map(int, sys.stdin.readline().split())
    heapq.heappush(jewel, (-1*b, a))
for _ in range(m):
    heapq.heappush(bags, int(sys.stdin.readline()))

for _ in range(n):
    change = 0
    for bag in bags:
        if  bag >= jewel[0][1]:
            count += -1*jewel[0][0]
            heapq.heappop(jewel)
            heapq.heappop(bags)
            change = 1
            break;
    if change == 0:
        heapq.heappop(jewel)
    
print(count)
