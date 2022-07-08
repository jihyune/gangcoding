import sys

n = int(sys.stdin.readline())
s = []
s1 = []
result = []

for i in range(n):
    s.append(i+1)

for i in range(n):

    l = int(sys.stdin.readline())

    while not len(s) == 0:

        if int(l) > s[-1]:
            result.append("+")
            s.append(s1[-1])
            s1.pop()

        elif int(l) < s[-1]:
            result.append("+")
            s1.append(s[-1])
            s.pop()

        if int(l) == s[-1]:
            result.append("-")
            s.pop()
            break

if not len(s1) == 0:
    print("NO")
else:
    for i in result:
        print(i)