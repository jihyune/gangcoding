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

# class ListNode:
# 	def __init__(self, newItem, nextNode:'ListNode'):
# 		self.item = newItem
# 		self.next = nextNode

# class LinkedListBasic:
#     def __init__(self):
#         self.__head = ListNode('dummy', None)
#         self.__numItem = 0
        
#     def insert(self, i:int, newItem):
#         prev = self.__getNode(i - 1)
#         newNode = ListNode(newItem, prev.next)
#         prev.next = newNode
#         self.__numItem += 1
#         return newNode

#     def pop(self, i:int):
#         prev = self.__getNode(i - 1)
#         curr = prev.next
#         prev.next = curr.next
#         self.__numItem -= 1
#         return curr.item
        
#     def __getNode(self, i:int) -> ListNode:
#         curr = self.__head  # 더미 헤드, index: -1
#         for _ in range(i+1):
#             curr = curr.next
#         return curr

#     def size(self) -> int:
#         return self.__numItem

#     def printList(self):
#         curr = self.__head.next 
#         while curr != None:
#             print(curr.item, end = '')
#             curr = curr.next


# n = int(sys.stdin.readline())

# for i in range(n):
#     list = LinkedListBasic()
#     str = sys.stdin.readline().strip()
#     cursor = -1
#     for j in range (len(str)):
#         if str[j] == "<":
#             if cursor > -1 :
#                 cursor -= 1
#         elif str[j] == ">":
#             if cursor < list.size()-1:
#                 cursor+=1;
#         elif str[j] == "-":
#             if cursor > -1:
#                 list.pop(cursor)
#                 cursor-=1
#         else :
#             list.insert(cursor+1, str[j])
#             cursor+=1
#     list.printList();
#     print()


