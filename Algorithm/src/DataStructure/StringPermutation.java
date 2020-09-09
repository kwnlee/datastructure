package DataStructure;

public class StringPermutation {
	//문자열을 정렬하는 함수 sort, 매개변수 문자열 s
	private static String sort(String s) {
		//문자열 안에 있는 문자를 하나씩 배열에 저장
		char[] content = s.toCharArray();
		//자바 유틸안에 있는 sort함수로 정렬해준다
		java.util.Arrays.sort(content);
		//정렬된 문자열을 다시 String으로 반환
		return new String(content);
	}

	//두 개의 문자열이 서로 치환인지 확인하는 함수 permutation, 두 문자열을 인자로 받고
	private static boolean permutation(String s, String t) {
		//문자열의 길이가 다르면 바로 false 반환
		if(s.length() != t.length()) return false;
		//정렬한 문자열이 같은지 체크 
		return sort(s).equals(sort(t));
	}
	
	private static boolean permutation2(String s, String t) {
		//두 개의 문자열 길이가 다르면 return false
		if(s.length() != t.length()) return false;
		
		//128개의 정수 배열 만들고 
		int[] letters = new int[128];
		for(int i = 0; i < s.length(); i++) {
			//문자열 배열을 돌면서 각 문자의 아스키 값을 인덱스로 하고, 존재할 경우 +1
			letters[s.charAt(i)]++;
		}
		for(int i = 0; i < t.length(); i++) {
			//비교할 문자열의 각 문자의 아스키 값을 인덱스로 하고, 존재할 경우 -1
			letters[t.charAt(i)]--;
			//존재하지 않는 문자열일 경우 문자열 s에 없던 문자이므로 return false 
			if(letters[t.charAt(i)] < 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(permutation2("ABC", "BCA"));
		System.out.println(permutation2("ABC", "BDA"));
	}
}