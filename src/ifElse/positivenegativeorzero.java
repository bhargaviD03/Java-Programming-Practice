package ifElse;
import java.util.Scanner;

public class positivenegativeorzero {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		long n =sc.nextLong();
		if(n>0) {
			System.out.println("Positive");
		}else if(n<0) {
			System.out.println("Negative");
		}else {
			System.out.println("Zero");
		}
		sc.close();
	}

}
