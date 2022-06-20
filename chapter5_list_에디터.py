from chapter5_list_1 import ListNode, LinkedList
import sys

word =  sys.stdin.readline().strip()
num = int(sys.stdin.readline())

words = [i for i in word]

list = LinkedList()
for i in range(len(words)):
    list.append(words[i])

index = len(words)


for i in range(num):
    do = sys.stdin.readline().strip().split()
    if len(do) == 2:
        list.insert(index, do[1])
        index += 1
    else:
        if do[0] == "L":
            if(index != 0):
                index -= 1
        elif do[0] == "D":
            if(index != list.size()):
                index += 1
        elif do[0] == "B":
            if(index != 0):
                list.pop(index-1)
                index -= 1

list.printList()