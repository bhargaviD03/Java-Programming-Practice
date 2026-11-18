package AbstractAndInterface;

import java.util.Scanner;

abstract class Animal {
	
	abstract void sound();
}

class Lion extends Animal{
	@Override
	public void sound() {
		System.out.println("Roar");
	}
}

class Tiger extends Animal{
	@Override
	public void sound() {
		System.out.println("Growl");
	}
}
public class AnimalSound{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		if(input.equalsIgnoreCase("Lion")) {
			Lion l= new Lion();
			l.sound();
		}else if(input.equalsIgnoreCase("Tiger")) {
			Tiger t= new Tiger();
			t.sound();
		}
		sc.close();

	}
}