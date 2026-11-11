package ifElse;
import java.util.Scanner;

public class EquivalentAsciicheck {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n =sc.nextInt();
		if((n>=65 && n<=90) || (n>=97 && n<=122)) {
			System.out.println("Equivalent Ascii Character:"+(char)n);
		}else{
			System.out.println("Not an Alphabet Ascii value");
		}
		sc.close();
	}
}
