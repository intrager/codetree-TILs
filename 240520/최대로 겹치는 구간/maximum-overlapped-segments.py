n = int(input())
segments = [tuple(map(int,input().split())) for _ in range(n)]

points = []
for x1, x2 in segments:
    points.append((x1, +1)) # 시작점
    points.append((x2, -1)) # 끝점

# 정렬을 진행합니다.
points.sort()

# 가장 겹치는 선분이 많을 때의 선분 개수 저장할 변수
ans = 0
# 각 위치에 적혀있는 숫자들의 합을 구해줍니다.
sum_val = 0
for x, v in points:
    # 적혀있는 가중치를 전부 더해줍니다.
    sum_val += v
    
    # ans 업데이트
    ans = max(ans,sum_val)

print(ans)