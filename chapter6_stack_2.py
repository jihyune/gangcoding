import sys
n = int(sys.stdin.readline())

for i in range(n):
    stack = []
    word = sys.stdin.readline().strip()
    word = list(word)
    for j in range(len(word)):
        if word[j] == "(":
            stack.append("(")
        elif word[j] == ")":
            if len(stack) >= 1 and stack[-1] == "(":
                stack.pop()
            else:
                stack.append(1)
                break

    if len(stack) == 0:
        print("YES")
    else:
        print("NO")

