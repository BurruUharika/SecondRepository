package icici.loans.goldloans;

public class Datatype 
{
	byte b; // 1 byte
	short s; // 2 bytes
	int i; // 4 bytes
	long l; // 8 bytes
	
	float f; // 4 bytes
	double d; // 8 bytes
	
	boolean bb;
	char ch; // 2 bytes
	
	String str;
	
	static String cname;
	static float roi;
	
	public static void main(String[] args) 
	{
		int x = 10;
		
		Datatype obj = new Datatype();
		System.out.println("Byte : " +  obj.b);
		System.out.println("Short : " +  obj.s);
		System.out.println("Int : " +  obj.i);
		System.out.println("Long : " +  obj.l);
		
		System.out.println("Float : " +  obj.f);
		System.out.println("Double : " +  obj.d);
		
		System.out.println("Boolean : " +  obj.bb);
		System.out.println("Char : " +  obj.ch);
		
		System.out.println("cname : " + cname);
		System.out.println("roi : " + roi);
		
		System.out.println("X : " + x);
	}

}
