import sys


class Stack:
    def __init__(self):
        self.__stack = []

    def push(self, x):
        self.__stack.append(x)

    def pop(self):
        return self.__stack.pop()

    def top(self):
        if self.isEmpty():
            return None
        else:
            return self.__stack[-1]

    def isEmpty(self) -> bool:
        return not bool(self.__stack)

    def size(self):
        return len(self.__stack)


n = int(sys.stdin.readline())
s = Stack()
s1 = Stack()

for i in range(n):
    v = sys.stdin.readline()
    l = len(v)

    for k in range(l):
        s.push(v[k])

    for j in v:
        if s.top() == ')':
            s1.push(s.top())
            s.pop()
            if s.top() == '(':
                s.pop()
                s1.pop()
            else:
                s1.push(s.top)
                s.pop()

    if s1.isEmpty() and s.isEmpty():
        print("YES")
    else:
        print("NO")
