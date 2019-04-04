package databaseconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class DatabaseTrail {
	@Test(priority=1)
public void test1() {
	System.out.println("this is first test");
}
	@Test(priority=0)
	public void test2() {
		System.out.println("this is 2nd test");
	}
		@Test(priority=3)
		public void test3() {
			System.out.println("this is 3rd test");
		}
	
}

