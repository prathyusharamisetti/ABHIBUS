package resources;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Base {
	 WebDriver driver;
		public WebDriver intializedriver() {
			String browserName ="Chrome";
			
			if(browserName.equalsIgnoreCase("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			
			}
			else if(browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("Microsoftedge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			return driver;
		}
	}