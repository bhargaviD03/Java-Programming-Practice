package aggregationAndComposition;

class OS {

	private String name;
	private int size;

	public OS(String name,int size) {
		this.name=name;
		this.size=size;
	}
	
	public String getname() {
		return name;
	}
	
	public int getsize() {
		return size;
	}

}	
class Charger {

		private String brand;
		private float voltage;
		
		public Charger(String brand,float voltage) {
			this.brand=brand;
			this.voltage=voltage;
		}
		
		public String getbrand() {
			return brand;
		}
		
		public float getvolt() {
			return voltage;
		}

	}

class Mobile {
	OS os =new OS("Andriod",512);
	void hasA(Charger c) {
		System.out.println(c.getbrand());
		System.out.println(c.getvolt());	
	}
	
}
		public static void main(String[] args) {
		Charger c = new Charger("Samsung",24.5f);
		Mobile m = new Mobile();
		System.out.println(m.os.getname());
		System.out.println(m.os.getsize());
		m.hasA(c);
	}

}
