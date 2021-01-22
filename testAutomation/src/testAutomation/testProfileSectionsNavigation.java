package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testProfileSectionsNavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jpulido\\Documents\\2020\\Automatizaciones\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php"); // acceder a la url propuesta
		
		
		driver.findElement(By.className("login")).click(); // Automatizacion para realizar login en el sitio con credenciales
		driver.findElement(By.id("email")).sendKeys("pruebaJuan@prueba.com");
		driver.findElement(By.id("passwd")).sendKeys("Juan123456");
		driver.findElement(By.id("SubmitLogin")).click();
		
		driver.findElement(By.className("icon-list-ol")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.className("icon-chevron-left")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.className("icon-ban-circle")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.className("icon-chevron-left")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.className("icon-building")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.className("icon-chevron-left")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.className("icon-user")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.className("icon-chevron-left")).click();
		Thread.sleep(4000);

		driver.findElement(By.className("icon-heart")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.className("icon-chevron-left")).click();
		Thread.sleep(4000);
		

	}

}
