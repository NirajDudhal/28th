package Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7_ID
{
	public static void main(String[] args) 
	{		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sanja/OneDrive/Desktop/Study/28Th%20Jan%20Eve/ID.html");
				
		//enter FN
		driver.findElement(By.id("1234")).sendKeys("abc");
		
		//enter LN
		driver.findElement(By.id("1234")).sendKeys("xyz");	
	}
}
