import sys

n = int(sys.stdin.readline())
tuple_list=[]

for _ in range(n):
    i, j = map(int, sys.stdin.readline().split())
    tuple_list.append((i, j))
tuple_list.sort(key = lambda x :x[1])

start=tuple_list[0]
count = 1

while len(tuple_list) > 1:
    while tuple_list[0][0]<start[1]:
        tuple_list.pop(0)
        if len(tuple_list) == 0:
            break
    if len(tuple_list) == 0:
        break
    elif len(tuple_list) == 1:
        count +=1
    else :
        tuple_list.sort(key = lambda x : x[1])
        start=tuple_list[0]
        count +=1

print(count)