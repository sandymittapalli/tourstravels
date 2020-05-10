package Seleniumpracticeproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	WebDriver driver;

	public void browser() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");

		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();

		String actual = driver.getTitle();

		System.out.println(actual);
		
		String expected = "Welcome: Mercury Tours";
		
		Assert.assertEquals(actual, expected);
		
		
		
		//driver.close();

	}
	
	public void signon(){
		try{
		
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		}
		catch(Exception e){
		System.out.println(e);
		}
	}

	public void register() {
		
		Actions a = new Actions(driver);
		
		a.sendKeys(driver.findElement(By.xpath("//input[@name='firstName']")), "kumar").build().perform();
		try{
		Thread.sleep(3000);
		}
		catch(Exception e){
			e.printStackTrace();
		System.out.println(e);
		}
		WebElement lastname= driver.findElement(By.xpath("//input[@name='lastName']"));
		lastname.sendKeys("lion");
		lastname.click();
	try{
		Thread.sleep(3000);
	}
	catch(Exception e){
		e.printStackTrace();
		System.out.println(e);
	}
		
		a.sendKeys(driver.findElement(By.xpath("//input[@name='phone']")), "9398452354").build().perform();
		
		a.sendKeys(driver.findElement(By.xpath("//input[@id='userName']")), "sandeep.mittapalli123@gmail.com").build().perform();





		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		d.browser();
		d.signon();
		d.register();
	}

}
