package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Software\\chromedriver_win32-2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");

		// 1.xpath

		// driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Shristy");
		// driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Shrama");
		// driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("shr@gmail.com");

		// 2.id

		// driver.findElement(By.id("firstname")).sendKeys("Shristy");
		// driver.findElement(By.id("lastname")).sendKeys("Shrama");
		// driver.findElement(By.id("PASSWORD")).sendKeys("1234");

		// 3.name

		driver.findElement(By.name("firstname")).sendKeys("Shristy");
		driver.findElement(By.name("lastname")).sendKeys("Sharma");
		driver.findElement(By.name("email")).sendKeys("shr@gmail.com");
		driver.findElement(By.name("checkbox-default")).click();

		// 4.linkText

		// driver.findElement(By.linkText("Sign in")).click();

		// 5.partialLinkText

		// driver.findElement(By.partialLinkText("Create ")).click();

		// 6.CSSselector

		driver.findElement(By.cssSelector(".sgnInTxt")).click();

		// 7.className

		// driver.findElement(By.className("sgnInTxt")).click();

	}
}
