package ifElse;
import java.util.Scanner;

public class DivisibleByFour {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n =sc.nextInt();
		if(n%4==0) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}

}
