package Methods;
import java.util.Scanner;

public class CubeOfaNumber {
		int Cube (int n) {
				// Cube of a number
				return n*n*n ;
			}

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the value of N:");
				int n = sc.nextInt();
				CubeOfaNumber   C = new CubeOfaNumber();
				int result= C.Cube(n);
				System.out.println("Cube of " + n + " is : " + result);
				sc.close();						
	}

}
