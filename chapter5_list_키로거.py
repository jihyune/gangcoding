from telnetlib import DO
from chapter5_list import DoublyLinkedList, BidirectNode
import sys

num = int(sys.stdin.readline())


for i in range(num):
    word =  sys.stdin.readline().strip()
    words = [str(i) for i in word]
    list = DoublyLinkedList()
    curr = list.head
    for i in range(len(words)):
        if words[i] == "<":
            if curr != list.head:
                curr = curr.prev
        elif words[i] == ">":
            if curr.next != None:
                curr = curr.next
        elif words[i] == "-":
            if curr != list.head:
                index = list.index(curr.item)
                list.pop(index)
        else:
            if(list.index(curr.item) < 0):
                list.append(words[i])
                curr = curr.next
            else:
                index = list.index(curr.item)
                list.insert(index, words[i])
                curr = curr.next
    
    list.printList()

