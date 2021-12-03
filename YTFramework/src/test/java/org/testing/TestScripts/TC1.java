package org.testing.TestScripts;

import org.testng.annotations.Test;


import org.openqa.selenium.By;


import org.testing.Base.Base;
import org.testing.utilities.Logs;


public class TC1 extends Base
{


	@Test
	public void TC_01() throws InterruptedException
	{
		Logs.takeLogs("TC1", "Login Successful");
		driver.findElement(By.xpath(pr.getProperty("TC1_1"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pr.getProperty("TC1_2"))).click();
		Logs.takeLogs("TC1", "TC1_Passed");
	}
	
	
	
	
}
