package polymorphism;

import java.util.Scanner;


public class Employeesalary {

	public void calculatesalary() {
		
	}
	

	static class Manager extends Employeesalary{
		@Override
		public void calculatesalary(){
			System.out.println("Manager salary:$80000");
		}
	}
	
	static class Programmer extends Employeesalary{
		@Override
		public void calculatesalary(){
			System.out.println("Programmer salary:$60000");
		}
	}
	
	static class Employee{
		public void sal(Employeesalary ref) {
			ref.calculatesalary();
		}
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the category you need:");
		String s= sc.nextLine();
		
		if(s.equalsIgnoreCase("Manager")) {
			Manager m = new Manager();
			e.sal(m);
		}else if(s.equalsIgnoreCase("Programmer")) {
			Programmer p = new Programmer();
			e.sal(p);
		}
		sc.close();
	}

}

