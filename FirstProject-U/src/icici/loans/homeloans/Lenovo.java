package icici.loans.homeloans;

public class Lenovo implements Laptop
{

	
	public void copy() {
		System.out.println("lenovo copy code");
	}

	
	public void paste() {
		System.out.println("lenovo paste code");
	}

	
	public void cut() {
		System.out.println("lenovo cut code");
	}
	
	@Override
	public void capture()
	{
		System.out.println("lenovo capture code");
	}
	
	public static void audio()
	{
		System.out.println("lenovo audio code");
	}

}

