package Com.Launchings;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Handles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
        
		driver.get("https://jobserve.com/in/en/Job-Search/");
		
		String Parent_window=driver.getWindowHandle();
		System.out.println(" parent window id is "+Parent_window);
		
		 driver.findElement(By.xpath("//*[@id=\"bannerdisplay\"]/a/img")).click();
		 Set<String> child_windows=driver.getWindowHandles();
		 int count =child_windows.size();
		 System.out.println("number of windows opened is " +count);
		 
		 for (String Child : child_windows) 
		 {
			
			 if(!Parent_window.equalsIgnoreCase(Child)) 
			 {
				 driver.switchTo().window(Child);
				 String title=driver.getTitle();
				 System.out.println(title);
			 }
		 
		 }
		
		 String currentwindow= driver.getWindowHandle();
		 System.out.println(currentwindow);
		 
		
		
		
		
		
		
		

	}

}
