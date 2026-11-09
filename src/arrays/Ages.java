package arrays;
import java.util.Scanner;


public class Ages { 

	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		 sc.nextLine();
		String ages = sc.nextLine();
		String [] values = ages.split(",");
		
		int[] age = new int[n];
		
		for(int i= 0;i<n;i++) {
			age[i] =Integer.parseInt(values[i].trim());
		}
		for(int i= 0;i<n;i++) {
			System.out.println("Ages are:"+age[i]+" ");
		}
		sc.close();
	}

}
