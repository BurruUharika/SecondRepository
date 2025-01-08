package launcher;

public class testing extends basetest
{

	public static void main(String[] args) throws Exception 
	{
      init();
       
       launch("chromebrowser");
       
		  navigateurl("amazonurl");
		
		 selectDropdownoption("amazonsearchdropbox_id","Beauty");
		 
		 typeText("amazonsearchdropbox_id","eyeliner lakme");
		 
		 clickElement("amazonsearchbutton_xpath");
		  
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
			//loc.sendKeys("Beauty");
			
			//driver.findElement(By.id("searchDropdownBox")).sendKeys("Beauty");
			
			//driver.findElement(By.name("field-keywords")).sendKeys("eyeliner lakme");
			
			//driver.findElement(By.xpath("///*[@id="twotabsearchtextbox"]")).click();
			//driver.findElement(By.xpath("//*[@id="twotabsearchtextbox"]")).sendKeys(Keys.ENTER);
	}

	
		
	


	





	
		
	












	private static void clickElement(String string) {
		// TODO Auto-generated method stub
		
	}



























	private static void typeText(String string, String string2) {
		// TODO Auto-generated method stub
		
	}





	private static void selectDropdownoption(String string, String string2) {
		// TODO Auto-generated method stub
		
	}





	public static void init() 
	{
	
	// WebElement loc = driver.findElement(By.id("searchDropdownBox"));	
	 
	// loc.sendKeys("Beauty");
	 
	// driver.findElement(By.name("field-keywords")).sendKeys("Beauty");
	
	 
	//driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

	
	
	
		
	
	
	

}

	
	}
