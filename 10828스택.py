import sys

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None

class Stack:
    def __init__(self):
        self.head = Node(None)
        self.__numItems = 0

    def push(self, cur, data):
        new = Node(data)
        new.prev = cur
        cur.next = new
        self.__numItems +=1
        return new

    def top(self, cur):
        if self.__numItems != 0:
            print(cur.data)
        else:
            print("-1")

    def pop(self, cur):
        print(cur.data)
        cur = cur.prev
        cur.next = None
        self.__numItems -=1
        return cur

    def size(self):
        print(self.__numItems)

    def empty(self):
        if self.__numItems == 0:
            print("1")
        else :
            print("0")

    

cases = int(input())
answer = Stack()
cur = answer.head

while cases>0:
    cases -= 1
    stc = sys.stdin.readline().rstrip()
    
    if stc[0:2] == "pu":
        cur = answer.push(cur, stc[5:])
    elif stc[0:2] == "to":
        answer.top(cur)
    elif stc[0:2] == "si":
        answer.size()
    elif stc[0:2] == "po":
        if cur is not answer.head:
            cur = answer.pop(cur)
        else:
            print("-1")
    else :
        answer.empty()


