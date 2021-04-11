# 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
# 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
# 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

# answers	        return
# [1,2,3,4,5]   	[1]
# [1,3,2,4,2]	    [1,2,3]

answers = [1,2,3,4,5]

answer = []
    
st1 = [1, 2, 3, 4, 5]
st2 = [2, 1, 2, 3, 2, 4, 2, 5]
st3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]

counts = [0, 0, 0] 

for i, an in enumerate(answers):
    if an == st1[i%5]: counts[0]+=1
    if an == st2[i%8]: counts[1]+=1
    if an == st3[i%10]: counts[2]+=1

for i, count in enumerate(counts):
    if max(counts) == count: answer.append(i+1)
        
print(answer)