package org.testing.Assertion;

public class Asert 
{
	public static void Assert1(String expected, String actual)
	{
		if(expected.equals(actual))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
	}

}
