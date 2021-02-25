package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleValueDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://output.jsbin.com/osebed/2");
			WebElement MDD = driver.findElement(By.id("fruits"));
			Select sel=new Select(MDD);
			boolean flag1 = sel.isMultiple();
			System.out.println(flag1);
				sel.selectByIndex(0);
			    Thread.sleep(1500);
				sel.selectByValue("grape");
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
