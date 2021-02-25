package radioandcheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttonchech1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://demoqa.com/radio-button");
       WebElement yesradio = driver.findElement(By.xpath("//*[@type='radio' and @id='yesRadio']"));
	   WebElement noradio = driver.findElement(By.id("noRadio"));
	   System.out.println(yesradio.isEnabled());
	   System.out.println(noradio.isEnabled());
	}

}
 