package Encapsulation;
import java.util.Scanner;


public class LibraryBook {
	private String ISBN;
	private String title;
	private String author;
	private double price;
	
	public void setISBN(String ISBN) {
		this.ISBN=ISBN;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author) {
		this. author= author;
	}
	
	public String getAuthor() {
		return  author;
	}
	
	public void setPrice(double  price) {
		this. price= price;
	}
	
	public double getPrice() {
		return  price;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		LibraryBook Book = new LibraryBook();
		
		String ISBN = sc.nextLine();
		String title = sc.nextLine();
		String author = sc.nextLine();
		double price = sc.nextDouble();
		
		
		Book.setISBN(ISBN);
		Book.setTitle(title);
		Book.setAuthor(author);
		Book.setPrice(price);
		
		System.out.println(Book.getISBN());
		System.out.println(Book.getTitle());
		System.out.println(Book.getAuthor());
		System.out.println(Book.getPrice());
		
		sc.close();
		
	}

}
