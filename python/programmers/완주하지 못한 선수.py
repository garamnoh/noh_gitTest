from collections import Counter

# ["leo", "kiki", "eden"]
# ["eden", "kiki"]

# ["marina", "josipa", "nikola", "vinko", "filipa"]
# ["josipa", "filipa", "marina", "nikola"]

participant = ["mislav", "stanko", "mislav", "ana"]
completion = ["stanko", "ana", "mislav"]

answer = ''

answer = list(Counter(participant) - Counter(completion))[0]

print(answer)