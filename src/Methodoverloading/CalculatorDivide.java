package Methodoverloading;

public class CalculatorDivide {
			// Method Overloading with a Calculator class for Division method
				
				int Div(int a , int b) {
					return (a/b);
				}
				double Div(double  a , double  b, double  c) {
					return (a/b/c);
				}
				 float Div(float a , float b) {
					return (a/b);
				}
				
				int Div(int a , int b,int c) {
					return (a/b/c);
				}
				
				double Div(int a , double b) {
					return (a/b);
				}
				
				public static void main(String[] args) {
					CalculatorDivide  Division = new CalculatorDivide ();
					
					int Divide=Division.Div( 16, 4);
					 System.out.println("Quotient of two integers:" +  Divide);
					double Divide1=Division.Div(300.0d, 10.0d, 10.0d);
					 System.out.println("Quotient of three doubles:" +  Divide1);
					 float Divide2=Division.Div(9.0f, 3.0f);
					 System.out.println("Quotient of two floats:"+  Divide2);
					 int Divide3=Division.Div(160, 80, 40);
					 System.out.println("Quotient of three integers:" +  Divide3);
					 double Divide4=Division.Div(144, 12.0d);
					 System.out.println("Quotient of integer and a double:" +  Divide4);
					 
				}

	}

