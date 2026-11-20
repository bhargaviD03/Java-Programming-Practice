package AbstractAndInterface;

import java.util.Scanner;

interface shapes1{
	 void acceptInput();
		void calcArea();

}
 
 class Squares implements shapes1{
	 Scanner sc = new Scanner(System.in);
	 float side;
	 float area;
	 @Override
	  public void acceptInput() {
		  side = sc.nextFloat();
	  }
	 @Override
	  public void calcArea() {
			area= side*side;
	 }
	 
 }
 
 class Rectangles implements shapes1{
	 Scanner sc = new Scanner(System.in);
	 float length,breadth;
	 float area;
	 @Override
	  public void acceptInput() {
		  length= sc.nextFloat();
		  breadth= sc.nextFloat();
	  }
	 @Override
	  public void calcArea() {
			area = length* breadth;
	 }
	 
 }
 
 class Circles implements shapes1{
	 Scanner sc = new Scanner(System.in);
	 float radius;
	 float area;
	 @Override
	  public void acceptInput() {
		  radius = sc.nextFloat();
	  }
	 @Override
	  public void calcArea() {
			area = (float)Math.PI*radius*radius;
	 }
	 
 }
 
 class Geometrys{
	void types(shapes ref) {
		 	ref.acceptInput();
			ref.calcArea();
			ref.getArea();
	 }
 }
 
	
public class Interface {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Geometrys g = new Geometrys();
		String input=sc.nextLine();
		if(input.equalsIgnoreCase("Square")) {
		Square s =new Square();
		System.out.println("Area of Square:");
			g.types(s);
		}else if(input.equalsIgnoreCase("Rectangle")) {
            Rectangle r = new Rectangle();
            System.out.println("Area of rectangle:");
            g.types(r);
        }else if (input.equalsIgnoreCase("Circle")) {
            Circle c = new Circle();
            System.out.println("Area of circle:");
            g.types(c);
        }else{
            System.out.println("Invalid shape");
        }
        sc.close();
    }
}



