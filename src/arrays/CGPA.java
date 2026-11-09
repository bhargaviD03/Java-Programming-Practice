package arrays;
import java.util.Scanner;

public class CGPA {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int n= sc.nextInt();
			
			float[] cgpa = new float[n];
			for(int i = 0; i<n ; i++) {
				cgpa[i] = sc.nextFloat();
			}
			for(int i = 0; i<n ; i++) {
				System.out.println("CGPA of student"+" "+(i+1)+" "+" is:"+cgpa[i]+" ");
			}
			sc.close();
	}

}
