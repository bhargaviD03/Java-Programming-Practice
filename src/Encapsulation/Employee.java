package Encapsulation;
import java.util.Scanner;
	public class Employee {
		//Employee Information using Encapsulation
		private int empId;
		private String empName;
		private String designation;
		private String email;
		private Long phone;
		private double salary;
		
		public void setempId(int empId) {
			this.empId=empId;
		}
		
		public int getempId() {
			return empId;
		}
		
		public void setempName(String empName) {
			this.empName=empName;
		}
		
		public String getempName() {
			return empName;
		}
		
		public void setdesignation(String designation) {
			this.designation=designation;
		}
		
		public String getdesignation() {
			return designation;
		}
		
		
		public void setemail(String email) {
			this.email=email;
		}
		
		public String getemail() {
			return email;
		}
		
		public void setphone(long phone) {
			this.phone=phone;
		}
		
		public Long getphone() {
			return phone;
		}
		
		public void setsalary(double salary) {
			this.salary=salary;
		}
		
		public double getsalary() {
			return salary;
		}
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			Employee E = new Employee();
			int empId = sc.nextInt();
			sc.nextLine();
			String empName = sc.nextLine();
			String designation = sc.nextLine();
			String email = sc.nextLine();
			Long phone = sc.nextLong();
			double salary = sc.nextDouble();
			
			E.setempId(empId);
			E.setempName(empName);
			E.setdesignation(designation);
			E.setemail(email);
			E.setphone(phone);
			E.setsalary(salary);
			
			
			System.out.println(E.getempId());
			System.out.println(E.getempName());
			System.out.println(E.getdesignation());
			System.out.println(E.getemail());
			System.out.println(E.getphone());
			System.out.println(E.getsalary());

		}

	}



