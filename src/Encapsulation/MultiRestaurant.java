package Encapsulation;
import java.util.Scanner;
public class MultiRestaurant {
		private int id;
		private String name;
		private String email;
		private Long phone;
		private String address;

		
		public void setid(int id) {
			this.id=id;
		}
		
		public void setname(String name) {
			this.name=name;
		}
		
		public void setemail(String email) {
			this.email=email;
		}
		
		public void setphone(Long phone) {
			this.phone=phone;
		}
		
		public void setaddress(String address) {
			this.address=address;
		}
		
		
		public int getid() {
			return id;
		}
		
		public String getname() {
			return name;
		}
		
		public String getemail() {
			return email;
		}
		
		public Long getphone() {
			return phone;
		}
		
		public String getaddress() {
			return address;
		}

		public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        
	        Restaurant[] res=new Restaurant[n];
	        String details=sc.nextLine();
	        
	        for(int i=0;i<n;i++){
	            Restaurant r=new Restaurant(); 
	            int id=sc.nextInt();
	            sc.nextLine();
	            String name=sc.nextLine();
	            String email=sc.nextLine();
	            long phone=sc.nextLong();
	            sc.nextLine();
	            String address=sc.nextLine();
	            r.setid(id);
	            r.setname(name);
	            r.setemail(email);
	            r.setphone(phone);
	            r.setaddress(address);
	            res[i]=r;
	        }
	        for(int j=0;j<n;j++){
	            System.out.println(res[j].getid());
	            System.out.println(res[j].getname());
	            System.out.println(res[j].getemail());
	            System.out.println(res[j].getphone());
	            System.out.println(res[j].getaddress());
	        }
	        sc.close();
	    }
		
	}