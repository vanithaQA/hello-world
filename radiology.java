@Listeners(com.Radiologymammogram.CustomListeners.class)
public class Mammogramguestcheckout {

	WebDriver driver; 
	//By dropdown = By.xpath("//*[@id='navbar']/div[2]/div/div/div[1]/button"); 
	//private static Logger logger = LogManager.getLogger(Mammogramguestcheckout.class);
	By whoschedulingfor = By.xpath("//*[@id=\\\"SchedulingFor\"]");
	By Typeofradiologyappt = By.xpath("//select[@id='SelectedExamType']");
	By  Typeofservice= By.xpath("/html[1]/body[1]/div[2]/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/select[1]");
	By Ageband = By.xpath("//*[@id=\"confirm-question3\"]/div/div[2]/label");

	public Mammogramguestcheckout(WebDriver driver) {

		this.driver=driver;

	}

	//Select the whos scheduling for the dropdown
	public void whoschedulingfor() {

		Select sel = new Select (driver.findElement(By.xpath("//select[@id='SchedulingFor']")));
		sel.selectByVisibleText("Myself");

	}
	//Select the Type of radiology dropdown 
	public void Typeofradiologyappt() {
		Select sel = new Select (driver.findElement(Typeofradiologyappt));
		sel.selectByVisibleText("Mammography");

	}

	//Select the type of service dropdown 
	public void Typeofservice() throws InterruptedException {
		Thread.sleep(5000);
		Select sel = new Select (driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/select[1]")));
		sel.selectByVisibleText("Mamm - Screening Mammogram");

	}

	//Select the No for under 35 of age 
	public void Clickageband () {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement age=	driver.findElement(By.xpath("//*[@id=\"confirm-question3\"]/div/div[2]/label"));
		js.executeScript("arguments[0].click()", age);

		WebElement search=driver.findElement(By.xpath("//*[@id=\"UH-MainMenu\"]/div[3]/main/div[3]/div[3]/div/div/div/div/form/div[8]/a"));
		js.executeScript("arguments[0].click()", search);


	}
	//Click on the SeeMoretimes button
	public void Seemoretimes() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement seemorebutton = driver.findElement(By.xpath("//*[@id=\"UH-Feature-Locations-FindALocation-Results\"]/div[1]/div[2]/div[3]/div/a"));
		js.executeScript("arguments[0].click()", seemorebutton);



		WebElement element = driver.findElement(By.xpath("//*[@class='UH-Feature-SelfScheduling-Wrapper']"));
		js.executeScript("arguments[0].click()", element);



		try {
			WebElement ele1= driver.findElement(By.xpath("//*[@class='UH-Feature-SelfScheduling-Wrapper']"));
			if(ele1.isDisplayed()) {
				ele1.click();
			}

			else{

			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		//Click on the Select this time button
		WebElement selecttime=driver.findElement(By.xpath("//*[(text()='Select This Time')]"));
		js.executeScript("arguments[0].click()", selecttime);
	}

	//Click on the BookNow button
	public void checkoutasguest() throws InterruptedException {
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		try {
			//Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement booknow=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='ghost-button submit-button']")));
			////*[@class='ghost-button submit-button']
			//js.executeScript("arguments[0].click()", booknow);
			booknow.click();
			System.out.println("Element is clickable");
		} 

		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Element is not clickable");

		}

		//logger.info("Click on the Booknow button");
	}
	//Enter the firstName
	public void Enterfirstname() throws AWTException {
		JavascriptExecutor js=(JavascriptExecutor)driver;

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement fname=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='FirstName']")));
		js.executeScript("arguments[0].value='Lisa'",fname);
		fname.clear();
		fname.sendKeys("Booster");
		//ExtentTest test =extent.createTest("firstname entered successfully");
		//logger.info("Enter the firstname");
		//test.info("firstname entered successfully");
	}
	//Enter the lastName
	public void Enterlastname() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement lname=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='LastName']")));
		js.executeScript("arguments[0].value='Automationtest'",lname);
		lname.clear();
		lname.sendKeys("Automation");
		//lastname.sendKeys("Test");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	//Enter the dateofbirth
	public void Enterdateofbirth() throws InterruptedException{
		try {
			//JavascriptExecutor js=(JavascriptExecutor)driver;
			//WebElement dateofbirth=driver.findElement(By.xpath("//*[@id='DateBirth']/span/kendo-dateinput/span/input"));
			Actions act = new Actions(driver);

			act.sendKeys(Keys.TAB).build().perform();
			act.sendKeys(Keys.RETURN).build().perform();
			//waitingtime.shortWait();

			act.sendKeys(Keys.TAB).build().perform();
			act.sendKeys(Keys.RETURN).build().perform();

			//WebElement date= driver.findElement(By.xpath("//*[@id=\"DateBirth\"]/span/span/span"));
			WebElement date= driver.findElement(By.xpath("//*[@id='DateBirth']/span/kendo-dateinput/span/input"));
			date.sendKeys("02151981");

		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Element not clickable");

		}
	}
	//Select the gender
	public void gender() {
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement gender=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Male')]")));
			//gender.click();
			js.executeScript("arguments[0].click()", gender);
			System.out.println("Element is clickable");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Element is not clickable");

		}

	}
	//Enter the address
	public void address() {
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement address=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='Street']")));
			js.executeScript("arguments[0].value='123 Treat Rd'", address);
			address.clear();
			address.sendKeys("123 Treat Rd");
			System.out.println("Element is clickable");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Element is not clickable");

		}

		//Enter the cityname 

		try {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement city=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='City']")));
			js.executeScript("arguments[0].value='Aurora'", city);
			city.clear();
			city.sendKeys("Aurora");
			System.out.println("Element is clickable");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Element is not clickable");

		}

		//Enter the ZipCode
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement ZipCode=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='ZipCode']")));
			js.executeScript("arguments[0].value='44202'", ZipCode);
			ZipCode.clear();
			ZipCode.sendKeys("44202");
			System.out.println("Element is clickable");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Element is not clickable");

		}

	}

	//Enter the EmailAddress
	public void Email() {
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement email=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='Email']")));
			js.executeScript("arguments[0].value='uh@uh.com'", email);
			email.clear();
			email.sendKeys("uh@uh.com");
			System.out.println("Element is clickable");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Element is not clickable");

		}

	}
	//Enter the phoneNumber
	public void phonenumber() {
		try {
			//WebElement phonenumber=driver.findElement(By.xpath("//*[@class='k-textbox']"));

			WebElement phonenumber = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='k-textbox']")));


			JavascriptExecutor js=(JavascriptExecutor)driver;
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			js.executeScript("arguments[0].value='330-444-1111'",phonenumber);
			//phonenumber.sendKeys("330-444-1111");
			phonenumber.clear();
			phonenumber.sendKeys("330-444-1111");
			//3rd way of enter the values 
			//js.executeScript("document.getElementsByclassName('k-textbox')[0].value='sendkeys'");

			//4th way of enter the values :

			Thread.sleep(3000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_SPACE);
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_S);
			robot.keyPress(KeyEvent.VK_E);
			robot.keyRelease(KeyEvent.VK_E);
			robot.keyPress(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_N);
			robot.keyPress(KeyEvent.VK_D);
			robot.keyRelease(KeyEvent.VK_D);
			// logger.info("phoneNumber entered");
			System.out.println("Element is clickable");


		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Element is not clickable");

		}
	}
	//Click on the Terms and Conditions
	public void termsconditions() {
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement termsconditions=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/app-root[1]/main[1]/app-createaccount[1]/form[1]/section[2]/div[1]/div[1]/div[1]/label[1]/label[1]")));
			js.executeScript("arguments[0].click()", termsconditions);
			System.out.println("Element is clickable");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Element is not clickable");

		}
	}
	//Click on the Continue button
	public void Continue() {
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement Continue=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[(text()='Continue')]")));
			js.executeScript("arguments[0].click()", Continue);
			System.out.println("Element is clickable");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Element is not clickable");

		}
	}
	//Enter the providerName
	public void providerinfo() throws InterruptedException {
		//Thread.sleep(5000);
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebDriverWait wait = new WebDriverWait(driver, 15);
			WebElement  providername = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/app-root[1]/main[1]/app-createaccount[1]/section[3]/div[1]/div[1]/div[1]/div[1]/kendo-autocomplete[1]/kendo-searchbar[1]/input[1]")));
		

			//WebElement  providername = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
			providername.sendKeys("A");
			WebElement  providername1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[(text()='Arnob Jacob')]")));
			js.executeScript("arguments[0].click()", providername1 );
//			
//			Thread.sleep(5000);
////List<WebElement>
//		List<WebElement> autoSuggest= driver.findElements(By
//					.xpath("//div[@class='k-autocomplete k-widget k-header ng-valid ng-touched ng-dirty']"));
//			
//			
//			// verify the size of the list
//			
//			
//			System.out.println("Size of the AutoSuggets is = " + autoSuggest.size());
//			// print the auto suggest
//			for (WebElement a : autoSuggest)
//				System.out.println("Values are = " + a.getText());
//			// suppose now you want to click on 3rd auto suggest then simply do like
//			// this
//			Thread.sleep(2000);
//			// autoSuggest.get(0).click();
//			
//			providername.sendKeys(Keys.ENTER);

		}

		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Element is not clickable");
		}
	}



	//Enter the ProviderPhone
	public void providerphone() throws InterruptedException, AWTException {
		Thread.sleep(5000);
		try {
			//WebElement phonenumber=driver.findElement(By.xpath("//*[@class='k-textbox']"));

			WebElement phonenumber = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='k-textbox']")));


			JavascriptExecutor js=(JavascriptExecutor)driver;
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			js.executeScript("arguments[0].value='330-444-1111'",phonenumber);
			//phonenumber.sendKeys("330-444-1111");
			phonenumber.clear();
			phonenumber.sendKeys("330-444-1111");

			//3rd way of enter the values 
			//js.executeScript("document.getElementsByclassName('k-textbox')[0].value='sendkeys'");

			//4th way of enter the values :

			Thread.sleep(3000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_SPACE);
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_S);
			robot.keyPress(KeyEvent.VK_E);
			robot.keyRelease(KeyEvent.VK_E);
			robot.keyPress(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_N);
			robot.keyPress(KeyEvent.VK_D);
			robot.keyRelease(KeyEvent.VK_D);
			// logger.info("phoneNumber entered");
			System.out.println("Element is clickable");
			//logger.info("Entered providers phoneNumber");


		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Element is not clickable");

		}
	}
	//Click on the Continue button
	public void continuebtn() {
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebDriverWait wait = new WebDriverWait(driver, 5);
			WebElement continuebtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[(text()='Continue')]")));
			js.executeScript("arguments[0].click()", continuebtn);
			//continuebtn.click();
			//logger.info("Click on the continue button");
			System.out.println("Element is clickable");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Element is not clickable");

		}
	}
	//Skip on the insurance button
	public void Skipinsurancepage() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement Skipinsurance=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/main/app-experian/section[3]/div/div/div/div/p")));
			Skipinsurance.click();
			//logger.info("Skipped the insurance page");
			System.out.println("Element is clickable");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Element is not clickable");
		}
	}
/*
	//Click on the Confirm appointment button
	public void confirmapt() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement Confirmapt=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Confirm Appointment')]")));
		Actions action = new Actions(driver);
		action.moveToElement(Confirmapt);
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0," + Confirmapt.getLocation().y + ")"); 
		js.executeScript("arguments[0].click()", Confirmapt);

	}
*/
}
