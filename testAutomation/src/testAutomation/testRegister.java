package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jpulido\\Documents\\2020\\Automatizaciones\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php"); // acceder a la url propuesta
		
		
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("pruebaJP2@prueba.com"); // Realizar registro con datos "quemados"
		driver.findElement(By.id("SubmitCreate")).click();
		
		driver.findElement(By.id("uniform-id_gender2")).click(); // Seleccion radio button según genero.
		driver.findElement(By.id("customer_firstname")).sendKeys("Mariana"); //Nombre
		driver.findElement(By.id("customer_lastname")).sendKeys("Gomez"); // Apellido
		driver.findElement(By.id("psswd")).sendKeys("prueba123456");
		
		

	}

}
