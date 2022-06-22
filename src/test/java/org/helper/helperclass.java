package org.helper;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class helperclass {

	   public static WebDriver driver;

	public static void date() {
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
		String format = s.format(d);
		System.out.println(format);
	}
	public static void lauchChromeBrowser() {
		WebDriverManager.chromedriver().setup();
	    driver =  new ChromeDriver();	
	}
	public static void maxi() {
		driver.manage().window().maximize();
	}
	public static void url(String url) {
		driver.get(url);
	}
	public static void fillTheTextBox(WebElement location,String value) {
		location.sendKeys(value);
	}
	public static void btnClick(WebElement location) {
		location.click();
	}
	public void screenShot() throws IOException {
     TakesScreenshot t = (TakesScreenshot)driver;
     File src = t.getScreenshotAs(OutputType.FILE);
     File dsc = new File("C:\\Users\\gopik\\eclipse-workspace\\JUNIT-TESTING\\snapshot1\\1.png");
     FileUtils.copyDirectory(src, dsc);
	}
	public static void implict(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
}

}
