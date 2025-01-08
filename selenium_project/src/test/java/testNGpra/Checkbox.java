package testNGpra;

import java.io.ObjectInputFilter.Status;
import java.io.Flushable;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import launcher.basetest;


public class Checkbox extends basetest {
  
  @BeforeMethod
	@Parameters("browser")
	public void beforeMethod(String btype) throws Exception 
	{
		System.out.println("startProcess");
	    wait();
	    Object test = ((Object) getReport()).createTest(this.getClass().getName());
		test.log(Status.PASS, "Initiating the Property Files...");
				
		launch(btype);
		getP();
		test.log(Status.INFO, "Opened the Browser :- " + System.getProperty("chromebrowser"));
						
		navigateurl("chekboxurl");
		getChildProp();
		test.log(Status.PASS, "Navigated to app :-" + System.getProperty("chekboxurl"));
	}
	  
	  
	private System getChildProp() {
	// TODO Auto-generated method stub
	return null;
}


	private System getP() {
	// TODO Auto-generated method stub
	return null;
}


	private Object getReport() {
	// TODO Auto-generated method stub
	return null;
}


	@Test
	public void checkboxTest()
	{
		List<WebElement> check=driver.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
		for(int i=0;i<check.size();i++)
		{
			System.out.println(check.get(i).getAttribute("value")+"--"+check.get(i).getAttribute("checked"));
			//System.out.println(check.get(i).isSelected());
		}
	}
 

  @AfterMethod
  public void afterMethod() throws Exception 
  {
	  System.out.println("endProcess");
	  ((Flushable) getReport()).flush();
	 driver.quit();
  }

}
