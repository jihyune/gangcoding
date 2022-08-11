import heapq
import sys

n = int(sys.stdin.readline())
max_heap = []
min_heap = []

for _ in range(n):
    m=int(sys.stdin.readline())
    if len(min_heap) == len(max_heap):
        heapq.heappush(max_heap, (-1*m, m))
    else:
        heapq.heappush(min_heap, (m, m))

    if min_heap and min_heap[0][1] < max_heap[0][1]:
        a = heapq.heappop(min_heap)[1]
        b = heapq.heappop(max_heap)[1]
        heapq.heappush(min_heap, (b, b))
        heapq.heappush(max_heap, (-1*a, a))
    print(max_heap[0][1])