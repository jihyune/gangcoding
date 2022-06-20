import sys

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None

class Link:
    def __init__(self):
        self.head = Node(None)
        self.head.next = Node(None)
        self.head.prev = None
        self.tail = self.head.next
        self.tail.prev = self.head

    def insert(self,cur,data):
        new = Node(data)
        cursor = cur.prev
        cursor.next = new
        new.prev = cursor
        new.next = cur
        cur.prev = new
        return cur

    def pop(self,cur):
        prv = cur.prev
        cur.prev = prv.prev
        prv.prev.next = cur
        return cur

    def printList(self):
        cur = self.head
        while cur.next is not self.tail:
            cur = cur.next
            print(cur.data, end='')

cases = int(input())
while cases > 0 :
    answer = Link()
    cases -=1
    stc = sys.stdin.readline().rstrip()

    cur_node = answer.head.next
    for c in stc:
        if c == "<":
            if cur_node.prev == answer.head:
                continue
            else:
                cur_node = cur_node.prev
        elif c == ">":
            if cur_node == answer.tail:
                continue
            else:
                cur_node = cur_node.next
        elif c== "-":
            if cur_node == None or cur_node.prev == answer.head:
                continue
            else:
                cur_node = answer.pop(cur_node)
        else:
            cur_node = answer.insert(cur_node, c)
    answer.printList()
    print()