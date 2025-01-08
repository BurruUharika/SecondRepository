package icici.loans.carloans;


import java.io.FileInputStream;

public class SecondClass 
{
//data properties
	
	int a=10,b=20,c;
	
//Behaviours
	public void add()
	{
	   c = a+b;
	   System.out.println("Add of A & B is : " + c);
	}
	public void sub()
	{
	 c = a-b;	
	   System.out.println("Sub of A & B is : " + c);
	}
	
	public static void main(String[] args)

	{
	  System.out.println("Hello....");
	  
	  int x = 10;
	  char ch = 'a';
	  
	 SecondClass obj = new SecondClass();
	 obj.add();
	 obj.sub(); 
	 
	 SecondClass obj1 = new SecondClass();
	 obj.add();
	 obj.sub();
	  
	}
	
		
	
	}
		
	
	

