package Methods;
import java.util.Scanner;

public class SquareOfaNumber {

			int Square(int n) {
				// Square of a 2 number
				return n*n ;
				
			}

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the value of N:");
				int n = sc.nextInt();
				SquareOfaNumber   C = new SquareOfaNumber();
				int result= C.Square(n);
				System.out.println("Square of " + n + " is : " + result);
				sc.close();


	}

}
