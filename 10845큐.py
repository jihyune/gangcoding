import sys

class ListQueue:
    def __init__(self):
        self.__queue = []
        
    def push(self, x):
        self.__queue.append(x)
        
    def pop(self):
        return self.__queue.pop(0)
        
    def front(self):
        if self.empty():
            return None
        else:
            return self.__queue[0]
            
    def empty(self) -> bool:
        return (len(self.__queue) == 0);
        
    def back(self):
        if self.empty():
            return None
        else:
            return self.__queue[-1]

    def size(self):
        return len(self.__queue)

    # def print(self):
    #     print("Queue from front:", end = ' ')
    #     for i in range(len(self.__queue)):
    #         print(self.__queue[i], end = ' ')
    #     print()
        
n = int(sys.stdin.readline())
que = ListQueue()

while n>0:
    n -=1
    str = sys.stdin.readline().strip()
    
    if str[0:2] == "pu":
        que.push(str[5:])
    elif str[0:2] == "fr":
        if que.empty():
            print("-1")
        else :
            answer = que.front()
            print(answer)
    elif str[0:2] == "po":
        if que.empty():
            print("-1")
        else :
            answer = que.pop()
            print(answer)
    elif str[0:2] == "si":
        answer = que.size()
        print(answer)
    elif str[0:2] == "em":
        if que.empty():
            print("1")
        else:
            print("0")
    elif str[0:2] == "ba":
        if que.empty():
            print("-1")
        else :
            answer = que.back()
            print(answer)
