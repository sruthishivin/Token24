package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterpgm {
	@Parameters("a")
	@Test
	public void set(String s)
	{
		System.out.println("Value is :" +s);
	}
	

}
