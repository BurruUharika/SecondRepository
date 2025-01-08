package icici.loans.carloans;

public class Hdfc implements Rbi
{

	public static void main(String[] args) 
	{
	Hdfc h = new Hdfc();
	h.deposit();
	h.withdraw();
	}

	@Override
	public void deposit() {
		System.out.println("iam overridden deposit in Hdfc ");
		
	}

	@Override
	public void withdraw() {
		System.out.println("iam overridden withdraw in Hdfc ");
		
	}

}
