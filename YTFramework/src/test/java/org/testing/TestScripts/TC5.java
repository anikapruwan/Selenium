package org.testing.TestScripts;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;

import org.testing.Base.Base;
import org.testing.pages.VideoPlay;
import org.testing.utilities.ScreenShotCapture;


public class TC5 extends Base
{
@Test
	public void TC_05() throws InterruptedException, IOException
	{
	VideoPlay vp = new VideoPlay(driver,pr);
	vp.play();
	//	Thread.sleep(4000);
		driver.findElement(By.xpath(pr.getProperty("TC5_1"))).click();
	//	Thread.sleep(4000);
		ScreenShotCapture.TakeScreeShot(driver, "../YTFramework/Screenshot/TC4.png");
	}

}
