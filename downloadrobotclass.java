package autoit;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.opera.core.systems.internal.input.KeyEvent;

public class downloadrobotclass {
	@Test
	public void downloadte() throws InterruptedException, IOException, AWTException
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://seleniumhq.org");
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.linkText("2.46.0")).click();
	    Thread.sleep(3000);
        Robot rb=new Robot();
        rb.keyPress(java.awt.event.KeyEvent.VK_TAB);
        rb.keyRelease(java.awt.event.KeyEvent.VK_TAB);
        rb.keyPress(java.awt.event.KeyEvent.VK_ENTER);
        rb.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
}
}