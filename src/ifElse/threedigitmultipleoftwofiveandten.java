package ifElse;
import java.util.Scanner;

public class threedigitmultipleoftwofiveandten {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n =sc.nextInt();
		if(n>=100 && n<=999 && n%2==0 && n%5==0 && n%10==0 ) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}

}
