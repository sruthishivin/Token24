package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junitdemopgm {
	
	@Before
	public void setup()
	{
		System.out.println("Browser Open");
	}
	@Test
	public void test()
	{
		System.out.println("Testing Activity");
	}
	@After
	public void browserclose()
	{
		System.out.println("Browser close");
	}

}
