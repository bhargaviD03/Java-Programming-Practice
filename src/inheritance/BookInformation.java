package inheritance;

import java.util.Scanner;

public class BookInformation {
	private String title;
	private String author;
	
	public void settitle(String title) {
		this.title=title;
	}
	
	public String gettitle() {
		return title;
	}
	
	public void setauthor(String author) {
		this.author=author;
	}
	
	public String getauthor() {
		return author;
	}
	
	public String getInfo() {
		return "Title:"+title+",Author name:"+author;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();

		if(input.equalsIgnoreCase("Ebook")) {
			String details = sc.nextLine();
			String[] arr = details.split(",");
			EBook E= new EBook();
			E.settitle(arr[0].trim());
			E.setauthor(arr[1].trim());
			E.setfilesize(Integer.parseInt(arr[2].trim()));
			System.out.println(E.getInfo());
		}else if(input.equalsIgnoreCase("PrintedBook")) {
			String details = sc.nextLine();
			String[] arr = details.split(",");
			PrintedBook pb= new PrintedBook();

			pb.settitle(arr[0].trim());
			pb.setauthor(arr[1].trim());
			pb.setpages(Integer.parseInt(arr[2].trim()));
			System.out.println(pb.getInfo());
		}

	}

}

class EBook extends BookInformation{
	private int fileSize;
	
	public void setfilesize(int fileSize) {
		this.fileSize=fileSize;
	}
	
	public int getfilesize() {
		return fileSize;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo()+",fileSize:"+fileSize;
	}

}
class PrintedBook extends BookInformation{
	private int pages;
	
	public void setpages(int pages) {
		this.pages=pages;
	}
	
	public int getpages() {
		return pages;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo()+",pages"+pages;
	}

}
