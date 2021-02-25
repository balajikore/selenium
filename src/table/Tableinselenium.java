package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Tableinselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sknscoe.ac.in/governing.php");
		List<WebElement> row = driver.findElements(By.xpath("/html/body/div[2]/div/div[1]/div[2]/table/tbody/tr"));
		for(WebElement eachrow:row)
		{
			String str1 = eachrow.findElement(By.xpath("td[1]")).getText();
			String str2 = eachrow.findElement(By.xpath("td[2]")).getText();
			String str3 = eachrow.findElement(By.xpath("td[3]")).getText();
			System.out.println(str1+"  "+str2+"   "+str3);
		}
			
		
		
	}

}
