package Methodoverloading;

public class CalculatePerimeter {
	// // Calculate Perimeter of shapes
		
		void Perimeter(int a) {
			System.out.println("Perimeter of the square:" + 4*a);
		}
		
		void Perimeter(double l, double b) {
			System.out.println("Perimeter of rectangle:" + (2*(1*b)));
		}
		
		void Perimeter(double r) {
			System.out.println("Perimeter of Circle:" + (2*Math.PI*r));
		}
		
		void Perimeter(int a,int b,int c) {
			System.out.println("Perimeter of Triangle:" + (a+b+c));
		}
		
		public static void main(String[] args) {
			CalculatePerimeter  P=new CalculatePerimeter();
			P.Perimeter(4);
			P.Perimeter(3.5d, 7.5d);
			P.Perimeter(2.0);
			P.Perimeter(3,4,5);
			
		}
	}


