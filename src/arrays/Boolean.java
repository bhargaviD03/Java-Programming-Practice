package arrays;
import java.util.Scanner;
public class Boolean {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				int n= sc.nextInt();
				
				Boolean[] bool = new Boolean[n];
				for(int i = 0; i<n ; i++) {
					bool[i] = sc.nextBoolean();
				}
				for(int i = 0; i<n ; i++) {
					System.out.println("Value at index"+" "+(i)+" "+" is:"+bool[i]+" ");
				}
				sc.close();
			}
}
