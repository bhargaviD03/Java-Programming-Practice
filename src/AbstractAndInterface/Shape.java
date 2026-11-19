package AbstractAndInterface;

import java.util.Scanner;

abstract class shapes{
	float area;
	abstract void acceptInput();
	abstract void calcArea();
	public void getArea() {
		System.out.println(area);	
	}
}
 
 class Square extends shapes{
	 Scanner sc = new Scanner(System.in);
	 float side;
	 @Override
	  public void acceptInput() {
		  side = sc.nextFloat();
	  }
	 @Override
	  public void calcArea() {
			area= side*side;
	 }
	 
 }
 
 class Rectangle extends shapes{
	 Scanner sc = new Scanner(System.in);
	 float length,breadth;
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
 
 class Circle extends shapes{
	 Scanner sc = new Scanner(System.in);
	 float radius;
	 @Override
	  public void acceptInput() {
		  radius = sc.nextFloat();
	  }
	 @Override
	  public void calcArea() {
			area = (float)Math.PI*radius*radius;
	 }
	 
 }
 
 class Geometry{
	void type(shapes ref) {
		 	ref.acceptInput();
			ref.calcArea();
			ref.getArea();
	 }
 }
 
public class Shape {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Geometry g = new Geometry();
		String input=sc.nextLine();
		if(input.equalsIgnoreCase("Square")) {
		Square s =new Square();
		System.out.println("Area of Square:");
			g.type(s);
		}else if(input.equalsIgnoreCase("Rectangle")) {
            Rectangle r = new Rectangle();
            System.out.println("Area of rectangle:");
            g.type(r);
        }else if (input.equalsIgnoreCase("Circle")) {
            Circle c = new Circle();
            System.out.println("Area of circle:");
            g.type(c);
        }else{
            System.out.println("Invalid shape");
        }
        sc.close();
    }
}
