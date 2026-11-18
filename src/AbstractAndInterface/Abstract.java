package AbstractAndInterface;
import java.util.Scanner;

 abstract class Animals { 	
 	abstract void sound();
 	abstract void sleep();
 }

 class Lions extends Animals{
 	@Override
 	public void sound() {
 		System.out.println("Lion is eating meat");
 	}
 	@Override
 	public void sleep() {
 		System.out.println("Lion sleeps in its den for 8 hours");
 	}
 }

 class Deers extends Animals{
	 	@Override
	 	public void sound() {
	 		System.out.println("Deer is eating grass");
	 	}
	 	@Override
	 	public void sleep() {
	 		System.out.println("Deer sleeps in the forest for 6 hours");
	 	}
	 }
 
 class Tigers extends Animals{
 	@Override
 	public void sound() {
 		System.out.println("Tiger is eating meat");
 	}
 	@Override
 	public void sleep() {
 		System.out.println("Tiger sleeps under a tree for 7 hours");
 	}
 }
 
  class Forest{
	 public void forest(Animals ref) {
		 ref.sound();
		 ref.sleep();
	 }
 }
 public class Abstract{
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		Forest f = new Forest();
 		String input = sc.nextLine();
 		if(input.equalsIgnoreCase("Lion")) {
 			Lions l= new Lions();
 			f.forest(l);
 
 		}else if(input.equalsIgnoreCase("Deer")) {
 			Deers d= new Deers();
 			f.forest(d);

 		}else if(input.equalsIgnoreCase("Tiger")) {
 			Tigers t= new Tigers();
 			f.forest(t);

 		}
 		sc.close();

 	}
 }
