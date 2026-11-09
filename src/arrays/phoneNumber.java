package arrays;
import java.util.Scanner;

public class phoneNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] Phone = new long[n];
		
		System.out.println("The phone nubers are:");
		for (int i=0;i<n;i++) {
			Phone[i] = sc.nextLong();
		}
		for (int i=0;i<n;i++) {
			System.out.println(Phone[i]);
		}
		sc.close();
	}
	
}
