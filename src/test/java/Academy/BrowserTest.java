package Academy;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//added
from selenium import webdriver
from webdriver_manager.chrome import ChromeDriverManager



public class BrowserTest {

	
	@Test
	public void getData()
	{
		System.out.println("Hello Guys");
		//added
		driver = webdriver.Chrome(ChromeDriverManager(version="87.0.4280.88").install())
driver.get("https://www.google.com");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahylshettyacademy.azurewebsites.net/webapp/");
		String text =driver.findElement(By.cssSelector("h1")).getText();
		System.out.println(text);
		Assert.assertTrue(text.equalsIgnoreCase("RahulShettyAcademy.com Learning"));
		driver.close();
	
		
		
	}
}
