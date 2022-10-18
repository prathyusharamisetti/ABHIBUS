package extentreports;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import stepdefinition.Base;

public class Demotest extends Base{
WebDriver driver;
ExtentReports extent;

 @BeforeMethod
 public void configuration() {
	 String reportpath=System.getProperty("user.dir")+"\\reports\\index.html";
	 ExtentSparkReporter reporter=new ExtentSparkReporter(reportpath);
	 reporter.config().setReportName("Abhibus test report");
	 reporter.config().setDocumentTitle("Abhibus Test Report Title");
	 
	 ExtentReports extent=new ExtentReports();
	 
	 extent.attachReporter(reporter);
 extent.setSystemInfo("Operating system","Windows 11");
 extent.setSystemInfo("Tested By","Sai Prathyusha");
 
 }
 @Test
public void login() throws InterruptedException {
	 ExtentTest etest = extent.createTest("login");  
	 
	driver=intializedriver();
	
	etest.info("Chrome Browser launched");
	
	driver.get("https://www.abhibus.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement login=driver.findElement(By.id("AccLogin"));
	login.click();
	WebElement Mobilenumber=driver.findElement(By.id("mobileNo"));
	Mobilenumber.sendKeys("9000080000");
	WebElement otp=driver.findElement(By.id("getotp"));
	otp.click();
	etest.info("Chrome browser closed");
	etest.fail("login failed");
	driver.close();
	extent.flush();
 }
 @Test
	public void user() throws InterruptedException, IOException {
	 ExtentTest etest = extent.createTest("user"); 
	 driver=intializedriver();
	 
	 etest.info("Chrome Browser launched");
	 
	 driver.get("https://www.abhibus.com/");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 //taking Screenshot of login page.
	          File Homepage = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		      FileUtils.copyFile(Homepage, new File("files//screenshot1.png"));
	//enter Source	
	         WebElement Leavingfrom=driver.findElement(By.id("source"));
	         Leavingfrom.sendKeys("Nidadavolu");
	         Thread.sleep(2000);
	         Leavingfrom.sendKeys(Keys.ENTER);
	         Thread.sleep(2000);
	 //enter destination
	          WebElement Goingto=driver.findElement(By.id("destination"));
	          Goingto.sendKeys("Secunderabad");
	          Thread.sleep(2000);
	          Goingto.sendKeys(Keys.ENTER); 
	          Thread.sleep(2000);
  //DOJ
           WebElement DOJ=driver.findElement(By.id("datepicker1"));
           DOJ.click();
           Thread.sleep(2000);
  //Date picker
          WebElement DOJ1=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[4]/td[3]"));
          DOJ1.click(); 
          Thread.sleep(2000);
          WebElement Search=driver.findElement(By.xpath("//a[text()='Search']"));
          Search.click();
          Thread.sleep(2000);
          WebElement select=driver.findElement(By.id("ShowBtnHide01"));
          select.click();
          Thread.sleep(2000);
          WebElement Selectseat=driver.findElement(By.id("1267021747"));
         Selectseat.click();  
         driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
   //Boarding point
         WebElement Boardingpoint=driver.findElement(By.id("pickup_id"));
         Select select1=new Select(Boardingpoint);
         select1.selectByVisibleText("Nidadavolu-19:00");
          WebElement Droppingpoint=driver.findElement(By.id("drop_id"));
          Select select2=new Select(Droppingpoint);
          select2.selectByVisibleText("Lakdikapool-hyd-06:50");   
          WebElement Generalpublic=driver.findElement(By.xpath("//option[text()='GENERAL PUBLIC']"));
          Generalpublic.click();
 //taking screenshot of end page
          File Endpage = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	         FileUtils.copyFile(Endpage, new File("files//screenshot2.png"));
	         WebElement layout=driver.findElement(By.id("btnEnable11"));
	         layout.click();
	         WebElement seat1=driver.findElement(By.id("O5-7ZZ"));
	         seat1.click();
	         WebElement seat2=driver.findElement(By.id("O4-7ZZ"));
          seat2.click();
	         WebElement payment=driver.findElement(By.id("btnEnable1"));
	         payment.click();
	         WebElement phonenumber=driver.findElement(By.id("mobileNumber"));
	         phonenumber.sendKeys("90000 80000");
	         WebElement mail=driver.findElement(By.id("EmailID"));
	         mail.sendKeys("smiley111@gmail.com");
	         WebElement mobilenumber=driver.findElement(By.id("Mobile_No"));
       	mobilenumber.sendKeys("90000 80000");
	//passenger details
       	WebElement name1=driver.findElement(By.id("adultname0"));
      	name1.sendKeys("Chaitanya");
     	WebElement age1=driver.findElement(By.id("adultage0"));
	        age1.sendKeys("28");
	        WebElement name2=driver.findElement(By.id("adultname1"));
	        name2.sendKeys("pallavi");
	        WebElement age2=driver.findElement(By.id("adultage1"));
	        age2.sendKeys("25");
	//payment
	        WebElement paynow=driver.findElement(By.id("paynow"));
	        paynow.click();
	        
	        etest.info("Chrome browser closed");
	        etest.fail("user testcase failed");
	        
	       driver.close();
	       extent.flush();
 }
}