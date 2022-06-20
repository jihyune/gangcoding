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
    v = sys.stdin.readline()
    
    for j in v:
        if j == '(':
            s.push(j)
        elif j == ')':
            if s and not s.isEmpty:
                s.pop()
            else:
                print("NO")
                break
        else:
            if not s:
                print("YES")
            else:
                print("NO")