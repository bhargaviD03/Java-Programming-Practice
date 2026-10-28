package Methodoverloading;

public class CalculatorMultiply {
	
		// Method Overloading with a Calculator class for Multiply method
			
			int Mul(int a , int b) {
				return (a*b);
			}
			double Mul(double  a , double  b, double  c) {
				return (a*b*c);
			}
			 float Mul(float a , float b) {
				return (a*b);
			}
			
			int Mul(int a , int b,int c) {
				return (a*b*c);
			}
			
			double Mul(int a , double b) {
				return (a*b);
			}
			
			public static void main(String[] args) {
				CalculatorMultiply  Multiply = new CalculatorMultiply ();
				
				int Multi =Multiply.Mul( 10, 5);
				 System.out.println("Product of two integers:" + Multi);
				double Multi1 =Multiply.Mul(1.5d, 2.5d, 3.5d);
				 System.out.println("Product of three doubles:" + Multi1);
				 float Multi2 =Multiply.Mul(2.5f, 4.5f);
				 System.out.println("Product of two floats:"+ Multi2);
				 int Multi3 =Multiply.Mul(30, 20, 10);
				 System.out.println("Product of three integers:" + Multi3);
				 double Multi4 = Multiply.Mul(6, 3.5d);
				 System.out.println("Product of integer and a double:" + Multi4);
				 
			}

}
