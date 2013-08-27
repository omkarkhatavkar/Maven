package MavenProject;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


public class TestSetting{

	public WebDriver driver;
	static String browser;  

	static {
		browser = System.getProperty("browser");
		System.out.println(browser);
		


	}

	@Test(priority=1 )
	public void StartBrowser(){

		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
		}else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",(System.getProperty("user.dir")+
					"//chromedriver.exe"));

			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability("chrome.switches", Arrays.asList("--start-maximized"));
			driver = new ChromeDriver(capabilities);

		}else{

			System.setProperty("webdriver.ie.driver",(System.getProperty("user.dir")+
					"//IEDriverserver.exe"));

			driver=new InternetExplorerDriver();	

		}
	}

	@Test(priority=2)
	public void NavigateURL(){

		driver.get("http://www.google.com");
		String test = driver.getTitle();
		System.out.println(test);
	}

	@Test(priority=3)
	public void CloseBrowser(){
		driver.close();
	}



}