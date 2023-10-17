package projectgit4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoguru {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Stc first demo test by using main method");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.findElement(By.name("submit")).click();
	}
}
