package codingTest.programmers;

import java.util.ArrayList;
import java.util.TreeSet;

public class test_01 {
	
//	두 개 뽑아서 더하기
	
//	정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아
//	더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
	
//	numbers			result
//	[2,1,3,4,1]		[2,3,4,5,6,7]
//	[5,0,2,7]		[2,5,7,9,12]
	
	public static void main(String[] args) {
		
		int[] numbers = {2, 1, 3, 4, 1};
		int[] answer = {};
		
		TreeSet<Integer> result = new TreeSet<Integer>();
		
		for(int i = 0; i < numbers.length; i++){
			for(int j = i+1; j < numbers.length; j++){
				
				result.add(numbers[i] + numbers[j]);
			}
		}
		
		ArrayList<Integer> temp = new ArrayList<Integer>(result);
		answer = new int[temp.size()];
		
		for(int i = 0; i < answer.length; i++) answer[i] = temp.get(i);
		
		for(int a : answer) System.out.print(a + " ");
		
	}
}
