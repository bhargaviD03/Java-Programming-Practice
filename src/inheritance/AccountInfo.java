package inheritance;
import java.util.Scanner;

public class AccountInfo {
	private int accountNumber;
	private double balance;
	
	public void setAccNum(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	public int getAccNum() {
		return accountNumber;
	}
	public void setbalance(double balance) {
		this.balance=balance;
	}
	public double getbalance() {
		return balance;
	}
	public String getDetails() {
		return "Account Details:"+"Account Number:"+accountNumber+"Balance:"+balance;
	}
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();
		
		if(input.equalsIgnoreCase("SavingsAccount")) {
			savingsAccount S = new savingsAccount();	
			String details = sc.nextLine();
			String[] arr = details.split(",");
			S.setAccNum(Integer.parseInt(arr[0]));
			S.setbalance(Float.parseFloat(arr[1]));
			S.setinterestRate(Float.parseFloat(arr[2]));
				System.out.println (S.getDetails());
			}else if(input.equalsIgnoreCase("currentAccount")) {
				currentAccount C = new currentAccount();	
				String details = sc.nextLine();
				String[] arr = details.split(",");
				C.setAccNum(Integer.parseInt(arr[0]));
				C.setbalance(Float.parseFloat(arr[1]));
				C.setoverdraftLimit(Float.parseFloat(arr[2]));
					System.out.println (C.getDetails());
				}
			sc.close();
		}
	}

class savingsAccount extends AccountInfo{
	private float interestRate;
	
	public void setinterestRate(float interestRate) {
		this.interestRate=interestRate;
	}
	public double getinterestRate() {
		return interestRate;
	}
	@Override
	public String getDetails() {
		return super.getDetails()+"Interest Rate:"+interestRate+"%";
	}
}

class currentAccount extends AccountInfo{
	private float overdraftLimit;
	
	public void setoverdraftLimit(float overdraftLimit) {
		this.overdraftLimit=overdraftLimit;
	}
	public double getoverdraftLimit() {
		return overdraftLimit;
	}
	@Override
	public String getDetails() {
		return super.getDetails()+"Over draft Limit:"+overdraftLimit;
	}
}