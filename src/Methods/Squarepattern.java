
package Methods;
import java.util.Scanner;

public class Squarepattern {
	// Square pattern using methods
		void Pattern(int n) {
			
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
			
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		Squarepattern C = new Squarepattern();
		C.Pattern(n);
		sc.close();
		
	}

}
