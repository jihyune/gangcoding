import sys

n = int(sys.stdin.readline())

stack=[]
m=0
list =[]

while n>0:
    n -= 1
    k = int(sys.stdin.readline())
    if len(stack) == 0:
        m += 1
        stack.append(m)
        list.append("+")
    if stack[-1] < k:
        while stack[-1] < k:
            m += 1
            stack.append(m)
            list.append("+")
        stack.pop()
        list.append("-")
    elif stack[-1] == k:
        stack.pop()
        list.append("-")
    else :
        break

if len(stack) == 0:
    for _ in list:
        print(_)
else :
    print("NO")