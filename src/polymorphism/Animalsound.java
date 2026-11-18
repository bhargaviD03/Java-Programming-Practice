package polymorphism;

import java.util.Scanner;

public class Animalsound {
	public void sound() {
		
	}
	
	static class Bird extends Animalsound{
		@Override
		public void sound() {
			System.out.println("chirp");
		}
	}
	
	static class Cat extends Animalsound{
		@Override
		public void sound() {
			System.out.println("Meow");
		}
	}
	
	static class Audible {
		public void range(Animalsound ref) {
			ref.sound();
		}
	}
	public static void main(String[] args) {
		Audible a = new Audible();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the category you need:");
		String s = sc.nextLine();
		
		if(s.equalsIgnoreCase("Bird")) {
			Bird b=new Bird();
			a.range(b);
		}else if(s.equalsIgnoreCase("Cat")) {
			Cat c=new Cat();
			a.range(c);
		} 
		sc.close();
	}

}
