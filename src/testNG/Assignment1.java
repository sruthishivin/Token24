package testNG;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment1 {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://rishiherbalindia.linker.store/");
	}
	@Test
	public void test() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		//Register
		 
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("sruthis2sridhar@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("Sruthi12345");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();
		
		//Login
		
		driver.findElement(By.xpath("//*[@id=\"register-model-signin-link\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Sruthi12345");
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/header/div/div/div/div[3]/div[2]/div[1]/form/div[1]/div/input")));
	
		//Search
		
		driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[3]/div[2]/div[1]/form/div[1]/div/input")).sendKeys("Herbal agro Growth Booster");
		driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[3]/div[2]/div[1]/form/div[1]/div/span/button/i")).click();
		Actions act=new Actions(driver);
		WebElement img= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[3]/div[1]/div/div/div[1]/div/a/img"));
		act.moveToElement(img).build().perform();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[3]/div[1]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button/span")).click();
		
		//skin link
		
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/div/div/div[1]/ul/li[4]/a")).click();
		WebElement img1=driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div[3]/div[1]/div/div/div[1]/div/a/img"));
		act.moveToElement(img1).build().perform();
		driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div[3]/div[1]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button/span")).click();
		
		//All, Health, Safety
		
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();
		
		//scroll down
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("Window.scrollBy(0,document.body.scrolHeight)");
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")));
		driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")).click();
		
		//Screenshot
		//js.executeScript("Window.scrollBy(0,document.body.scrolHeight)");
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[4]/div/ul/li[1]/a")));
		WebElement pp=driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[4]/div/ul/li[1]/a"));
		File src=pp.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./sreenshotprivacy//Elementscreenshot.png"));
		
		//Response
		URL ob=new URL("https://rishiherbalindia.linker.store/");
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		int responsecode=con.getResponseCode();
		
		System.out.println(responsecode);
		con.connect();
		if(responsecode==200)
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("Invalid");
			
		}
		
		}
	
}
