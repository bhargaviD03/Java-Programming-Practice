package arrays;
import java.util.Scanner;
public class Temperature {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				int n= sc.nextInt();
				
				double[] temp = new double[n];
				for(int i = 0; i<n ; i++) {
					temp[i] =sc.nextDouble();
				}
				for(int i = 0; i<n ; i++) {
					System.out.println("Temperature of city"+" "+(i+1)+" "+" is:"+temp[i]+" ");
				}
				sc.close();
		}

	}


