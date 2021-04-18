package codingTest.programmers;

public class test_09 {
	
	public static void main(String[] args) {
		
//		단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
//
//		재한사항
//		s는 길이가 1 이상, 100이하인 스트링입니다.
//		
//		입출력 예
//		
//		s			return
//		"abcde"		"c"
//		"qwer"		"we"
		
		String s = "abcde";
        String answer = "";
        
        int num = (s.length()-1)/2;

        if(s.length() == 1 || s.length() == 2)answer = s;
        else if(s.length()>2 && s.length()%2 == 0) answer = s.substring(num, num+2);
        else if(s.length()>2 && s.length()%2 == 1) answer = s.substring(num, num+1);

        System.out.println(answer);
	}
}
