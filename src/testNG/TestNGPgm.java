package testNG;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGPgm {
	
	@BeforeTest
	public void set()
	{
		System.out.println("browser open");
		
	}
	
	@BeforeMethod
	public void url()
	{
		System.out.println("Url open");
	}
	
	@Test(priority=3,invocationCount=2)
	public void test1()
	{
		System.out.println("Test1");
	}
	@Test(priority=1,enabled=false)
	public void test2()
	{
		System.out.println("Test2");
	}
	@Test(priority=2,dependsOnMethods= {"test1"})
	public void test3()
	{
		System.out.println("Test3");
	}
	
	@AfterMethod
	public void report()
	{
		System.out.println("report");
	}
	
	@AfterTest
	public void close()
	{
		System.out.println("close");
	}
}
