package inheritance;

import java.util.Scanner;

public class Appliance {

			private String Brand;
			private int Power;
			
			public void setBrand(String Brand) {
				this.Brand = Brand;
			}
			public String getBrand() {
				return Brand;
			}
			
			public void setPower(int Power) {
				this. Power =  Power;
			}
			public int getPower() {
				return  Power;
			}
			
			public String getDescription() {
				return "Brand:"+Brand+" "+"Power:"+Power+"W"+" ";
			}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine().trim();
			
			if(input.equalsIgnoreCase("WashingMachine")) {
				WashingMachine W = new WashingMachine();
				
				String Details = sc.nextLine();
				String[] arr = Details.split(",");
				
				W.setBrand(arr[0]);
				W.setPower(Integer.parseInt(arr[2]));
				W.setCapacity(Integer.parseInt(arr[2]));
				System.out.println("Appliance Description:"+W.getDescription());
			}
			else if(input.equalsIgnoreCase("Refrigerator")) {
				Refrigerator R = new Refrigerator();
				
				String Details = sc.nextLine();
				String[] arr = Details.split(",");
				
				R.setBrand(arr[0]);
				R.setPower(Integer.parseInt(arr[1]));
				R.setVolume(Integer.parseInt(arr[2]));
				System.out.println("Appliance Description:"+R.getDescription());
			}
			sc.close();
		}

	}
	class WashingMachine extends Appliance{
		private int Capacity;
		
		public void setCapacity(int Capacity) {
			this.Capacity =Capacity;
		}
		public int getCapacity() {
			return Capacity;
		}
		@Override
		public String getDescription() {
			return super.getDescription()+"Capacity:"+Capacity+"kg"+" ";
		}
	}
	 class Refrigerator extends Appliance {
			private int Volume;
			
			public void setVolume(int Volume) {
				this.Volume = Volume;
			}
			public int getVolume() {
				return Volume;
			}
			@Override
			public String getDescription() {
				return super.getDescription()+" "+"Volume:"+Volume+"L"+" ";
			}
		}

