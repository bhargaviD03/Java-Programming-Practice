package ifElse;

import java.util.Scanner;

public class numendswithzero {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		long n =sc.nextLong();
		if(n%10==0 ) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}
}
