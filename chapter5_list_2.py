import sys

a, b = map(int, sys.stdin.readline().rstrip().split())
# a = int(a)
# b = int(b)

list= []
num = [i for i in range(1,a+1)] 
n = 0
for i in range(a):
    for j in range(b-1):
        k = num[0]
        num.pop(0)
        num.append(k)
    list.append(num[0])
    num.pop(0)

print("<",', '.join(str(i) for i in list),">", sep="")

