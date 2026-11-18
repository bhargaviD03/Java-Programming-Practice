package polymorphism;

import java.util.Scanner;

public class Vehicle {
	public void startEngine() {
		
	}
	public void stopEngine() {
		
	}
	
	static class Car extends Vehicle {
		@Override
		public void startEngine() {
			System.out.println("Car Engine started");
		}
		@Override
		public void stopEngine() {
			System.out.println("Car Engine stopped");
		}
	}
	
	static class Motorcycle extends Vehicle {
		@Override
		public void startEngine() {
			System.out.println("Motorcycle Engine started");
		}
		@Override
		public void stopEngine() {
			System.out.println("Motorcycle Engine stopped");
		}
	}
	
	static class Engine {
		public void rate(Vehicle ref) {
			ref.startEngine();
			ref.stopEngine();
		}
	}
		
	public static void main(String[] args) {
		Engine e = new Engine();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the category you need:");
		String s= sc.nextLine();
		
		if(s.equalsIgnoreCase("Car")) {
			Car c = new Car();
			e.rate(c);
		}else if(s.equalsIgnoreCase("Motorcycle")) {
			Motorcycle m = new Motorcycle();
			e.rate(m);
		}
		sc.close();
	}

}
