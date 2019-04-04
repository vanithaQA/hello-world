package usingListnersTakingScreenshot;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListener.class)
public class ScreenclassTestClass extends Base{
	@BeforeMethod
	public void setup() {
		initialization();
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
@Test
public void TakeScreenShotTest() {
	Assert.assertEquals(false,true);
}
}
