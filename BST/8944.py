from math import comb
import sys

class Solution:
    def numOfWays(self, nums) -> int:
        
        def cntways(array):
            if len(array) <= 2:
                return 1
            left = [v for v in array if v < array[0]]
            right = [v for v in array if v > array[0]]
            return comb(len(left) + len(right), len(right))*cntways(left)*cntways(right)
        
        return (cntways(nums)%9999991)

n = int(sys.stdin.readline())


while n>0:
	tree = Solution()
	result = 1
	n -= 1
	m = int(sys.stdin.readline())
	numbers = list(map(int, sys.stdin.readline().split()))
	result = tree.numOfWays(numbers)
	print(result)