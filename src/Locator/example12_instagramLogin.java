package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example12_instagramLogin
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		//enter UN
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9999999999");
		
		
		//Enter PWD
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("xyz@123");
		
		Thread.sleep(4000);
		
		//click on login btn
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}

}
