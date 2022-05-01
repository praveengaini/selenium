package Com.Launchings;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class multipletabsSwitching_four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentWindow= driver.getWindowHandle();
		System.out.println("parent window id is "+parentWindow);
		
		
		
		
		//driver.switchTo().frame(0);
		
		
		/*
		 * WebElement Tab1=
		 * driver.findElement(By.xpath("//*[contains(text(),'Open New Window')]"));
		 * WebDriverWait wait=new WebDriverWait(driver, 20);
		 * wait.until(ExpectedConditions.elementToBeClickable(Tab1)); Tab1.click();
		 */
		
		//WebElement tab2=driver.findElement(By.xpath("//*[@id='newTabBtn']"));
		
		//WebDriverWait wait1=new WebDriverWait(driver,20);
		//wait1.until(ExpectedConditions.elementToBeClickable(tab2));
		//tab2.click();
		/*
		 * WebElement tab3=
		 * driver.findElement(By.xpath("//*[@id=\"HTML11\"]/div[2]/a")); WebDriverWait
		 * wait1=new WebDriverWait(driver,20);
		 * wait1.until(ExpectedConditions.elementToBeClickable(tab3)); tab3.click();
		 */
		
		
		//Set<String> allwindows=driver.getWindowHandles();
		
		//ArrayList<String> tabs=new ArrayList<String>(allwindows);
		
		//driver.switchTo().window(tabs.get(3));
		//driver.close();
		
		//driver.switchTo().window(tabs.get(2));
		//driver.close();
		
		//driver.switchTo().window(tabs.get(1));
		//driver.close();
		
		
		

	}

}
