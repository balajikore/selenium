package radioandcheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/checkbox");
		//WebElement firstcheck = driver.findElement(By.xpath("//*[contains(text(),'Desktop')]/preceding-sibling::input"));
		WebElement firstcheck = driver.findElement(By.xpath("//*[@id='tree-node-desktop']"));
		System.out.println(firstcheck.getText());
		//System.out.println(firstcheck.isDisplayed());
		//System.out.println(firstcheck.isEnabled());
		//firstcheck.click();
		//System.out.println(firstcheck.isSelected());
	}

}
