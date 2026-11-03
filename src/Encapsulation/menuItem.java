package Encapsulation;
import java.util.Scanner;

public class menuItem {

		private int id;
		private String name;
		private float price;
		private String description;

		public void setRestaurant(int id,String name,float price,String description) {
			this.id=id;
			this.name=name;
			this.price=price;
			this.description=description;
		}
		
		public int getid() {
			return id;
		}
		
		public String getname() {
			return name;
		}
		
		public float getprice() {
			return price;
		}

		public String getdescription() {
			return description;
		}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		
		String[] M = input.split(",");
		
		int id=Integer.parseInt(M[0]);
		String name=M[1];
		float price=Float.parseFloat(M[2]);
		String description=M[3];
		
		menuItem item = new menuItem();
		
		item.setRestaurant(id, name, price, description);
		
		System.out.println(item.getid());
		System.out.println(item.getname());
		System.out.println(item.getprice());
		System.out.println(item.getdescription());
	}

}
