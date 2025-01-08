package launcher;

	public class test002 extends basetest
	{
		
	
	
	public static void main(String[] args) throws Exception 
	{
		
		init();
		
    launch("Chromebrowser");
	navigateurl("amazonurl");
	
	driver.manage().window().maximize();
	
		
		
		
	}
	
	
	
	
}
	


	

