import sys
sys.setrecursionlimit(1000000000)
input = sys.stdin.readline

def postorder(left,right):
    if left > right:
        return
    else:
		# 프린트 될 수
        root=preorder[left]
        div = right+1
		# 범위 설정해서 검색하다가 루트수보다 큰 수를 찾아
        for i in range(left+1,div):
            if root<preorder[i]: 
                div = i
                break
		#그거보다 하나 작은 인덱스로 다시 색출. 범위가 넘어가면 거기서 print한다.
        postorder(left+1, div-1)
        postorder(div, right)
        print(root)
    
preorder=[]
while True:
    try:
        preorder.append(int(input()))
    except:
        break

postorder(0,len(preorder)-1)