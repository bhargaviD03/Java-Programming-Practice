package polymorphism;

import java.util.Scanner;

public class Sports {
	public void play() {
		
	}
	
	static class Football extends Sports{
		@Override
		public void play() {
			System.out.println("playing football on the field");
		}
	}
	
	static class Basketball extends Sports{
		@Override
		public void play() {
			System.out.println("playing basketball on the court");
		}
	}
	
	static class Rugby extends Sports{
		@Override
		public void play() {
			System.out.println("playing rugby on the pitch");
		}
	}
	
	static class playground{
		public void ground(Sports ref) {
			ref.play();
		}
	}
	public static void main(String[] args) {
		playground p = new playground();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the category you need:");
		String s= sc.nextLine();
		
		if(s.equalsIgnoreCase("Football")) {
			Football f= new Football();
			p.ground(f);
		}else if(s.equalsIgnoreCase("Basketball")) {
			Basketball b= new Basketball();
			p.ground(b);
		}else if(s.equalsIgnoreCase("Rugby")) {
			Rugby r= new Rugby();
			p.ground(r);
		}
		sc.close();
	}
	
}
