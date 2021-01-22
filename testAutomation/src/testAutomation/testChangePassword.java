package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testChangePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jpulido\\Documents\\2020\\Automatizaciones\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.className("login")).click(); // Automatizacion para realizar login en el sitio con credenciales
		driver.findElement(By.id("email")).sendKeys("pruebaJuan@prueba.com");
		driver.findElement(By.id("passwd")).sendKeys("Juan123456");
		driver.findElement(By.id("SubmitLogin")).click();
		
		driver.findElement(By.className("icon-user")).click();
		
		driver.findElement(By.id("old_passwd")).sendKeys("Juan123456");
		driver.findElement(By.id("psswd")).sendKeys("54321Juan");
		driver.findElement(By.id("confirmation")).sendKeys("54321Juan");
		
		driver.findElement(By.className("btn btn-default button button-medium")).click();
	}

}
