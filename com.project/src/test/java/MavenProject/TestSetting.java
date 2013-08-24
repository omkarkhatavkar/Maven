package MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class TestSetting{

	public WebDriver driver;

	@Test(priority=1 )
	public void StartBrowser(){

		driver = new FirefoxDriver();
	}

	@Test(priority=2)
	public void NavigateURL(){

		driver.get("http://www.google.com");
	}
	
	@Test(priority=3)
	public void CloseBrowser(){
		driver.close();
	}



}