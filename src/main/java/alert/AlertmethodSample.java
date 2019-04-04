package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AlertmethodSample {
	WebDriver driver;
	public boolean isAlertpresent() {
		try{
			driver.switchTo().alert();
			return true;
		}catch(Exception e) {
				return false;
							
			}
				}
	@Test
	public void allselenium() {
		driver = new FirefoxDriver();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		Alert text = driver.switchTo().alert();
		System.out.println(text.getText());
		
	}
	
	}


