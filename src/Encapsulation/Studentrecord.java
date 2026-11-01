package Encapsulation;
import java.util.Scanner;

public class Studentrecord {
	
	private int id;
	private String name;
	private int age;
	private String grade;
	
	public void setId(int id) {
		if(id > 0)this.id =id;	
		
	}
	
	public int getId() {
		return id;
	}
	
	public void SetName(String name) {
		if(!name.trim().isEmpty())this.name =name;	
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		if(age>0 && age<=100)this.age =age;	
		
	}
	
	public int getAge() {
		return age;
	}
	
	public void setGrade(String grade) {
		if(!grade.trim().isEmpty())this.grade=grade;	
		
	}
	
	public String getGrade() {
		return grade;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Studentrecord S=new Studentrecord();
	
		int id = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String grade = sc.nextLine();
		
		
		S.setId(id);
		S.SetName(name);
		S.setAge(age);
		S.setGrade(grade);
		
		System.out.println(S.getId());
		System.out.println(S.getName());
		System.out.println(S.getAge());
		System.out.println(S.getGrade());
	}

}
