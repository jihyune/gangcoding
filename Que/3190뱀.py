from collections import deque
import sys

n = int(sys.stdin.readline())
board = [[0 for _ in range(n)] for _ in range(n)]
apple = int(sys.stdin.readline())

for _ in range(apple):
    i, j = map(int, sys.stdin.readline().split())
    i -=1; j-=1
    board[i][j] = 1

m = int(sys.stdin.readline())
snake=deque()
grid=[0, 0]
snake.append(grid)
dx = 0; dy= 0


def game(snake, grid, m):
    result = 0
    t, d = list(sys.stdin.readline().split())
    t = int(t)
    d = str(d)

    for _ in range(t):
        right(snake, grid)
        if grid[0]>=n | grid[0]<0 | grid[1]>=n | grid[1]<0 | bool(snake.count(grid)):
            return result
        result +=1
    m-=1
    dx=1; dy=0
    print(result)

    while m>0:
        m -=1
        t, d = list(sys.stdin.readline().split())
        t = int(t)
        d = str(d)
        if d=="D":
            inputD(snake, grid, t, dx, dy)
        else:
            inputL(snake, grid, t, dx, dy)
        if result < t:
            break
        print(result)

def inputD(snake, grid, t, dx, dy):
    if dx==1 & dy==0:
        for _ in range(t):
            down(snake, grid)
            if grid[0]>=n | grid[0]<0 | grid[1]>=n | grid[1]<0 | bool(snake.count(grid)):
                return result
            result +=1
        dx=0; dy=-1
        return result
    elif dx==0 & dy==-1:
        for _ in range(t):
            left(snake, grid)
            if grid[0]>=n | grid[0]<0 | grid[1]>=n | grid[1]<0 | bool(snake.count(grid)):
                return result
            result +=1
        dx=0; dy=-1
        return result
    elif dx==-1 & dy==0:
        for _ in range(t):
            up(snake, grid)
            if grid[0]>=n | grid[0]<0 | grid[1]>=n | grid[1]<0 | bool(snake.count(grid)):
                return result
            result +=1
        dx=0; dy=-1
        return result
    else:
        for _ in range(t):
            right(snake, grid)
            if grid[0]>=n | grid[0]<0 | grid[1]>=n | grid[1]<0 | bool(snake.count(grid)):
                return result
            result +=1
        dx=1; dy=0
        return result

def inputL(snake, grid, t, dx, dy):
    if dx==1 & dy==0:
        for _ in range(t):
            up(snake, grid)
            if grid[0]>=n | grid[0]<0 | grid[1]>=n | grid[1]<0 | bool(snake.count(grid)):
                return result
            result +=1
        dx=0; dy=-1
        return result
    elif dx==0 & dy==-1:
        for _ in range(t):
            right(snake, grid)
            if grid[0]>=n | grid[0]<0 | grid[1]>=n | grid[1]<0 | bool(snake.count(grid)):
                return result
            result +=1
        dx=0; dy=-1
        return result
    elif dx==-1 & dy==0:
        for _ in range(t):
            down(snake, grid)
            if grid[0]>=n | grid[0]<0 | grid[1]>=n | grid[1]<0 | bool(snake.count(grid)):
                return result
            result +=1
        dx=0; dy=-1
        return result
    else:
        for _ in range(t):
            left(snake, grid)
            if grid[0]>=n | grid[0]<0 | grid[1]>=n | grid[1]<0 | bool(snake.count(grid)):
                return result
            result +=1
        dx=0; dy=-1
        return result

def right(snake, grid):
    grid[0] += 1
    snake.append(grid)

def left(snake, grid):
    grid[0] -= 1
    snake.append(grid)

def up(snake, grid):
    grid[1] += 1
    snake.append(grid)

def down(snake, grid):
    grid[1] -= 1
    snake.append(grid)

game(snake, grid, m);