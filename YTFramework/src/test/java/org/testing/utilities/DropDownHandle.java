package org.testing.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle 
{
	public static void byIndex(WebElement el, int index)
	{
		Select s = new Select(el);
		s.selectByIndex(index);
	}
	public static void byVisibleText(WebElement el, String VisibleText)
	{
		Select s = new Select(el);
		s.selectByVisibleText(VisibleText);
	}
	public static void byValue(WebElement el, String Value)
	{
		Select s = new Select(el);
		s.selectByValue(Value);
	}

}
