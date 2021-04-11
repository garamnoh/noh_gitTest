package codingTest.programmers;

import java.util.ArrayList;
import java.util.HashSet;

public class test_07 {

	public static void main(String[] args) {
		
//		체육복
//		
//		점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다.
//		학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다.
//		예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다.
//		체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
//
//		전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때,
//		체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
		
//		n	lost		reserve		return
//		5	[2, 4]		[1, 3, 5]	5
//		5	[2, 4]		[3]			4
//		3	[3]			[1]			2
		
		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {3};
		
        int answer = 0;
        
		ArrayList<Integer> answers = new ArrayList<Integer>();
		ArrayList<Integer> lostList = new ArrayList<Integer>();

        for(int i : lost) lostList.add(i);

		for(int i = 1; i <= n; i++) {
			if(!lostList.contains(i)) answers.add(i);
		}

		for(int i : reserve) {
			answers.add(i);
		}
        
        answers.sort(null);
        
        int size = answers.size();
        
		for(int i = 0; i < lostList.size(); i++) {
			for(int j = 1; j < size; j++) {
				if(!answers.contains(lostList.get(i))
					&& (answers.get(j)==answers.get(j-1))
					&& (lostList.get(i)-answers.get(j)==-1)) {
						
					answers.add(lostList.get(i));
					answers.set(j-1, 0);
					
				} else if(!answers.contains(lostList.get(i))
						&& (answers.get(j)==answers.get(j-1))
						&& (lostList.get(i)-answers.get(j)==1)) {
					
					answers.add(lostList.get(i));
					answers.set(j-1, 0);
					
				}
			}
		}

        HashSet<Integer> temp = new HashSet<Integer>(answers);
        answers = new ArrayList<Integer>(temp);
        
        if(answers.get(0)==0) answers.remove(0);
        
        answer = answers.size();
        
        System.out.println(answer);
	}
}
