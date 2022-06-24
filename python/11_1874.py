import sys

class Stack:
	def __init__(self):
		self.__stack = []

	def push(self, x):
		self.__stack.append(x)

	def pop(self):
		return self.__stack.pop()

	def top(self):
		if self.isEmpty():
			return None
		else:
			return self.__stack[-1]

	def isEmpty(self) -> bool:
		return not bool(self.__stack)

	def size(self):
		return len(self.__stack)

n = int(sys.stdin.readline())
s = Stack()

for i in range(n):
    l = sys.stdin.readline()

    if