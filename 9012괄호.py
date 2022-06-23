import sys

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None

class LinkedStack:
    def __init__(self):
        self.head = Node(None)
        self.__numItems = 0

    def push(self, cur, data):
        new = Node(data)
        new.prev = cur
        cur.next = new
        self.__numItems +=1
        return new

    def pop(self, cur):
        cur = cur.prev
        cur.next = None
        self.__numItems -=1
        return cur

    def size(self):
        return self.__numItems

n = int(input())

while n>0:
    n -=1
    stack=LinkedStack()
    cur = stack.head
    stc = sys.stdin.readline().rstrip()
    for c in stc:
        cur = stack.push(cur, c)
        if cur.data ==")":
            if cur.prev.data == "(":
                cur = stack.pop(cur)
                cur = stack.pop(cur)
    if stack.size() == 0:
        print("YES")
    else : 
        print("NO")

n = int(sys.stdin.readline())

while n>0:
    n -=1
    stack=[]
    stc = sys.stdin.readline().strip()
    for c in stc:
        stack.append(c)
        if c == ")":
            if stack[0] == "(":
                stack.pop()
                stack.pop()
            else :
                break
    if len(stack) == 0:
        print("YES")
    else : 
        print("NO")