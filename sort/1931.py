import sys

n = int(sys.stdin.readline())
tuple_list=[]

for _ in range(n):
    i, j = map(int, sys.stdin.readline().split())
    tuple_list.append((i, j))
tuple_list.sort(key = lambda x : (x[1],x[0]))

start=tuple_list[0]
count = 1
tuple_list.pop(0)

for x in tuple_list:
    if x[0] >= start[1]:
        count+=1
        start = x

print(count)