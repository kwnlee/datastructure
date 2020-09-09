package DataStructure;

public class PalindromeStr {

	private static boolean isPermutationOfPalindrome(String s) {
		// 문자열의 문자를 정수형 배열 table에 담기
		int[] table = buildCharFrequencyTable(s);
		// 문자열에 홀수개의 문자가 1개 초과로 발견되면 false를 반환하는 함수 checkMaxOneOdd
		return checkMaxOneOdd(table);
	}

	// 문자열의 문자갯수를 세서 배열에 저장하는 함수
	private static int[] buildCharFrequencyTable(String s) {
		// 배열은 z의 아스키값에서 a의 아스키값을 빼준 값에 1을 더해서 사이즈를 26으로 만듦
		int[] table = new int[Character.getNumericValue('z') 
		                      - Character.getNumericValue('a') + 1];
		// 문자열을 char 배열로 반환해서 한 글자씩 돌린다
		for (char c : s.toCharArray()) {
			// a의 아스키값은 97인데 97을 인덱스에 그대로 못씀
			// 변환을 위해 getCharNumber라는 함수 만들어서 배열 인덱스 받아옴
			int x = getCharNumber(c);
			if (x != -1) {
				// 문자가 a~z인 경우에만 인덱스 증가
				table[x]++;
			}
		}
		// 문자로 이루어진 배열 반환
		return table;
	}

	// 문자로 배열인덱스를 가져오는 getCharNumber 함수
	// 소문자 a~z범위 밖의 문자(특수문자 공백 등)은 -1를 반환
	private static int getCharNumber(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		// 인자로 받은 문자의 아스키값 val
		int val = Character.getNumericValue(c);
		// 인자로 받은 아스키 값은 a~z사이에 존재하는 소문자
		if (a <= val && val <= z) {
			// a를 인덱스 0으로
			return val - a;
		}
		// 알파벳 소문자가 아니면 -1 반환
		return -1;
	}

	// 문자열의 개수가 저장된 배열 table을 돌면서 홀수개인 문자가 2개이상인지 확인하는 함수
	private static boolean checkMaxOneOdd(int[] table) {
		boolean foundOdd = false;
		for (int count : table) {
			// 홀수개인 문자가 하나 발견되면
			if (count % 2 == 1) {
				// 나머지 문자들 중 홀수개인 애들이 없을 때 true
				if (!foundOdd) {
					foundOdd = true;
				} else {
					// 아니면 false
					return false;
				}

			}
		}
		// 모두 짝수개이면 true
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPermutationOfPalindrome("aa bb cc dd"));
		System.out.println(isPermutationOfPalindrome("aa bb cc dd e"));
		System.out.println(isPermutationOfPalindrome("aa bb cc dd d fff"));

	}

}
