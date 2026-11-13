package loops;
import java.util.Scanner;

public class Loops {
	Scanner sc= new Scanner(System.in);
	public void naturalNumbers() {
		System.out.println("Enter the Number...");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
		public void FirstNevenNaturalNumbers() {
			System.out.println("Enter the Number...");
			int n = sc.nextInt();
			for(int i=1;i<=n;i++) {
				System.out.print((i*2)+" ");
			}
			System.out.println();
	}
		
		public void FirstNoddNaturalNumbers() {
			System.out.println("Enter the Number...");
			int n = sc.nextInt();
			for(int i=1;i<=n;i++) {
				System.out.print((i*2)+1+" ");
			}
			System.out.println();
	}
		
		public void Mutiplyof3() {
			System.out.println("Enter the Number...");
			int n = sc.nextInt();
			for(int i=1;i<=n;i++) {
				System.out.print((i*3)+" ");
			}
			System.out.println();
	}
		
		public void Mutiplyof5() {
			System.out.println("Enter the Number...");
			int n = sc.nextInt();
			for(int i=1;i<=n;i++) {
				System.out.print((i*5)+" ");
			}
			System.out.println();
	}
		public void Mutiplyoftwoorfour() {
			System.out.println("Enter the size to be printed...");
			int n = sc.nextInt();
			for(int i=2;i<=n;i++) {
				if(i%2==0 || i%3==0) {
					System.out.print(i+" ");	
				}
			}
			System.out.println();
	}
	
		public void Mutiplyoftwofourseven() {
			System.out.println("Enter the Number...");
			int n = sc.nextInt();
			for(int i=2;i<=n;i++) {
				if(i%2==0 || i%5==0 || i%7==0 ) {
					System.out.print(i+" ");	
				}
			}
			System.out.println();
	}
		
		
		public void SumofDigits() {
			System.out.println("Enter the Number...");
			int res=0;
			int n = sc.nextInt();
			while(n>0) {
				 int digit = n%10;
				  res += digit;
				  n=n/10;
			}
			System.out.println("result:"+res);	
	}
	
		public void countofDigits() {
			System.out.println("Enter the Number...");
			int count=0;
			int n = sc.nextInt();
			while(n>0) {
				 int digit = n%10;
				  n=n/10;
				  count++;
			}

			System.out.println("result:"+count);	
	}
	
		public void factors() {
			System.out.println("Enter the Number...");
			int n = sc.nextInt();
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
	}
		
		public void countfactors() {
			System.out.println("Enter the Number...");
			int n = sc.nextInt();
			int count =0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
					System.out.print(i + " ");	
				}
			}
			System.out.println();
	}
		
		public void prime() {
			System.out.println("Enter the Number...");
			int count = 0;
			int n = sc.nextInt();
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;	
				}
			}
				if(count==2) {
					System.out.print("Yes prime");
					
				}else {
					System.out.println("Not a prime");
				}
			}
	public static void main(String[] args) {
		Loops L = new Loops();
		L.naturalNumbers();
		L.FirstNevenNaturalNumbers();
		L.FirstNoddNaturalNumbers();
		L.Mutiplyof3();
		L.Mutiplyof5();
		L.Mutiplyoftwoorfour();
		L.Mutiplyoftwofourseven();
		L.SumofDigits();
		L.countofDigits();
		L.factors();
		L.countfactors();
		L.prime();
		}

}
