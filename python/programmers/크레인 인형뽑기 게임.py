board = [[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]
moves = [1,5,3,5,1,2,1,4]

answer = 0
basket = []

for m in moves:
    j = m - 1
    for i in range(len(board)):
        if board[i][j] != 0:
            basket.append(board[i][j])
            board[i][j] = 0
            
            for b in range(1, len(basket)):
                if basket[b] == basket[b-1]:
                    basket.pop()
                    basket.pop()
                    answer += 2
            break
        
print(answer)