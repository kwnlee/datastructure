package day0827;

import java.util.HashSet;

public class lotto {
	public static void main(String[] args) {
		for(int i = 0; i<5; i++) {
		HashSet<Integer> set = new HashSet<>();
		while(set.size() < 7) {
			set.add((int)Math.floor(Math.random()*45) + 1);
		}
		System.out.println(set);
		}
		
	}
	public static void test(String[] args) {
		//6개의 숫자를 담고있는 배열 arr
		//1)1~45범위의 2)자연수 3)중복허용X 
		int arr[] = new int[6];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)Math.floor(Math.random()*45)+1;
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i = i - 1;
					
				}
			}
			System.out.print("[" + arr[i] + "]");
		}
		
	}
}
