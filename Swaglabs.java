package swaglabs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglabs {

	public static void main(String[] args) throws InterruptedException   {
 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"user-name\"]")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
		Thread.sleep(2000);
		//selecting to  the container 
		driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]")).click();
		//here put option be like low to high price 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value=\"lohi\"]")).click();
		//after put option be like low to high price select add to cart
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class=\"inventory_item_name \"])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name=\"add-to-cart-sauce-labs-onesie\"]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name=\"checkout\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("Rajesh");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Megavath");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"postalCode\"]")).sendKeys("523001");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"continue\"]")).click();
 
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1000)", "");
		
		driver.findElement(By.xpath("//button[@name=\"finish\"]")).click();
		Thread.sleep(2000);
		
 		driver.quit();
 		
		 
		
	}

}
