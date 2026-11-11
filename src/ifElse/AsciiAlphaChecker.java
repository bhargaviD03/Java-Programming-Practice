package ifElse;
import java.util.Scanner;

public class AsciiAlphaChecker {


		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the number:");
			int n =sc.nextInt();
			if((n>=65 && n<=90) || (n>=97 && n<=122)) {
				System.out.println("Alphabet");
			}else{
				System.out.println("Not an Alphabet");
			}
			sc.close();
		}

	}

