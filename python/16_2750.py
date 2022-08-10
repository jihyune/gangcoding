import sys

def selectionSort(A):
	for last in range(len(A)-1, 0, -1):
		k = theLargest(A, last)	# A[0...last] 중 가장 큰 수 A[k] 찾기
		A[k], A[last] =  A[last], A[k]

def theLargest(A, last:int) -> int:	# A[0...last]에서 가장 큰 수의 인덱스를 리턴한다
	largest = 0
	for i in range(last+1):
		if A[i] > A[largest]:
			largest = i
	return largest

n = int(sys.stdin.readline())
a = []

for i in range(n):
    num = int(sys.stdin.readline())
    a.append(num)

selectionSort(a)

for i in range(n):
    print(a[i])

