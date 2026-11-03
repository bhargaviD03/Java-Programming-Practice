package Encapsulation;
import java.util.Scanner;

public class EmpDetails {
			//Employee Details Management using Encapsulation
			private int empId;
			private String name;
			private String department;
			private float salary;
			
			public void setempId(int empId) {
				this.empId=empId;
			}
			
			public int getempId() {
				return empId;
			}
			
			public void setempName(String name) {
				this.name=name;
			}
			
			public String getempName() {
				return name;
			}
			
			public void setdepartment(String department) {
				this.department=department;
			}
			
			public String getdepartment() {
				return department;
			}
			
			public void setsalary(float salary) {
				this.salary=salary;
			}
			
			public double getsalary() {
				return salary;
			}
			    public static void main(String[] args) {
			       Scanner sc=new Scanner(System.in);
			       EmpDetails e=new EmpDetails();
			       int empId=sc.nextInt();
			       sc.nextLine();
			       String name=sc.nextLine();
			       String department=sc.nextLine();
			       float salary=sc.nextFloat();
			        e.setempId(empId);
			        e.setempName(name);
			        e.setdepartment(department);
			        e.setsalary(salary);
			        System.out.println(e.getempId());
			        System.out.println(e.getempName());
			        System.out.println(e.getdepartment());
			        System.out.println(e.getsalary());
			    }
}