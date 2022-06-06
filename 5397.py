# import sys

# class ListNode:
# 	def __init__(self, newItem, nextNode:'ListNode'):
# 		self.item = newItem
# 		self.next = nextNode

# class LinkedListBasic:
# 	def __init__(self):
# 		self.__head = ListNode('dummy', None)
# 		self.__numItems = 0

# 	def insert(self, i:int, newItem):
# 		if i >= 0 and i <= self.__numItems:
# 			prev = self.__getNode(i - 1)
# 			newNode = ListNode(newItem, prev.next)
# 			prev.next = newNode
# 			self.__numItems += 1

# 	def append(self, newItem):
# 		prev = self.__getNode(self.__numItems - 1)
# 		newNode = ListNode(newItem, prev.next)
# 		prev.next = newNode
# 		self.__numItems += 1


# 	def pop(self, i:int):  
# 		if (i >= 0 and i <= self.__numItems-1):
# 			prev = self.__getNode(i - 1)
# 			curr = prev.next
# 			prev.next = curr.next
# 			retItem = curr.item
# 			self.__numItems -= 1
# 			return retItem
# 		else:
# 			return None
	
# 	def size(self) -> int:
# 		return self.__numItems

# 	def clear(self):
# 		self.__head = ListNode("dummy", None)
# 		self.__numItems = 0

# 	def __getNode(self, i:int) -> ListNode:
# 		curr = self.__head 
# 		for index in range(i+1):
# 			curr = curr.next
# 		return curr

# 	def printList(self):
# 		curr = self.__head.next 
# 		while curr != None:
# 			print(curr.item, end = '')
# 			curr = curr.next
# 		print()


# n=int(sys.stdin.readline())
# cursor = 0;

# for i in range(n):
#     list = LinkedListBasic()
#     str = sys.stdin.readline().strip()
#     for j in range (len(str)):
#         if str[j] == "<":
#             if cursor >0 :
#                 cursor-=1;
#         elif str[j] == ">":
#             if cursor < list.size():
#                 cursor+=1;
#         elif str[j] == "-":
#             if cursor > 0:
#                 list.pop(cursor-1)
#                 cursor-=1
#         else :
#             list.insert(cursor, str[j])
#             cursor+=1
#     list.printList();


# 1
# jk<<<a>>d
# ajkd

# 2
# jk<<a 
# ajk
# jk<<<a>>d
# ad

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

    def print_list(self):
        curl = self.head
        temp = []
        while curl.next is not self.tail:
            curl = curl.next
            temp.append(curl.data)
        return temp

    def insert(self, cur, data):
        new = Node(data)
        cursor = cur.prev
        cursor.next = new
        cur.prev = new
        new.prev = cursor
        new.next = cur
        return cur

    def remove(self, cur):
        prv = cur.prev.prev
        cur.prev.prev.next = cur
        cur.prev = cur.prev.prev
        if prv is self.head:
            return self.head.next
        else:
            return cur


answers = []
cases = int(input())
while cases > 0:
    answer = Link()
    cases -= 1
    stc = sys.stdin.readline().rstrip()
    # init cursor to tail
    curl_node = answer.head.next
    for c in stc:
        if c == '<':
            # if cursor on head
            if curl_node.prev == answer.head:
                continue
            else:
                curl_node = curl_node.prev
        elif c == '>':
            # if cursor on tail
            if curl_node == answer.tail:
                continue
            else:
                curl_node = curl_node.next
        elif c == '-':
            if curl_node == None or curl_node.prev == answer.head:
                continue
            else:
                curl_node = answer.remove(curl_node)
        else:
            curl_node = answer.insert(curl_node, c)
    answers.append(answer.print_list())
s = ""
for stc in answers:
    s += (''.join(stc) + '\n')
print(s)