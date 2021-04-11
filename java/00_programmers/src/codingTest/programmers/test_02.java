package codingTest.programmers;

import java.util.ArrayList;

public class test_02 {
	
	public static void main(String[] args) {
		
//		크레인 인형뽑기 게임
//		
//		board																moves					result
//		[[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]		[1,5,3,5,1,2,1,4]		4		
		
		int[][] board = {{0, 0, 0, 0, 0},
						 {0, 0, 1, 0, 3},
						 {0, 2, 5, 0, 1},
						 {4, 2, 4, 4, 2},
						 {3, 5, 1, 3, 1}};
		
		int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
		
        int answer = 0;
        
        ArrayList<Integer> basket = new ArrayList<Integer>();
        
        for(int m = 0; m < moves.length; m++) {
        	int j = moves[m]-1;
        	
        	for(int i = 0; i < board.length; i++) {
        	
        		if(board[i][j] != 0) {
        			basket.add(board[i][j]);
        			board[i][j] = 0;
        		
        				for(int b = 1; b < basket.size(); b++) {
        					
        					if(basket.get(b) == basket.get(b-1)) {
        						basket.remove(b);
        						basket.remove(b-1);
        						answer+=2;
        					}
        				}
        			break;
        		} 
        	}
        }
        System.out.println(answer);
	}
}
