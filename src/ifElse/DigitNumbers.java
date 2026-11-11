package ifElse;
import java.util.Scanner;

public class DigitNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n =sc.nextInt();
		if((n>=10 && n<=99) || (n>=100 && n<=999) ) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}

}
