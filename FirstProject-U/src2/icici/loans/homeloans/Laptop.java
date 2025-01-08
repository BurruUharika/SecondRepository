package icici.loans.homeloans;

public interface Laptop 
{
	public void copy();
	
	public void paste();
	
	public void cut();
	
	public default void capture()
	{
		commonFunctionality();
		System.out.println("Laptop capture code");
	}
	
	public static void audio()
	{
		commonFunctionality();
		System.out.println("Laptop audio code");
	}
	
	private static void commonFunctionality()
	{
		System.out.println("Laptop commonFunctionality code");
	}
}

