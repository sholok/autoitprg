package autoit;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class screenshotgrid {
	    @Test
	    public void scr() throws IOException
	    {
		DesiredCapabilities cap=null;
		cap=DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
	    driver.get("http://gmail.com");
	    File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcfile, new File("C:\\users\\qedge\\desktop\\gmai.png"));
	    
}
}
