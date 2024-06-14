package testpkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.Baseclass;
import pagepkg.FbPage;
import utlilties.Excelutil;

public class FbTest extends Baseclass{
	//WebDriver driver;
	
	@Test
	public void verifyLoginWithValidCred()
	{
		FbPage p1=new FbPage(driver);
		
		//reading the data from excel file by the specified path
		
		String xl="D:\\data.xlsx";
		String sheet="Sheet1";
		int rowCount=Excelutil.getRowCount(xl,sheet);
		for(int i=1;i<rowCount;i++)
		{
			
			String Username=Excelutil.getcellValue(xl,sheet,i,0);
			System.out.println("username---"+Username);
			String pswd=Excelutil.getcellValue(xl,sheet,i,1);
			System.out.println("password----"+pswd);
			
			//passing username and password as parameters
			
			//submitting the data by clicking on login button
			
			p1.setvalues(Username, pswd);
			p1.login();
		
	}

}
}