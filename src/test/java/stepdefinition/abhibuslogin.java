package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class abhibuslogin extends Base{
	WebDriver driver;
	@Given("I visit the website")
	public void i_visit_the_website()throws Throwable {
		driver=intializedriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
	   
	}

	@When("I click on login\\/Register page from the home page")
	public void i_click_on_login_register_page_from_the_home_page() {
		WebElement login=driver.findElement(By.id("AccLogin"));
		login.click();
	   
	}

	@Then("I should enter the Mobile number.")
	public void i_should_enter_the_mobile_number1() {
		WebElement Mobilenumber=driver.findElement(By.id("mobileNo"));
		Mobilenumber.sendKeys("9000080000");
	}

	@Then("I should click on login\\/signup with otp button.")
	public void i_should_click_on_login_signup_with_otp_button() {
		WebElement otp=driver.findElement(By.id("getotp"));
		otp.click();
		driver.close();
		System.out.print("This is cucumber project");
		}
//Scenario: user should be able to search the bus and select the seat.
	
	@Given("I should visit the website.")
	public void i_should_visit_the_website() throws InterruptedException {
		 driver=intializedriver();
		 driver.get("https://www.abhibus.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
	  
	}

	@Then("i should enter source and destination.")
	public void i_should_enter_source_and_destination() throws InterruptedException {
		WebElement Leavingfrom=driver.findElement(By.id("source"));
        Leavingfrom.sendKeys("Nidadavolu");
        Thread.sleep(2000);
        Leavingfrom.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        WebElement Goingto=driver.findElement(By.id("destination"));
        Goingto.sendKeys("Secunderabad");
        Thread.sleep(2000);
        Goingto.sendKeys(Keys.ENTER); 
        Thread.sleep(2000);
	}

	@Then("I should select the Date of Journey.")
	public void i_should_select_the_date_of_journey() throws InterruptedException {
		WebElement DOJ=driver.findElement(By.id("datepicker1"));
        DOJ.click();
        Thread.sleep(2000);  
        WebElement DOJ1=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[4]/td[3]"));
        DOJ1.click(); 
        Thread.sleep(2000);
	}

	@Then("then click on Search button.")
	public void then_click_on_search_button() throws InterruptedException {
		 WebElement Search=driver.findElement(By.xpath("//a[text()='Search']"));
	        Search.click();
	        Thread.sleep(2000);
	 
	}

	@Then("I should select the bus by clicking on drop down.")
	public void i_should_select_the_bus_by_clicking_on_drop_down() throws InterruptedException {
		  WebElement select=driver.findElement(By.id("ShowBtnHide01"));
	        select.click();
	        Thread.sleep(2000);
	}

	@Then("I should click on select Seat.")
	public void i_should_click_on_select_seat() {
		WebElement Selectseat=driver.findElement(By.id("1267021747"));
	       Selectseat.click(); 
	}

	@Then("I should select the boarding point and dropping point.")
	public void i_should_select_the_boarding_point_and_dropping_point() throws InterruptedException {
		 WebElement Boardingpoint=driver.findElement(By.id("pickup_id"));
         Select select1=new Select(Boardingpoint);
         select1.selectByVisibleText("Nidadavolu-19:00");
         Thread.sleep(2000);
          WebElement Droppingpoint=driver.findElement(By.id("drop_id"));
          Select select2=new Select(Droppingpoint);
          select2.selectByVisibleText("Lakdikapool-hyd-06:50");   
          WebElement Generalpublic=driver.findElement(By.xpath("//option[text()='GENERAL PUBLIC']"));
          Generalpublic.click();
	}

	@Then("I should click on Showlayout.")
	public void i_should_click_on_showlayout() {
		WebElement layout=driver.findElement(By.id("btnEnable11"));
        layout.click();   
	}

	@Then("I can select the seat.")
	public void i_can_select_the_seat() {
		 WebElement seat1=driver.findElement(By.id("O5-7ZZ"));
         seat1.click();
         WebElement seat2=driver.findElement(By.id("O4-7ZZ"));
         seat2.click();   
	}

	@Then("I should click on Continue to payment.")
	public void i_should_click_on_continue_to_payment() {
		 WebElement payment=driver.findElement(By.id("btnEnable1"));
         payment.click();
	}

	@Then("I should enter the mobile number.")
	public void i_should_enter_the_mobile_number() {
		  WebElement phonenumber=driver.findElement(By.id("mobileNumber"));
	         phonenumber.sendKeys("90000 80000");
	}

	@Then("I should enter the email Id and mobile number.")
	public void i_should_enter_the_email_id_and_mobile_number() {
		 WebElement mail=driver.findElement(By.id("EmailID"));
         mail.sendKeys("smiley111@gmail.com");
         WebElement mobilenumber=driver.findElement(By.id("Mobile_No"));
      	mobilenumber.sendKeys("90000 80000");
	}

	@Then("I should enter passenger details like name and age.")
	public void i_should_enter_passenger_details_like_name_and_age() {
		WebElement name1=driver.findElement(By.id("adultname0"));
     	name1.sendKeys("Chaitanya");
    	WebElement age1=driver.findElement(By.id("adultage0"));
        age1.sendKeys("28");
        WebElement name2=driver.findElement(By.id("adultname1"));
        name2.sendKeys("pallavi");
        WebElement age2=driver.findElement(By.id("adultage1"));
        age2.sendKeys("25");
	}

	@Then("I should click on Paynow.")
	public void i_should_click_on_paynow() {    
		WebElement paynow=driver.findElement(By.id("paynow"));
        paynow.click();
       driver.close();
	}

}
