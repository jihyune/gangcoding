import sys

class ListStack:
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


n = int(sys.stdin.readline().rstrip())
stack = ListStack()
i = 0
j = 0
for i in range(n):
    vps = list(sys.stdin.readline().rstrip())
    for j in range(len(vps)):
        if stack.isEmpty():
            if vps[j] == ")":
                print("NO")
                break
            else:
                stack.push(vps[j])
        else:
            if stack.top() != vps[j]:
                stack.pop()
            else:
                stack.push(vps[j])
    if stack.isEmpty():
        print("YES")
    else:
        print("NO")
