package icici.loans.carloans;

public class icici implements Rbi
{

	public static void main(String[] args)
	{
		
		icici i = new icici();	
	i.deposit();
	i.withdraw();

	}

	@Override
	public void deposit() 
	{
		System.out.println("iam overridden deposit in icici ");
		
	}

	@Override
	public void withdraw() 
	{
		System.out.println("iam overridden withdraw in icici ");
		
		
	}

}
