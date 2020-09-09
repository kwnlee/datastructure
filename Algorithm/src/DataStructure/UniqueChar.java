package DataStructure;

import java.util.HashMap;

//주어진 문자열의 문자들이 모두 고유한지 확인하는 함수를 구현하시오
//만약 별도의 저장공간을 사용하지 못하는 경우에는 어떻게 해결할지도 추가로 설명하시오 

public class UniqueChar {
	//문자열의 문자가 고유한지 확인하는 함수 (매개변수는 문자열) 
	private static boolean isUnique(String str) {
		//아스키가 총 128개이므로 128초과시 무조건 중복발생. return false
		if (str.length() > 128)
			return false;
		//각 문자의 존재 여부를 저장할 128개의 배열 생성
		boolean[] char_set = new boolean[128];
		//문자열을 한 자씩 돌면서 true인지를 확인
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			//이전에 존재했던 값이면 (최초로 등장하는값이 아니면) false를 반환
			if (char_set[val]) {
				return false;
			}
			//아니면 해당 인덱스 값 true로
			char_set[val] = true;
		}
		return true;
	}
	

	private static boolean isUnique2(String str) {
		//문자들을 저장할 해쉬맵 선언
		HashMap<Integer, Boolean> hashmap = new HashMap<Integer, Boolean>();
		//for문을 돌며 문자를 한 개씩 가져와서 
		for(int i = 0; i < str.length(); i++) {
			int c = str.charAt(i);
			//입력된 적 있는 key인지 확인
			if(hashmap.containsKey(c)) {
				return false;
			}
			//그렇지 않으면 문자를 key로 입력하고 true를 반환
			hashmap.put(c, true);
		}
		return true;
	}
	
	private static boolean isUnique3(String str) {
		//각 문자의 존재여부를 마킹할 정수형 숫자 checker
		int checker = 0;
		for(int i = 0; i < str.length(); i++) {
			//for문을 돌면서 문자열을 가져오고 그 아스키값에서 a만큼(97만큼) 빼준다 
			int val = str.charAt(i) - 'a';
			//1을 해당 문자만큼 shift한 값이 checker안에 들어있는지 비트연산자 &로 확인 
			if((checker & (1 << val)) > 0) {
				return false;
			}
			//1을 해당 문자만큼 shift한 값을 checker에 넣어줌 
			checker |= (1 << val);
		}
		return true; 
	}

	public static void main(String[] args) {
		System.out.println(isUnique3("abcdefgghijk"));
		System.out.println(isUnique3("abcdefghijk"));
	}

}
