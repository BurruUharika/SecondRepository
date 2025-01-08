package testNGpra;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import launcher.basetest;

public class Test3 extends basetest
{
	
	
	@BeforeMethod
	  public void Startup()
	  {
		init();
		test = getTest();
		test = getReport().createTest(this.getClass().getName());
		test.log(Status.INFO, "init the properties files.....");
		
		Launch("chromebrowser");
		test.log(Status.INFO, "Opened the browser : " + getp().getproperty("chromebrowser"));
		
		navigateurl(Status.INFO, "Opened the Application : " + getchildprop().getproperty("amazonurl"));
		
		
		
	  }
	@Test
	public void  AmazonAction() 
  {
	System.out.println("");  
  }
 

  @AfterMethod
  public void Packup()
  {
  }
}
