package day0827;

import java.util.Scanner;

public class ProgrammersLv1 {
	
	//평균구하기 
    public static double avgInArr(int[] arr) {
        double answer = 0;
        double sum = 0;
        for(int i = 0; i < arr.length; i++) {
        	sum += arr[i];
        }
        return sum/arr.length;
    }

	// 문자열 내 p,y의 갯수
	public static boolean cntPandY(String s) {
		
		//프로그래머스 답안
//	      s = s.toUpperCase();
//	        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
		boolean answer = true;
		int pCount = 0;
		int yCount = 0;
		char[] temp = s.toCharArray();

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == 'p' || temp[i] == 'P') {
				pCount++;
			} else if (temp[i] == 'y' || temp[i] == 'Y') {
				yCount++;
			}
		}
		
		if(pCount == yCount) {
			return true;
		}else {
			return false;
		}

	}

	public static long sortIntegerDesc(long n) {
		long answer = 0;
		long a = 0;
		long cnt = 0;
		long[] arr = new long[(int) cnt];

		while (n > 0) {
			arr[(int) cnt] = n % 10;
			n = n / 10;
			cnt++;
		}
		System.out.println(arr);

		return answer;
	}

//	콜라츠
//	public static int colatz(int num) {
//		int answer = 0;
//
//		while (num > 0) {
//			if (num % 2 == 0) {
//				num = num / 2;
//			} else {
//				num = (num * 3) + 1;
//			}
//
//		}
//		return answer;
//	}

	// 같은 숫자는 싫어
//    public static int[] hateSameInt(int []arr) {
//        int[] answer = {};
//        
//
//        return answer;
//    }

	// 문자열 다루기 기본
	public static boolean checkStr(String s) {
		boolean answer = true;
		if (!(s.length() == 4 || s.length() == 6)) {
			return false;
		} else {
			for (int i = 0; i < s.length(); i++) {
				if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
					return false;
				}

			}
			return answer;
		}
	}

	// 자릿수 더하기
	public static int sumDigit(int n) {
		int answer = 0;
		while (n > 0) {
			answer += n % 10;
			n = n / 10;
		}
		return answer;
	}

	// 문자열을 정수로
	public static int strToInt(String s) {
		int answer = Integer.parseInt(s);
		return answer;
	}

	// 두 정수 사이의 합
	public static long sumTwoNums(int a, int b) {
		long answer = 0;
		if (a <= b) {
			for (int i = a; i <= b; i++) {
				answer += i;
			}
		} else {
			for (int i = b; i <= a; i++) {
				answer += i;
			}
		}
		return answer;
	}

	// 짝수와 홀수
	public static String oddOrEven(int num) {
		String answer = (num % 2 == 0) ? "Even" : "Odd";
		return answer;
	}

//	    소수찾기
//    public static int numOfDecimal(int n) {
//        int answer = 0;
//        int decimal = 0;
//        int[] arr = new int[n];
//        for(int i = 1; i <= n; i++) {
//        	for(int j = 1; j <= n; j++) {
//        		if(i%j != 0) {
//        			arr[i] = i;
//        			
//        		}else {
//        			arr[i] = arr[i+1];
//        		}
//        	}
//        }
//        
//        answer = arr.length;
//        return answer;
//    }

	// 약수의합
	public static int sumDivisor(int n) {
		int answer = 0;
		for (int i = n; i > 0; i--) {
			if (n % i != 0) {
				continue;
			} else {
				answer += i;
			}

		}
		return answer;
	}

	// 가운데 글자 가져오기
	public static String getMiddle(String s) {
		String answer = "";
		int length = s.length();
		if (length % 2 == 0) {
			answer = s.substring((length / 2) - 1, (length / 2) + 1);
		} else if (length % 2 == 1) {
			answer = s.substring((length / 2), (length / 2) + 1);
		}

		return answer;
	}

	// 2016년
	public static String whatDay(int a, int b) {
		String answer = "";
		int sum = 0;

		String[] dayArr = { "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
		int[] dateArr = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int i = 0; i < a - 1; i++) {
			sum += dateArr[i];
		}
		sum = sum + b;
		answer = dayArr[sum % 7];
		return answer;
	}

	// 수박수박수
	public static String watermelon(int n) {
		String answer = "";

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				answer += "수";
			} else {
				answer += "박";
			}
		}
		return answer;
	}

	// 김서방찾기
	public static String findKim(String[] seoul) {
		String answer = "";
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "김서방은 " + i + "에 있다";
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
//		평균구하기
//		int[] arr = new int[scan.nextInt()];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = Integer.parseInt(scan.next());
//		}
//		System.out.println(avgInArr(arr));
		
		
//		문자열 p,y의 갯수
//		String s = scan.nextLine();
//		System.out.println(cntPandY(s));
		
//		문자열 다루기 기본
//		String s = scan.nextLine();
//		System.out.println(checkStr(s));

//		자릿수 더하기
//		int n = scan.nextInt();
//		System.out.println(sumDigit(n));

//		문자열을 정수로
//		String s = scan.next();
//		System.out.println(strToInt(s));

//		두 정수 사이의 합
//		
//		int a = scan.nextInt();		
//		int b = scan.nextInt();		
//		
//		System.out.println(sumTwoNums(a, b));

//		짝수와 홀수
//		int n = scan.nextInt();
//		System.out.println(oddOrEven(n));

//		소수찾기
//		int n = scan.nextInt();
//		System.out.println(numOfDecimal(n));

//		약수의 합
//		int n = scan.nextInt();
//		System.out.println(sumDivisor(n));

//		가운데 글자 가져오기
//		System.out.println(getMiddle("qwer"));

//		2016년
//		int a = Integer.parseInt(scan.next());
//		int b = Integer.parseInt(scan.next());
//		System.out.println(whatDay(a, b));

//		직사각형 별찍기
//		Scanner scan = new Scanner(System.in);
//		int a = Integer.parseInt(scan.next());
//		int b = Integer.parseInt(scan.next());
//
//		for (int i = 0; i < b; i++) {
//			for (int j = 0; j < a; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		김서방찾기
//		String[] seoul = {"Jane", "Kim"};
//		System.out.println(findKim(seoul));

//		수박수박수
//		System.out.println(watermelon(3));
//		System.out.println(watermelon(4));

	}

}
