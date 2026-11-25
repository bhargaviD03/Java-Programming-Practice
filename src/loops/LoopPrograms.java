package loops;

import java.util.Scanner;

public class LoopPrograms {
	Scanner sc = new Scanner(System.in);
	public void sumOfDigits(){
		System.out.println("Enter the input:");
		int n = sc.nextInt();
		int sum=0;
		int temp=0;
		while(n>0) {
			temp=n%10;
			sum= sum+temp;
			n=n/10;	
		}
		System.out.print(sum + " ");
	}
	
	public void countDigit() {
		System.out.println("Enter the input:");
		int n = sc.nextInt();
		int count=0;
		while(n>0) {
			int digit= n % 10;
			count ++;
			n=n/10;
		}
		System.out.print(count); 
		
	}
	
	public void Factors() {
		System.out.println("Enter the input:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
			
		}
	}
	
	public void countFactors() {
		System.out.println("Enter the input:");
		int n = sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		System.out.print(count);
	}
	
	public boolean prime(int n) {
//		System.out.println("Enter the input:");
//		n = sc.nextInt();
		if (n <= 1) {
	        return false;
		}else {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
			}
		return true;
		}
		
	}
	
	public void primecount() {
		System.out.println("Enter the input:");
		int n = sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
				if(prime(i)) {
					System.out.print(i+" ");
					count++;
				}
			}
			
		}

	
	
	
	
	public static void main(String[] args) {
		LoopPrograms L = new LoopPrograms();
		L.sumOfDigits();
		L.countDigit();
		L.Factors();
		L.countFactors();
		L.prime();
		L.primecount();
	}

}
