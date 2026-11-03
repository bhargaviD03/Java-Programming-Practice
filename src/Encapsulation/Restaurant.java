package Encapsulation;
import java.util.Scanner;
public class Restaurant {
	private int id;
	private String name;
	private String email;
	private Long phone;
	private String address;

	public void setRestaurant(int id,String name,String email,Long phone,String address) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.phone=phone;
		this.address=address;
	}
	
	public int getid() {
		return id;
	}
	
	public String getname() {
		return name;
	}
	
	public String getemail() {
		return email;
	}
	
	public Long getphone() {
		return phone;
	}
	
	public String getaddress() {
		return address;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		String[] data = input.split(",");
		
		int id =Integer.parseInt(data[0]);
		String name=data[1];
		String email=data[2];
		Long phone =Long.parseLong(data[3]);
		String address=data[4];
		
		Restaurant R = new Restaurant();
		
		R.setRestaurant(id,name,email,phone,address);
		
		System.out.println(R.getid());
		System.out.println(R.getname());
		System.out.println(R.getemail());
		System.out.println(R.getphone());
		System.out.println(R.getaddress());
	}

}
