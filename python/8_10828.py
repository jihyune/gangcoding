import sys

class Stack:
    def __init__(self):
        self.__stack = []

    def push(self, x):
        self.__stack.append(x)

    def pop(self):
        if len(self.__stack) == 0:
            print(-1)
        else:
            print(self.__stack[-1])
            return self.__stack.pop()

    def size(self):
        print(len(self.__stack))
        return len(self.__stack)

    def empty(self) -> bool:
        if len(self.__stack) == 0:
            print(1)
        else :
            print(0)
        return not bool(self.__stack) 

    def top(self):
        if len(self.__stack)==0:
            print(-1)
            return None
        else:
            print(self.__stack[-1])
            return self.__stack[-1]

n = int(sys.stdin.readline())
s = Stack()

for i in range(n):
    c = sys.stdin.readline().split()

    if c[0] == 'push':
        s.push(c[1])

    elif c[0] == 'pop':
        s.pop()

    elif c[0] == 'size':
        s.size()

    elif c[0] == 'empty':
        s.empty()

    elif c[0] == 'top':
        s.top()

 
