package Encapsulation;

import java.util.Scanner;

public class CustomerFeedback {
	private int customerId;
	private String feedbackText;
	private int rating;
	
	public void setid(int customerId) {
		this.customerId=customerId;
	}
	
	public int getid() {
		  
		return customerId;
	}
	
	public void settext(String feedbackText) {
		this.feedbackText=feedbackText;
	}
	
	public String gettext() {
		return feedbackText;
	}
	public void setrate(int rating) {
		this.rating=rating;
	}
	
	public int getrate() {
		return rating;
	}
	
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		CustomerFeedback C = new CustomerFeedback();
		System.out.println("Enter the Id:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Feedback text:");
		String text = sc.nextLine();
		System.out.println("Provide Rating:");
		int rate = sc.nextInt();
		
		C.setid(id);
		C.settext(text);
		C.setrate(rate);
		
		System.out.println(C.getid());
		System.out.println(C.gettext());
		System.out.println(C.getrate());
		sc.close();
	}

}
