package Methods;
import java.util.Scanner;

public class MethodsProgramming {
	Scanner sc = new Scanner(System.in);
		void Greeting() {
			//Print a Message using a Method 
			String Message = "Hello, Welcome to Andhrapradesh!"; 
					System.out.println("Message:"+ Message);
		}
		void Add() {
			//Adding two numbers using a Method 
					System.out.println("Enter the value of a:");
					int a = sc.nextInt();
					System.out.println("Enter the value of b:");
					int b = sc.nextInt();
					
					int Result = a + b ;
					System.out.println("Result:"+ Result);
		}
		
		void Multiply() {
			//Multiply two numbers using a Method 
					System.out.println("Enter the value of a:");
					int a = sc.nextInt();
					System.out.println("Enter the value of b:");
					int b = sc.nextInt();
					int Result = a * b ;
					System.out.println("Result:"+ Result);
		}
		
		void Divide() {
			//Divide two numbers using a Method 
					System.out.println("Enter the value of a:");
					int a = sc.nextInt();
					System.out.println("Enter the value of b:");
					int b = sc.nextInt();
					int Result = a / b ;
					System.out.println("Result:"+ Result);
		}
		
		void Sub() {
			//Sub two numbers using a Method 
					System.out.println("Enter the value of a:");
					int a = sc.nextInt();
					System.out.println("Enter the value of b:");
					int b = sc.nextInt();
					int Result = a - b ;
					System.out.println("Result:"+ Result);
		}

		
		public static void main(String[] args) {
			MethodsProgramming C = new MethodsProgramming ();
			C.Greeting();
			C.Add();
			C.Multiply();
			C.Divide();
			C.Sub();
		}

}
