import sys

num = int(input())

list = []
for i in range(num):
    a, b = map(int, sys.stdin.readline().split())
    list.append((a,b))

list.sort(key=lambda x:x[1])

answer = 1
time = list[0][1]
for i in range(1, num):
    if list[i][0] >= time:
        answer += 1
        time = list[i][1]

print(answer)