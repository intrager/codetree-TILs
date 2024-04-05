n = int(input())
nums = list(map(int, input().split()))

for i in range(1, n + 1, 2):
    arr = sorted(nums[:i])
    print(arr[i//2], end = " ")