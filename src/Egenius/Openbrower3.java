package Egenius;

import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrower3 {
private static ChromeDriver cd;

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
cd = new ChromeDriver();

}

}
