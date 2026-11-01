package Encapsulation;
import java.util.Scanner;
import java.util.Calendar;

public class CarInfo {
	private String make;
	private String model;
	private int year;
	private float price;
	
	public void setMake(String make) {
		if(!make.trim().isEmpty()) this.make=make;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setModel(String model) {
		if(!model.trim().isEmpty()) this.model=model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setYear(int year) {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		if(year >= 1886 && year <= currentYear) this.year=year;
	}
	public int getYear() {
		return year;
	}
		
	public void setPrice(float price) {	
		if(price > 0) this.price=price;
	}
	
	public float getPrice() {
		return price;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int n = sc.nextInt();
		 sc.nextLine();
		 
		CarInfo[] store =new CarInfo[n];
		
		for(int i=0;i<n;i++) {
			CarInfo C=new CarInfo();
			
			 String details = sc.nextLine();
			 String[] arr = details.split(",");
			 
			 C.setMake(arr[0].trim());
			 C.setModel(arr[1].trim());
			 C.setYear(Integer.parseInt(arr[2].trim()));
			 C.setPrice(Float.parseFloat(arr[3].trim()));
			 
			 store[i] = C;
		}
		for(int i=0;i<store.length;i++) {
			System.out.println(store[i].getMake()+" "+store[i].getModel()+" "+store[i].getYear()+" "+store[i].getPrice());
		}
	}

}
