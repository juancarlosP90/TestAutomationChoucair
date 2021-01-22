package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testSectionsNavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jpulido\\Documents\\2020\\Automatizaciones\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		
		driver.findElement(By.className("sf-with-ul")).click();
		
		//Scroll down on the page
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(4000);
				
		//scroll up 
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(4000);
		
		driver.findElement(By.className("sf-with-ul")).click();
		
		
	}

}
