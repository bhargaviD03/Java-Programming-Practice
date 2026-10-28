package Methodoverloading;

public class Calulator {
	// Method Overloading with a Calculator class  for add method
	
	int add(int a , int b) {
		return (a+b);
	}
	double add(double  a , double  b, double  c) {
		return (a+b+c);
	}
	 float add(float a , float b) {
		return (a+b);
	}
	
	int add(int a , int b,int c) {
		return (a+b+c);
	}
	
	double add(int a , double b) {
		return (a+b);
	}
	
	public static void main(String[] args) {
		 Calulator Addition = new  Calulator ()	;
		 System.out.println(Addition.add( 5, 17));
		 System.out.println( Addition.add(4.05d, 5.07d, 6.05d));
		 System.out.println(Addition.add(5.0f, 7.0f));
		 System.out.println(Addition.add(7, 9, 5));
		 System.out.println(Addition.add(9, 7.7d));
		 
	}
}
