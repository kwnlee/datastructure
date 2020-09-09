import java.util.Scanner;
import java.util.Stack;

public class Ex10818 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int tmp = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(scan.next());
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		System.out.println(arr[0] + " " + arr[n-1]);
	}

}
