import sys

class Heap:
	def __init__(self, *args):
		if len(args) != 0:
			self.__A = args[0]
		else:
			self.__A = []

	def insert(self, x):
		self.__A.append(x)
		self.__percolateUp(len(self.__A)-1)

	def __percolateUp(self, i:int):
		parent = (i - 1) // 2
		if i > 0 and self.__A[i] < self.__A[parent]:
			self.__A[i], self.__A[parent] = self.__A[parent], self.__A[i]
			self.__percolateUp(parent)

	def deleteMin(self):
		if self.size() > 1:
			min = self.__A[0]
			self.__A[0] = self.__A.pop()
			self.__percolateDown(0)
			return min
		elif self.size() == 1:
			min = self.__A[0]
			self.__A.pop()
			return min
		else:
			return None

	def __percolateDown(self, i:int):
		child = 2 * i + 1
		right = 2 * i + 2
		if (child <= len(self.__A)-1):
			if (right <= len(self.__A)-1 and self.__A[child] > self.__A[right]):
				child = right
			if self.__A[i] > self.__A[child]:
				self.__A[i], self.__A[child] = self.__A[child], self.__A[i]
				self.__percolateDown(child)

	def buildHeap(self):
		for i in range((len(self.__A) - 2) // 2, -1, -1):
			self.__percolateDown(i)

	def isEmpty(self) -> bool:
		return len(self.__A) == 0

	def size(self) -> int:
		return len(self.__A)

n = int(sys.stdin.readline())
h = Heap()

for _ in range(n):
    m=int(sys.stdin.readline())
    if m > 0:
        h.insert(m)
    elif m == 0:
        if h.isEmpty():
            print("0")
        else:
            print(h.deleteMin())