package Encapsulation;
import java.util.Scanner;
public class ProductInventory {
	private int productId;
	private String productName;
	private int quantity;
	private float price;
	
	public void setId(int productId) {
		this.productId=productId;
	}
	
	public int getId() {
		return productId;
	}
	
	public void setName(String productName) {
		this.productName=productName;
	}
	
	public String getName() {
		return productName;
	}
	
	public void setquantity(int quantity) {
		this.quantity=quantity;
	}
	
	public int getquantity() {
		return quantity;
	}
	
	public void setprice(float price) {
		this.price=price;
	}
	
	public float getprice() {
		return price;
	}
	public static void main(String[] args) {
		 ProductInventory P = new  ProductInventory();
		 Scanner sc = new Scanner(System.in);
		 int productId = sc.nextInt();
		 String productName = sc.next();
		 int quantity=sc.nextInt();
		 float price=sc.nextFloat();
		 
		 P.setId(productId);
		 P.setName(productName);
		 P.setquantity(quantity);
		 P.setprice(price);
		 
		 System.out.println( P.getId());
		 System.out.println( P.getName());
		 System.out.println( P.getquantity());
		 System.out.println( P.getprice());
		 }
}
