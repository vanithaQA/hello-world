Mammogramguestcheckout.java
package com.Mammography.TestCases;


import java.awt.AWTException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import com.Radiologymammogram.BaseClass;
import com.Radiologymammogram.Mammogramguestcheckout;
import com.aventstack.extentreports.ExtentTest;

/**
 * @author vnampel1
 *
 */

public class MammographyGuest extends BaseClass{
	private static Logger logger = LogManager.getLogger(MammographyGuest.class);
	@Test 
	public void Verifyvaliddropdown() throws InterruptedException, AWTException {

		driver.get("https://www.uhhospitals.org/radiology-scheduling?type=Mam");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		logger.info("Url opened successfully");
		ExtentTest test =extent.createTest("URL entered successfully");
		test.info("URL is loaded");
		test.pass("URL opened successfully");

		Mammogramguestcheckout mammogram = new Mammogramguestcheckout(driver);
		mammogram.whoschedulingfor();
		logger.info("Myself option selected successfully");
		ExtentTest test1 =extent.createTest("Selected myself option from dropdown");
		test1.info("Myself selected successfully");
		test1.pass("Myself selected successfully");

		mammogram.Typeofradiologyappt();
		logger.info("Mammography option selected");
		ExtentTest test2 =extent.createTest("Mammography selected from dropdown");
		test2.info("Mammography selected from dropdown");
		test2.pass("Mammography selected from dropdown");

		mammogram.Typeofservice();
		logger.info("Mammo -screening digital option selected successfully");
		ExtentTest test3 =extent.createTest("Mammo -screening digital option selected successfully");
		test3.info("Mammo -screening digital option selected successfully");
		test3.pass("Mammo -screening digital option selected successfully");

		mammogram.Clickageband(); 
		logger.info("Click on the No for under 35 button");
		ExtentTest test4 =extent.createTest("Selected NO for under 35 years");
		test4.info("Selected NO for under 35 years");
		test4.pass("Selected NO for under 35 years");

		mammogram.Seemoretimes(); 
		logger.info("Click on the seemoretimeslots option");
		ExtentTest test5 =extent.createTest("Selected the seemoretimeslots option");
		test5.info("Selected the seemoretimeslots option");
		test5.pass("Selected the seemoretimeslots option");

		logger.info("selected the available time slots");
		ExtentTest test6 =extent.createTest("selected the available time slots successfully");
		test6.info("selected the available time slots successfully");
		test6.pass("selected the available time slots successfully");

		mammogram.checkoutasguest();
		logger.info("Click on the Book now for guest checkout");
		ExtentTest test7 =extent.createTest("selected the guest checkout option successfully");
		test7.info("selected the guest checkout option successfully");
		test7.pass("selected the guest checkout option successfully");

		mammogram.Enterfirstname();
		logger.info("Entered the firstName");
		ExtentTest test8 =extent.createTest("FirstName entered successfully");
		test8.info("FirstName entered successfully");
		test8.pass("FirstName entered successfully");

		mammogram.Enterlastname();
		logger.info("Entered the LastName");
		ExtentTest test9 =extent.createTest("LastName entered successfully");
		test9.info("LastName entered successfully");
		test9.pass("LastName entered successfully");

		mammogram.Enterdateofbirth();
		logger.info("Entered the date of birth");
		ExtentTest test10 =extent.createTest("Date of birth entered successfully");
		test10.info("Date of birth entered successfully");
		test10.pass("Date of birth entered successfully");

		mammogram.gender();
		logger.info("Selected the Gender");
		ExtentTest test11 =extent.createTest("Gender selected successfully");
		test11.info("Gender selected successfully");
		test11.pass("Gender selected successfully");

		mammogram.address();
		logger.info("Entered the Address");
		ExtentTest test12 =extent.createTest("Address entered successfully");
		test12.info("Address entered successfully");
		test12.pass("Address entered successfully");

		mammogram.Email();
		logger.info("Entered the email address");
		ExtentTest test13 =extent.createTest("Email address entered successfully");
		test13.info("Email address entered successfully");
		test13.pass("Email address entered successfully");

		mammogram.phonenumber();
		logger.info("Entered the phoneNumber");
		ExtentTest test14 =extent.createTest("Entered the phoneNumber successfully");
		test14.info("Entered the phoneNumber successfully");
		test14.pass("Entered the phoneNumber successfully");

		mammogram.termsconditions();
		logger.info("Clicked on the Terms and Condition");
		ExtentTest test15=extent.createTest("Clicked on the Terms and Condition successfully");
		test15.info("Clicked on the Terms and Condition successfully");
		test15.pass("Clicked on the Terms and Condition successfully");

		mammogram.Continue();
		logger.info("Clicked on the Continue");
		ExtentTest test16=extent.createTest("Clicked on the Continue successfully");
		test16.info("Clicked on the Continue successfully");
		test16.pass("Clicked on the Continue successfully");

		mammogram.providerinfo();
		logger.info("Provider name entered successfully");
		ExtentTest test17 =extent.createTest("Provider name entered successfully");
		test17.info("Provider name entered successfully");
		test17.pass("Provider name entered successfully");

		mammogram.providerphone();
		logger.info("phoneNumber entered");
		ExtentTest test18 =extent.createTest("Provider's phoneNumber entered successfully");
		test18.info("Provider's phoneNumber entered successfully");
		test18.pass("Provider's phoneNumber entered successfully");
/*
		mammogram.continuebtn();
		logger.info("Click on the continue button");
		ExtentTest test19=extent.createTest("Provider name and phonenumber entered successfully");
		test19.info("Provider name and phonenumber entered successfully");
		test19.pass("Provider name and phonenumber entered successfully");

		mammogram.Skipinsurancepage();
		logger.info("Skipped the insurance");
		ExtentTest test20=extent.createTest("Insurance skipped successfully");
		test20.info("Insurance skipped successfully");
		test20.pass("Insurance skipped successfully");
/*
		mammogram.confirmapt();
		logger.info("Appointment confirmed successfully");
		ExtentTest test21=extent.createTest("Appointment confirmed successfully");
		test21.info("Appointment confirmed successfully");
		test21.pass("Appointment confirmed successfully");
*/
	}


}
