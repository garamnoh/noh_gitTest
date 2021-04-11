numbers = [2,1,3,4,1]
answer = []

for i in range(len(numbers)):
    for j in range(i+1, len(numbers)):
        answer.append(numbers[i] + numbers[j])

answer = list(set(answer))

answer.sort()

print(answer)