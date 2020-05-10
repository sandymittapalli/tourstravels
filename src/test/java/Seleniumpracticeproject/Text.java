package Seleniumpracticeproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Text extends Sendkeys {

	public void fieldbox() {

		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Text t = new Text();
		try {
			t.launch();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.fieldbox();
	}

}
