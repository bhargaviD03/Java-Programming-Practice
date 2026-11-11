package ifElse;
import java.util.Scanner;

public class Numgreaterthanhundred {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n =sc.nextInt();
		if(n>=100) {
			System.out.println("Greater than 100");
		}else{
			System.out.println("Not Greater than 100");
		}
		sc.close();
	}

}
