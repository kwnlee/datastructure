import java.util.Scanner;

public class Ex1001 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		if(A > 0 && A < 10 && B > 0 && B < 10) {
			System.out.println(A-B);
			
		}
	}
}
