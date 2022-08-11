list = []
for i in range(9):
    height = int(input())
    list.append(height)
    
target = sum(list) - 100 

for i in range(8):
    for j in range(i+1, 9):
        if list[i] + list[j] == target:
            a, b = i, j
            break

remove_set = {list[a], list[b]}

answer = [i for i in list if i not in remove_set]
answer.sort()
for i in answer:
    print(i)