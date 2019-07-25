package demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class helloworld2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver;
		System.out.println("hello");
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");//right path of chrome driver.exe




		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("a@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("1234");


	}

}
