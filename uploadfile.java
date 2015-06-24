package autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class uploadfile {
@Test
public void uploadtest() throws InterruptedException, IOException
{
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://imgur.com");
	driver.findElement(By.className("upload-btn-text")).click();
	driver.findElement(By.id("upload-global-file")).click();
	Thread.sleep(3000);
	java.lang.Runtime.getRuntime().exec("C:\\Users\\qdge\\Desktop\\up.exe");
}
}
