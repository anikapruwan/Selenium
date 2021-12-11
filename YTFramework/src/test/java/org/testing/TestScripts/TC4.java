package org.testing.TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testing.Assertion.Asert;
import org.testing.Base.Base;
import org.testing.pages.VideoPlay;
import org.testing.utilities.ScreenShotCapture;


public class TC4 extends Base
{
	

    
    @Test
	public void TC_04() throws InterruptedException, IOException
	{
		String expectedUrl = "";
    	VideoPlay vp = new VideoPlay(driver,pr);
		vp.play();
		Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
	//	Thread.sleep(4000);
		driver.findElement(By.xpath(pr.getProperty("TC4_2"))).click();
	//	Thread.sleep(4000);
		ScreenShotCapture.TakeScreeShot(driver, "../YTFramework/Screenshot/TC4.png");
		Asert.Assert1(driver.getCurrentUrl(), expectedUrl);
	}

}
