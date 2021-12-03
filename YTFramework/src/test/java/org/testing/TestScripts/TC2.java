package org.testing.TestScripts;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;

import org.testing.Base.Base;
import org.testing.utilities.ScreenShotCapture;

public class TC2 extends Base
{
	

    @Test
	public void TC_02() throws InterruptedException, IOException
	{
		
		driver.findElement(By.xpath(pr.getProperty("TC2_1"))).click();
		Thread.sleep(2000);
		ScreenShotCapture.TakeScreeShot(driver, "/YTFramework/Screenshot/TC2.png");
	}

}
