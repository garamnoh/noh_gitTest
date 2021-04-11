package codingTest.programmers;

import java.util.Arrays;

public class test_03 {
	
	public static void main(String[] args) {
		
//		완주하지 못한 선수
//		
//		수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
//		마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
//		완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
		
//		participant												completion										return
//		["leo", "kiki", "eden"]									["eden", "kiki"]								"leo"
//		["marina", "josipa", "nikola", "vinko", "filipa"]		["josipa", "filipa", "marina", "nikola"]		"vinko"
//		["mislav", "stanko", "mislav", "ana"]					["stanko", "ana", "mislav"]						"mislav"
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
        String answer = "";
        
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i = 0; i < participant.length; i++) {
			
			if(i < participant.length -1) {
				
				if(!participant[i].equals(completion[i])) {
					answer = participant[i];
					break;
				}
			}
			answer = participant[participant.length-1];
			
		}
        System.out.println(answer);
	}
}
