# 1021 회전하는 큐

# n, m = map(int, input().split())
# numList = list((map(int, input().split())))

# numbers = list()
# count = 0

# for i in range(n):
#     numbers.append(i+1)

# def increasing(n):
#     for i in range(n):
#         x=numbers[0]
#         numbers.append(x)
#         numbers.pop(0)
        

# def decreasing(n):
#     for i in range(n):
#         x=numbers[-1]
#         numbers.insert(0, x)
#         numbers.pop(-1)

# for i in range(m):
#     # wtg = numList[0]
#     index = numbers.index(numList[0])

#     if index > n/2 :
#         decreasing(n - index)
#         count += n - index
#     else :
#         increasing(index)
#         count += index

#     numbers.pop(0)
#     numList.pop(0)
#     n -=1

# print(count)


# 1158 요세푸스

# n, k = map(int, input().split())

# seq = [i for i in range(1, n + 1)]
# answer = []
# j = k - 1

# for _ in range(n):
#     l = len(seq)
#     while j >= l:
#         j -= l
#     answer.append(seq[j])
#     del seq[j]
#     j += k - 1

# print("<"+str(answer)[1:-1]+">")


#2346 풍선 터뜨리기

# n = int(input())
# balloonHave = list(map(int, input().split()))
# answer=[]
# numbers = [ i for i in range(1, n+1) ]


# x=0
# for i in range(n) :
#     index = x
#     answer.append(numbers[index])
#     index += balloonHave[index]
#     numbers.pop(index)

#     print(numbers)
#     print(answer)