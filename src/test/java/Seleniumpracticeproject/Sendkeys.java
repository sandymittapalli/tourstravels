package Seleniumpracticeproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sendkeys {
	WebDriver driver;

	public void launch() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		// driver.get("");
		driver.get("https://www.google.com/");
		
		String actual= driver.getTitle();
		
		System.out.println(actual);
		String expected = "Google";
		Assert.assertEquals(actual, expected);
		
		
		//Assert.assertEquals("google", driver.getTitle());
		
		//String atcualtitle = driver.getTitle();
		//String expecttitle = "Meet Guru99 - Free Training Tutorials & Video for IT Courses";
		//Assert.assertEquals(expecttitle, atcualtitle);
		//Assert.assertEquals(expecttitle, atcualtitle);
		//Assert.assertTrue(driver.getTitle().contains("Meet Guru99"));
	
	}


	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Sendkeys s = new Sendkeys();

		s.launch();
	}

}
