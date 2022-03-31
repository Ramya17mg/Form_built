package Egenius;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserFirefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.gecko.driver ","C:\\Users\\DELL\\Downloads\\geckodriver-v0.30.0-win64\\gecko.driver.exe");
		FirefoxDriver Driver =new FirefoxDriver();
		Thread.sleep(2000);
		

	}

}
