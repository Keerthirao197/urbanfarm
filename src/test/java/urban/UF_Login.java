package urban;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UF_Login {
	
	WebDriver driver=new ChromeDriver();
	
	@BeforeClass
	public void Setup()
	{
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testing.myurbanfarmer.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Login() throws InterruptedException
	{
		
		WebElement Lgnbtn=driver.findElement(By.xpath("//a[normalize-space()='LOGIN']"));
		Lgnbtn.click();
		Thread.sleep(3000);
		
		WebElement MobileNum=driver.findElement(By.xpath("//input[@placeholder='Mobile No']"));
		MobileNum.sendKeys("9063671780");
		
		WebElement ReqOtp=driver.findElement(By.xpath("//button[normalize-space()='Request OTP']"));
		ReqOtp.click();
	}

}
