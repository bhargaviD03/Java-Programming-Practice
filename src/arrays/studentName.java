package arrays;
import java.util.Scanner;

public class studentName {

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] name = new String[n];
		for(int i=0; i<n;i++) {
			name[i] =  sc.nextLine();
			
		}
		for(int i = 0; i<n ; i++) {
			System.out.println("Temperature of city"+" "+(i)+" "+" is:"+name[i]+" ");
		}
		sc.close();
	}

}
