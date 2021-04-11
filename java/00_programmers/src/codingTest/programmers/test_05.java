package codingTest.programmers;

import java.util.ArrayList;
import java.util.Comparator;

public class test_05 {

	public static void main(String[] args) {
		
//		모의고사
//		
//		1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//		2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//		3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
		
//		answers			return
//		[1,2,3,4,5]		[1]
//		[1,3,2,4,2]		[1,2,3]
		
		int[] answers = {1, 3, 2, 4, 2};
		
        int[] answer = {};
        
        ArrayList<Integer> st1 = new ArrayList<Integer>();
        ArrayList<Integer> st2 = new ArrayList<Integer>();
        ArrayList<Integer> st3 = new ArrayList<Integer>();
        
        ArrayList<Integer> temp = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        
        for(int i = 0; i < answers.length; i++){
            if(i % 5 == 0){
                st1.add(1);
                st1.add(2);
                st1.add(3);
                st1.add(4);
                st1.add(5);
            }
            
            if(i % 8 == 0){
                st2.add(2);
                st2.add(1);
                st2.add(2);
                st2.add(3);
                st2.add(2);
                st2.add(4);
                st2.add(2);
                st2.add(5);
            }
            
            if(i % 10 == 0){
                st3.add(3);
                st3.add(3);
                st3.add(1);
                st3.add(1);
                st3.add(2);
                st3.add(2);
                st3.add(4);
                st3.add(4);
                st3.add(5);
                st3.add(5);
            }
            
            if(answers[i] == st1.get(i)) count1++;
            if(answers[i] == st2.get(i)) count2++;
            if(answers[i] == st3.get(i)) count3++;
        }
        
        temp.add(count1);
        temp.add(count2);
        temp.add(count3);
        
        temp.sort(Comparator.reverseOrder());
        
        if(temp.get(0) == count1) result.add(1);
        if(temp.get(0) == count2) result.add(2);
        if(temp.get(0) == count3) result.add(3);
        
        answer = new int[result.size()];
        
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
                
        for(int a : answer) System.out.print(a + " ");
		
	}
}
