# from collections import deque
# import sys

# n = int(sys.stdin.readline())
# board = [[0 for _ in range(n)] for _ in range(n)]
# apple = int(sys.stdin.readline())

# for _ in range(apple):
#     i, j = map(int, sys.stdin.readline().split())
#     i -=1; j-=1
#     board[i][j] = 1

# m = int(sys.stdin.readline())
# snake=deque()
# grid=[0, 0]
# snake.append(grid)
# dx = 0; dy= 0


# def game(snake, grid, m):
#     result = 0
#     t, d = list(sys.stdin.readline().split())
#     t = int(t)
#     d = str(d)

#     for _ in range(t):
#         right(snake, grid)
#         if grid[0]>=n | grid[0]<0 | grid[1]>=n | grid[1]<0 | bool(snake.count(grid)):
#             return result
#         result +=1
#     m-=1
#     dx=1; dy=0
#     print(result)

#     while m>0:
#         m -=1
#         t, d = list(sys.stdin.readline().split())
#         t = int(t)
#         d = str(d)
#         if d=="D":
#             inputD(snake, grid, t, dx, dy)
#         else:
#             inputL(snake, grid, t, dx, dy)
#         if result < t:
#             break
#         print(result)

# def inputD(snake, grid, t, dx, dy):
#     if dx==1 & dy==0:
#         for _ in range(t):
#             down(snake, grid)
#             if grid[0]>=n | grid[0]<0 | grid[1]>=n | grid[1]<0 | bool(snake.count(grid)):
#                 return result
#             result +=1
#         dx=0; dy=-1
#         return result
#     elif dx==0 & dy==-1:
#         for _ in range(t):
#             left(snake, grid)
#             if grid[0]>=n | grid[0]<0 | grid[1]>=n | grid[1]<0 | bool(snake.count(grid)):
#                 return result
#             result +=1
#         dx=0; dy=-1
#         return result
#     elif dx==-1 & dy==0:
#         for _ in range(t):
#             up(snake, grid)
#             if grid[0]>=n | grid[0]<0 | grid[1]>=n | grid[1]<0 | bool(snake.count(grid)):
#                 return result
#             result +=1
#         dx=0; dy=-1
#         return result
#     else:
#         for _ in range(t):
#             right(snake, grid)
#             if grid[0]>=n | grid[0]<0 | grid[1]>=n | grid[1]<0 | bool(snake.count(grid)):
#                 return result
#             result +=1
#         dx=1; dy=0
#         return result

# def inputL(snake, grid, t, dx, dy):
#     if dx==1 & dy==0:
#         for _ in range(t):
#             up(snake, grid)
#             if grid[0]>=n | grid[0]<0 | grid[1]>=n | grid[1]<0 | bool(snake.count(grid)):
#                 return result
#             result +=1
#         dx=0; dy=-1
#         return result
#     elif dx==0 & dy==-1:
#         for _ in range(t):
#             right(snake, grid)
#             if grid[0]>=n | grid[0]<0 | grid[1]>=n | grid[1]<0 | bool(snake.count(grid)):
#                 return result
#             result +=1
#         dx=0; dy=-1
#         return result
#     elif dx==-1 & dy==0:
#         for _ in range(t):
#             down(snake, grid)
#             if grid[0]>=n | grid[0]<0 | grid[1]>=n | grid[1]<0 | bool(snake.count(grid)):
#                 return result
#             result +=1
#         dx=0; dy=-1
#         return result
#     else:
#         for _ in range(t):
#             left(snake, grid)
#             if grid[0]>=n | grid[0]<0 | grid[1]>=n | grid[1]<0 | bool(snake.count(grid)):
#                 return result
#             result +=1
#         dx=0; dy=-1
#         return result

# def right(snake, grid):
#     grid[0] += 1
#     snake.append(grid)

# def left(snake, grid):
#     grid[0] -= 1
#     snake.append(grid)

# def up(snake, grid):
#     grid[1] += 1
#     snake.append(grid)

# def down(snake, grid):
#     grid[1] -= 1
#     snake.append(grid)

# game(snake, grid, m);

from collections import deque


def change(d, c):
    if c == "L":
        d = (d - 1) % 4
    else:
        d = (d + 1) % 4
    return d


dy = [-1, 0, 1, 0]
dx = [0, 1, 0, -1]


def start():
    direction = 1
    time = 1 
    y, x = 0, 0 
    visited = deque([[y, x]])
    arr[y][x] = 2
    while True:
        y, x = y + dy[direction], x + dx[direction]
        if 0 <= y < N and 0 <= x < N and arr[y][x] != 2:
            if not arr[y][x] == 1: 
                temp_y, temp_x = visited.popleft()
                arr[temp_y][temp_x] = 0 
            arr[y][x] = 2
            visited.append([y, x])
            if time in times.keys():
                direction = change(direction, times[time])
            time += 1
        else:
            return time


if __name__ == "__main__":
    N = int(input())
    K = int(input())
    arr = [[0] * N for _ in range(N)]
    for _ in range(K):
        a, b = map(int, input().split())
        arr[a - 1][b - 1] = 1 
    L = int(input())
    times = {}
    for i in range(L):
        X, C = input().split()
        times[int(X)] = C
    print(start())