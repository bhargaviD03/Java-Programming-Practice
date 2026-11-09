package inheritance;

import java.util.Scanner;

public class AnimalSound {
		private String name;
		private int age;
		
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		
		public void setage(int age) {
			this.age=age;
		}
		public int getage() {
			return age;
		}
		
		public String getSound() {
			return " ";
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();
		
		if(input.equalsIgnoreCase("Dog")) {
			Dog D = new Dog();
			
			String Details = sc.nextLine();
			String[] arr = Details.split(",");
			
			D.setName(arr[0]);
			D.setage(Integer.parseInt(arr[1]));
			D.setbreed(arr[2]);
			System.out.println("Sound of Dog:"+D.getSound());
		}
		else if(input.equalsIgnoreCase("Cat")) {
			Cat C = new Cat();
			
			String Details = sc.nextLine();
			String[] arr = Details.split(",");
			
			C.setName(arr[0]);
			C.setage(Integer.parseInt(arr[1]));
			C.setColor(arr[2]);
			System.out.println("Sound of Cat:"+C.getSound());
		}
		sc.close();
	}

}
class Dog extends AnimalSound {
	private String breed;
	
	public void setbreed(String breed) {
		this.breed=breed;
	}
	public String getbreed() {
		return breed;
	}
	@Override
	public String getSound() {
		return super.getSound()+"Bark";
	}
}
 class Cat extends AnimalSound {
		private String color;
		
		public void setColor(String color) {
			this.color=color;
		}
		public String getColor() {
			return color;
		}
		@Override
		public String getSound() {
			return super.getSound()+"Meow";
		}
	}