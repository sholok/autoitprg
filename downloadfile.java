package autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class downloadfile {
@Test
public void downloadtest() throws InterruptedException, IOException
{
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://seleniumhq.org");
	driver.findElement(By.linkText("Download")).click();
	driver.findElement(By.linkText("2.46.0")).click();
    Thread.sleep(3000);
    java.lang.Runtime.getRuntime().exec("C:\\Users\\qdge\\Desktop\\down.exe");
    
    
	
	
}  

}
