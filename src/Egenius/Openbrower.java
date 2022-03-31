package Egenius;

import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrower {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
ChromeDriver cd=new ChromeDriver();
cd.getCurrentUrl();

}

}
