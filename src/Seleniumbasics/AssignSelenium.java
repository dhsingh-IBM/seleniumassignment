package Seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignSelenium {

	public static void main(String[] args) 
	{

		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("http://retailm1.upskills.in/");
		driver.manage().window().maximize();
		driver.findElement(By.className("fa-user-o")).click();
		driver.findElement(By.className("btn-primary")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("sunil");
		driver.findElement(By.id("input-lastname")).sendKeys("nagaraj");
		driver.findElement(By.id("input-email")).sendKeys("sunil@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
		driver.findElement(By.id("input-address-1")).sendKeys("yeshwanthapur");
		driver.findElement(By.id("input-address-2")).sendKeys("bangalore");
		driver.findElement(By.id("input-city")).sendKeys("bangalore");
		driver.findElement(By.id("input-postcode")).sendKeys("560022");
		 
		Select sel=new Select(driver.findElement(By.id("input-country")));
		sel.selectByVisibleText("India");
      	Select reg =new Select(driver.findElement(By.id("input-zone")));
		reg.selectByVisibleText("Karnataka");
		driver.findElement(By.id("input-password")).sendKeys("manipal");
		driver.findElement(By.id("input-confirm")).sendKeys("manipal");
		driver.findElement(By.xpath("//*[@id=\"System_nyHsmShk\"]/form/fieldset[4]/div/div/label[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"System_nyHsmShk\"]/form/div/div[1]/label/input")).click();
		driver.findElement(By.xpath("//input[@type='submit']"));
		driver.close();
		
	}
}
