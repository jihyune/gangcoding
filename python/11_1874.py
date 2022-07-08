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

	def popAll(self):
		self.__stack.clear() 

	def printStack(self):
		print("Stack from top:", end = ' ')
		for i in range(len(self.__stack)-1, -1, -1):
			print(self.__stack[i], end = ' ')
		print()

	def size(self):
		return len(self.__stack)


n = int(sys.stdin.readline())
s = Stack()
s1 = Stack()
result = []

for i in range(n):
    s.push(i+1)

for i in range(n):

    l = int(sys.stdin.readline())

    while not s.isEmpty():

        if int(l) > s.top():
            result.append("+")
            s.push(s1.top())
            s1.pop()

        elif int(l) < s.top():
            result.append("+")
            s1.push(s.top())
            s.pop()

        if int(l) == s.top():
            result.append("-")
            s.pop()
            break

if not s1.isEmpty():
    print("NO")
else:
    for i in result:
        print(i)
