package Methodoverloading;

public class CalculatorSubtract {

	// Method Overloading with a Calculator class for Subtract method
		
		int sub(int a , int b) {
			return (a-b);
		}
		double sub(double  a , double  b, double  c) {
			return (a-b-c);
		}
		 float sub(float a , float b) {
			return (a-b);
		}
		
		int sub(int a , int b,int c) {
			return (a-b-c);
		}
		
		double sub(int a , double b) {
			return (a-b);
		}
		
		public static void main(String[] args) {
			CalculatorSubtract  Subtract = new CalculatorSubtract ()	;
			 System.out.println(Subtract.sub( 25, 15));
			 System.out.println( Subtract.sub(14.0d, 7.0d, 3.0d));
			 System.out.println(Subtract.sub(25.0f, 21.0f));
			 System.out.println(Subtract.sub(30, 20, 5));
			 System.out.println(Subtract.sub(15, 7.5d));
			 
		}
	}

