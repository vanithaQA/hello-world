package usingListnersTakingScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public static WebDriver driver;
	public static void initialization () {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.get("https://www.google.com/");
	}
	public void failed() {
		 File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrfile, new File("C:\\Users\\win10\\Desktop\\exampleofproject\\ScreenShot"+"/exampleofproject/ScreenShot"));
		} catch (IOException e) {
						e.printStackTrace();
		}
	}
}
