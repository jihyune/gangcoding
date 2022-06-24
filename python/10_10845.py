import sys

class Queue:
	def __init__(self):
		self.__queue = []

	def push(self, x):
		self.__queue.append(x)

	def pop(self):
		if len(self.__queue) == 0:
			print(-1)
		else:
			print(self.__queue[0])
			return self.__queue.pop(0) # .pop(0): 리스트의 첫 원소를 삭제한 후 원소 리턴

	def size(self):
		print(len(self.__queue))
		return len(self.__queue)

	def front(self):
		if len(self.__queue) == 0:
			print(-1)
			return None
		else:
			print(self.__queue[0])
			return self.__queue[0]

	def empty(self) -> bool:
		if (len(self.__queue)==0):
			print(1)
		else:
			print(0)
		return (len(self.__queue) == 0)

	def back(self):
		if len(self.__queue) == 0:
			print(-1)
			return None
		else:
			print(self.__queue[-1])
			return self.__queue[-1]
 

n = int(sys.stdin.readline())
s = Queue()

for i in range(n):
    c = sys.stdin.readline().split()

    if c[0] == 'push':
        s.push(c[1])

    elif c[0] == 'pop':
        s.pop()

    elif c[0] == 'size':
        s.size()

    elif c[0] == 'empty':
        s.empty()

    elif c[0] == 'front':
        s.front()

    elif c[0] == 'back':
        s.back()