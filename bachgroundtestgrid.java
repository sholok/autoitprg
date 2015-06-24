package autoit;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class bachgroundtestgrid {
	@Parameters("browser")
	@Test
	public void linktext(String b) throws MalformedURLException, InterruptedException
	{
		System.out.println(b);
		DesiredCapabilities cap=null;
		HtmlUnitDriver dr=new HtmlUnitDriver(BrowserVersion.
		if(b.equals("firefox"))
		{   
			HtmlUnitDriver dr=new HtmlUnitDriver(BrowserVersion.FIREFOX_24);
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
			else if(b.equals("chrome"))
			{  
				HtmlUnitDriver dr=new HtmlUnitDriver(BrowserVersion.CHROME);
				cap=DesiredCapabilities.chrome();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.ANY);
			}
			RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
			dr.get("http://newtours.demoaut.com");
			List<WebElement> links=driver.findElements(By.tagName("a"));
			
			for(int i=0;i<links.size();i++)
			{
				System.out.println(links.get(i).getText());
				links.get(i).click();
				Thread.sleep(3000);
				System.out.println(driver.getCurrentUrl());
				driver.navigate().back();
				links=driver.findElements(By.tagName("a"));
			}

			
	}
	

}
