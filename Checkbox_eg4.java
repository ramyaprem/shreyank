package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_eg4 {

	public static void main(String[] args) throws InterruptedException {
	//to initialize the browser
		System.setProperty("webdriver.chrome.driver","./Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		WebElement Chkbox=driver.findElement(By.id("rememberUn"));
		//to select checkbox
		Chkbox.click();
		Thread.sleep(5000);
		//to uncheck the checkbox
		Chkbox.click();
		
		
		
		

	}

}
