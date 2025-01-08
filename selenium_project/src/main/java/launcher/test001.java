package launcher;

	public class test001 extends basetest
	{
		
	
	
	public static void main(String[] args) throws Exception 
	{
		
	launch("Chrome");
	
	navigateurl("https://www.amazon.com/");
	
	driver.manage().window().maximize();
	String title = driver.getTitle();
	System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String page = driver.getPageSource();
		System.out.println(page);
		driver.manage().deleteAllCookies();
		
	
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		//driver.close();
		driver.quit();
		
	}
	
	
	
	
}
	


	

