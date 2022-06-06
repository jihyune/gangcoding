from re import A
from sqlite3 import adapt
from this import d


class ListNode:
	def __init__(self, newItem, nextNode:'ListNode'):
		self.item = newItem
		self.next = nextNode

class LinkedListBasic:
	def __init__(self):
		self.__head = ListNode('dummy', None)
		self.__numItems = 0

	def insert(self, i:int, newItem):
		if i >= 0 and i <= self.__numItems:
			prev = self.__getNode(i - 1)
			newNode = ListNode(newItem, prev.next)
			prev.next = newNode
			self.__numItems += 1

	def append(self, newItem):
		prev = self.__getNode(self.__numItems - 1)
		newNode = ListNode(newItem, prev.next)
		prev.next = newNode
		self.__numItems += 1


	def pop(self, i:int):  
		if (i >= 0 and i <= self.__numItems-1):
			prev = self.__getNode(i - 1)
			curr = prev.next
			prev.next = curr.next
			retItem = curr.item
			self.__numItems -= 1
			return retItem
		else:
			return None
	
	def size(self) -> int:
		return self.__numItems

	def clear(self):
		self.__head = ListNode("dummy", None)
		self.__numItems = 0

	def __getNode(self, i:int) -> ListNode:
		curr = self.__head 
		for index in range(i+1):
			curr = curr.next
		return curr

	def printList(self):
		curr = self.__head.next 
		while curr != None:
			print(curr.item, end = '')
			curr = curr.next
		print()


n=int(input())
cursor = 0;
list = LinkedListBasic()

for i in range(n):
    
    str = input()
    for j in range (len(str)):
        if str[j] == "<":
            if cursor >0 :
                cursor-=1;
        elif str[j] == ">":
            if cursor < list.size():
                cursor+=1;
        elif str[j] == "-":
            if cursor > 0:
                list.pop(cursor-1)
                cursor-=1
        else :
            list.insert(cursor, str[j])
            cursor+=1
    list.printList();
    list.clear();


# 1
# jk<<<a>>d
# ajkd

# 2
# jk<<a 
# ajk
# jk<<<a>>d
# ad
