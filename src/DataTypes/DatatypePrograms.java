package DataTypes;

public class DatatypePrograms {
	void CharToInt() {
		//Adding char and int = integer
				char a = 'A';
				int b = 10;
				int Result = a + b ;
				System.out.println("Result:"+ Result);
	}
	
	void IntToDouble() {
		// Implicit type casting from int to double
		int a = 10;
		double b = a;
		System.out.println("Original Integer:"+a);
		System.out.println("Casted Double:"+b);
	}
	
	void DoubleToInt() {
		// Explicit type casting from double to int
		double a = 10.05d;
		int b = (int) a;
		System.out.println("Original Double:"+a);
		System.out.println("Casted Integer:"+b);
		
	}
	
	void CastingCharToInt() {
		// Type casting from Char to int 
		char a = 'B';
		int b = (int)a;
		System.out.println("Original Integer:"+a);
		System.out.println("Casted Double:"+b);
		
	}
	
	void CastingInttoChar() {
		// Type casting from Int to Char
		int a = 66;
		char b = (char)a;
		System.out.println("Original Integer:"+a);
		System.out.println("Casted Double:"+b);
		
	}
	
	void CastingFloatToIntAndByte() {
	 float a = 128.45f;
	 int b = (int) a; 
	 byte  c = (byte) b;
	 
	 System.out.println("Original Float:"+a);
		System.out.println("Casted  Integer:"+b);
		System.out.println("Casted Byte:"+c);
		
	}
	
	public static void main(String[] args) {
		DatatypePrograms C = new DatatypePrograms();
		C.CharToInt();
		C.IntToDouble();
		C.DoubleToInt();
		C.CastingCharToInt();
		C.CastingInttoChar();
		C.CastingFloatToIntAndByte();
	}

}
