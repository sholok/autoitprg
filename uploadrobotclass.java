package autoit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class uploadrobotclass {
	@Test
	public void uploadtest() throws InterruptedException, AWTException
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://imgur.com");
		driver.findElement(By.className("upload-btn-text")).click();
		driver.findElement(By.id("upload-global-file")).click();
		Thread.sleep(3000);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_T);
		rb.keyRelease(KeyEvent.VK_T);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_A);
		rb.keyPress(KeyEvent.VK_B);
		rb.keyRelease(KeyEvent.VK_B);
		rb.keyPress(KeyEvent.VK_PERIOD);
		rb.keyRelease(KeyEvent.VK_PERIOD);
		rb.keyPress(KeyEvent.VK_G);
		rb.keyRelease(KeyEvent.VK_G);
		rb.keyPress(KeyEvent.VK_I);
		rb.keyRelease(KeyEvent.VK_I);
		rb.keyPress(KeyEvent.VK_F);
		rb.keyRelease(KeyEvent.VK_F);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
