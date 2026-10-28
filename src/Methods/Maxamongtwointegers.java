package Methods;
import java.util.Scanner;

public class Maxamongtwointegers {
	
	void Max(int X, int Y) {
		// Maximum among 2 Integers
		if (X > Y){
			System.out.println("Maximum value is X :" +X);
		}else {
			System.out.println("Maximum value is Y:" +Y);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of X:");
		int X = sc.nextInt();
		System.out.println("Enter the value of Y:");
		int Y = sc.nextInt();
		Maxamongtwointegers  C = new Maxamongtwointegers();
		C.Max(X,Y);
		sc.close();

	}

}
