package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg_5_to_uncheckthe2ndcheckbox {

	public static void main(String[] args) throws InterruptedException {
	//to initialize the browser
		System.setProperty("webdriver.chrome.driver","./Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//to uncheck the 2nd checkbox
		driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[1]/tbody/tr/td/table/tbody/tr[2]/td[3]/input[2]")).click();
			
	}

}
