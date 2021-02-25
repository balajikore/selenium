package radioandcheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://demo.guru99.com/test/radio.html");
	        WebElement ratiobutton1 = driver.findElement(By.xpath("//*[@ name='webform' and @value='Option 1']"));
	        ratiobutton1.click();
	        WebElement chb1 = driver.findElement(By.xpath("//*[@ type='checkbox' and @value='checkbox1']"));
	        chb1.click();
	}

}
