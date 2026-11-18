package polymorphism;

import java.util.Scanner;

public class plane {
	public void fly() {
		
	}
	
static class cargoplane extends plane{
	@Override
	public void fly() {
		System.out.println("Cargo plane is flying at low heights");
	}
	
}

static class passengerplane extends plane{
	@Override
	public void fly() {
		System.out.println("Passenger plane is flying at Medium heights");
	}
	
}

static class fighterplane extends plane{
	@Override
	public void fly() {
		System.out.println("Fighter plane is flying at greater heights");
	}
	
}

 static class Airport{
	public void sky(plane ref) {
		ref.fly();
	}
}
	public static void main(String[] args) {

		Airport a = new Airport();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the category you need:");
		String s= sc.nextLine();
		
		if(s.equals("cargoplane")) {
			cargoplane cp= new cargoplane();
			a.sky(cp);
		}else if(s.equals("passengerplane")) {
			passengerplane pp= new passengerplane();
			a.sky(pp);
		}else if(s.equals("fighterplane")){
			fighterplane fp= new fighterplane();
			a.sky(fp);
		}
		sc.close();
	}

}
