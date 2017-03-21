package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\External\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.amazon.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='nav-tools']/a[1]/span[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("ap_email")).sendKeys("adfsdfsdf");
		Thread.sleep(4000);
		driver.findElement(By.id("ap_password")).sendKeys("test@gmail.com");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(4000);
		String s = driver.findElement(By.className("a-list-item")).getText();
		System.out.println(s);
	}
}
