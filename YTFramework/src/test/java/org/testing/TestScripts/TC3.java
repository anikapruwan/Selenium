package org.testing.TestScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;

import org.testing.Base.Base;

public class TC3 extends Base
{

    @Test
	 public void TC_03() throws InterruptedException
	    {
			driver.findElement(By.cssSelector(pr.getProperty("TC3_1"))).click();
			Thread.sleep(2000);
	    }

}
