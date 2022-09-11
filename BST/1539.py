import sys

n = int(sys.stdin.readline())
node_height_sum = n
root = int(sys.stdin.readline())
left = [-1 for _ in range(n)]
right = [-1 for _ in range(n)]
node_height = 0


def get_node_height(node_height, root, number):
    node_height += 1
    if number<root:
        if left[root] == -1:
            left[root] = number
            return node_height
        else:
            return get_node_height(node_height, left[root], number)
    else:
        if right[root] == -1:
            right[root] = number
            return node_height
        else:
            return get_node_height(node_height, right[root], number)

for _ in range(n-1):
    number = int(sys.stdin.readline().strip())
    node_height_sum += get_node_height(node_height, root, number)

print(node_height_sum)


# for _ in range(n):
#     number_list.append(int(sys.stdin.readline().strip()))

# def getheight(lst):
#     if len(lst) <= 1:
#         return 0
#     root = lst[0]
#     left = [i for i in lst if i < root]
#     right = [i for i in lst if i > root]
#     return len(left)+len(right)+getheight(left)+getheight(right)

# print(getheight(number_list)+n)

