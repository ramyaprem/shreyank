package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg_6_selectallthecheckboxeswhichareunchecked {

	public static void main(String[] args) throws InterruptedException {
		//to initialize the browser
		System.setProperty("webdriver.chrome.driver","./Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
	Thread.sleep(5000);
		//read all the checkboxes from the page 
				List<WebElement> chkBoxes=driver.findElements(By.name("Checkbox"));
				
				for(WebElement chkBox: chkBoxes) {
				//check that checkbox selected or not
					if(!chkBox.isSelected()) {
						//select checkbox if it is not selected
						chkBox.click();	
		
		
	}
		
		
	

				}
	}}

