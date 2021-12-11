package org.testing.TestScripts;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;

import org.testing.Base.Base;
import org.testing.utilities.ScreenShotCapture;



public class TC7 extends Base
{
	
    
    @Test
	public void TC_07() throws InterruptedException, IOException

	{
		driver.findElement(By.cssSelector(pr.getProperty("TC7_1"))).click();
	//	Thread.sleep(4000);	
		
		ScreenShotCapture.TakeScreeShot(driver, "../YTFramework/Screenshot/TC4.png");
	}

}
