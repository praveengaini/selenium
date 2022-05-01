package Com.Launchings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextandGetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		//identifying forgotten  pwd test by x path
		String headingText=driver.findElement(By.xpath("//*[text()='Forgotten password?']")).getText();
		System.out.println(headingText);
		
		String getattribute=driver.findElement(By.xpath("//*[@id='email']")).getAttribute("placeholder");
		System.out.println(getattribute);
		driver.close();

		
		

	}

}
