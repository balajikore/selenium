package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SingleValueDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
			    WebDriver driver=new ChromeDriver();
			    driver.manage().window().maximize();
			    driver.get("http://demo.guru99.com/test/newtours/register.php");
			    WebElement DD = driver.findElement(By.name("country"));
			    Select sel=new org.openqa.selenium.support.ui.Select(DD);
			    sel.selectByIndex(2);
			    Thread.sleep(2000);
			    sel.selectByValue("BOTSWANA");
			    Thread.sleep(2000);
			    sel.selectByVisibleText("EQUATORIAL GUINEA");
			    Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
