class BidirectNode:
    def __init__(self, x, prevNode:'BidirectNode', nextNode:'BidirectNode'):
        self.item = x
        self.prev = prevNode
        self.next = nextNode

class DoublyLinkedList:
    def __init__(self):
        self.head = BidirectNode("dummy", None, None)
        self.__numItems = 0

    def __getNode(self, i:int):
        curr = self.head
        for index in range(i+1):
            curr = curr.next
        return curr

    def insert(self, i:int, newItem) -> None:
        if i>=0 and i<= self.__numItems:
            prev = self.__getNode(i-1)
            newNode = BidirectNode(newItem, prev.next, prev)
            prev.next.prev = newNode
            prev.next = newNode
            self.__numItems += 1
        else:
            print("index", i, ": out of bound in insert()")
    
    def pop(self, i:int):
        if (i >=0 and i <= self.__numItems-1):
            prev = self.__getNode(i - 1)
            curr = prev.next
            prev.next.next.prev = prev
            prev.next = curr.next
            self.__numItems -= 1
    
    def append(self, newItem):
        prev = self.__getNode(self.__numItems - 1)
        newNode = BidirectNode(newItem, prev, prev.next)
        prev.next = newNode
        self.__numItems += 1

    def index(self, x) -> int:
        curr = self.head.next
        for index in range(self.__numItems):
            if curr.item == x:
                return index
            else:
                curr = curr.next
        return -2
    
    def size(self) -> int:
        return self.__numItems
    
    def printList(self):
        curr = self.head.next
        while curr != None:
            print(curr.item, end = '')
            curr = curr.next
        print()
