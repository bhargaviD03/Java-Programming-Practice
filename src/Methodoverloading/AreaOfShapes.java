package Methodoverloading;

public class AreaOfShapes {
	// Calculate area of shapes
	void CalulateArea(int a) {
		System.out.println("Area of the square:" + a*a);
	}
	
	void CalulateArea(double l, double b) {
		System.out.println("Area of rectangle:" + 1*b);
	}
	
	void CalulateArea(double r) {
		System.out.println("Area of Circle:" + ((Math.PI)*r*r));
	}
	
	void CalulateArea(int b, double h) {
		System.out.println("Area of Triangle:" + ((0.5)*b*h) );
	}
	
	
	public static void main(String[] args) {
		AreaOfShapes Area=new AreaOfShapes();
		Area.CalulateArea(5);
		Area.CalulateArea(10.0d, 30.0d);
		Area.CalulateArea(3.0);
		Area.CalulateArea(8,6.5);
		
	}
}
