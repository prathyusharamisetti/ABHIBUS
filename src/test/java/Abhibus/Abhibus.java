package Abhibus;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import resources.Base;

public class Abhibus extends Base {
	WebDriver driver;
 @Test
	public void loginpage() throws InterruptedException, IOException {
	 driver=intializedriver();
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
          WebElement DOJ1=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[4]/td[3]"));
          DOJ1.click();
     Thread.sleep(2000);       
       WebElement Search=driver.findElement(By.xpath("//a[text()='Search']"));
       Search.click();
     Thread.sleep(1000);
       WebElement select=driver.findElement(By.id("ShowBtnHide01"));
       select.click();
     Thread.sleep(1000);
       WebElement Selectseat=driver.findElement(By.id("1267021747"));
       Selectseat.click();
     Thread.sleep(1000);  
       WebElement Boardingpoint=driver.findElement(By.id("pickup_id"));
       Select select1=new Select(Boardingpoint);
       select1.selectByVisibleText("Nidadavolu-19:00");
       //Boardingpoint.sendKeys(Keys.ARROW_DOWN);
     Thread.sleep(2000);
       WebElement Droppingpoint=driver.findElement(By.id("drop_id"));
       /*Droppingpoint.sendKeys(Keys.ARROW_DOWN);
       Droppingpoint.sendKeys(Keys.ARROW_DOWN);
       Droppingpoint.sendKeys(Keys.ARROW_DOWN);
       Droppingpoint.sendKeys(Keys.ARROW_DOWN);
       Droppingpoint.sendKeys(Keys.ARROW_DOWN);
       Droppingpoint.sendKeys(Keys.ARROW_DOWN);
       Droppingpoint.sendKeys(Keys.ARROW_DOWN);*/
       Select select2=new Select(Droppingpoint);
       select2.selectByVisibleText("Lakdikapool-hyd-06:50");
    Thread.sleep(2000);      
    WebElement Generalpublic=driver.findElement(By.xpath("//option[text()='GENERAL PUBLIC']"));
    Generalpublic.click();
    Thread.sleep(2000);
    //taking screenshot of end page
    File Endpage = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Endpage, new File("files//screenshot2.png"));
	WebElement layout=driver.findElement(By.id("btnEnable11"));
	layout.click();
	WebElement seat1=driver.findElement(By.id("O5-7ZZ"));
	seat1.click();
	//WebElement seat2=driver.findElement(By.id("O4-7ZZ"));
	//seat2.click();
	WebElement payment=driver.findElement(By.id("btnEnable1"));
	payment.click();
	WebElement phonenumber=driver.findElement(By.id("mobileNumber"));
	phonenumber.sendKeys("90000 80000");
	Thread.sleep(2000);
	WebElement mail=driver.findElement(By.id("EmailID"));
	mail.sendKeys("smiley111@gmail.com");
	Thread.sleep(2000);
	WebElement mobilenumber=driver.findElement(By.id("Mobile_No"));
	mobilenumber.sendKeys("90000 80000");
	Thread.sleep(2000);
	WebElement name1=driver.findElement(By.id("adultname0"));
	name1.sendKeys("Chaitanya");
	Thread.sleep(2000);
	WebElement age1=driver.findElement(By.id("adultage0"));
	age1.sendKeys("28");
	Thread.sleep(2000);
	//WebElement name2=driver.findElement(By.id("adultname1"));
	//name2.sendKeys("pallavi");
	//Thread.sleep(2000);
	//WebElement age2=driver.findElement(By.id("adultage1"));
	//age2.sendKeys("25");
	//Thread.sleep(2000);
	WebElement paynow=driver.findElement(By.id("paynow"));
	paynow.click();
	Thread.sleep(2000);
	
 }
 
}
