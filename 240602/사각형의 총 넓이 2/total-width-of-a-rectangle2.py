n = int(input())

arr = [
    [0 for _ in range(201)]
    for _ in range(201)
]

for _ in range(n):
    x1, y1, x2, y2 = map(int, input().split())
    x1 += 100
    y1 += 100
    x2 += 100
    y2 += 100

    for row in range(x1, x2):
        for col in range(y1, y2):
            arr[row][col] = 1

ans = 0
for row in range(201):
    for col in range(201):
        if arr[row][col] == 1:
            ans += 1

print(ans)