package inheritance;

import java.util.Scanner;

public class VehicleInfo {
	private String brand;
	private String model;
	
	public void setbrand(String brand) {
		this.brand=brand;
	}
	public String getbrand() {
		return brand;
	}
	
	public void setmodel(String model) {
		this.model=model;
	}
	public String getmodel() {
		return model;
	}
	
	public String getInfo() {
		return "VehicleInfo:"+" " +"Brand:"+brand+" "+"model:"+model+" ";
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();
		
		if(input.equalsIgnoreCase("Car")) {
		Car C = new Car();			
		String details = sc.nextLine();
		String[] arr = details.split(",");
		C.setbrand(arr[0]);
		C.setmodel(arr[1]);
		C.setNoOfSeats(Integer.parseInt(arr[2]));
			System.out.println (C.getInfo());
		}else if(input.equalsIgnoreCase("Bike")) {
			Bike B = new Bike();			
			String details = sc.nextLine();
			String[] arr = details.split(",");
			B.setbrand(arr[0]);
			B.setmodel(arr[1]);
			B.setType((arr[2]));
				System.out.println (B.getInfo());
		}
		sc.close();
	}
}

class Car extends VehicleInfo {
	private int NoOfSeats;
	
	public void setNoOfSeats(int  NoOfSeats) {
		this. NoOfSeats= NoOfSeats;
	}
	public int getNoOfSeats() {
		return  NoOfSeats;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo()+ "Seats:"+NoOfSeats;
	}
}



 class Bike extends VehicleInfo {
	private String Type;
	
	public void setType(String Type) {
		this. Type= Type;
	}
	public String getType() {
		return Type;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo()+ "Type of vehicle:"+Type;
	}
}

