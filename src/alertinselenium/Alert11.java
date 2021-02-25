package alertinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert11 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.MILLISECONDS);
		driver.get("https://demoqa.com/alerts");
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[contains(text(),'Alerts, Frame & Windows')]")).click();
       // driver.findElement(By.xpath("//span[contains(text(),'Alerts')]")).click();
       WebElement firstbtn = driver.findElement(By.id("alertButton"));
       firstbtn.click();
       Alert alt=driver.switchTo().alert();
       System.out.println(alt.getText());
       alt.accept();
       
       //driver.findElement(By.id("timerAlertButton")).click();
      // WebDriverWait wt=new WebDriverWait(driver, 15);
      //wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("timerAlertButton"))));
      //alt=driver.switchTo().alert();
       
       //System.out.println(alt.getText());
       
       driver.findElement(By.id("confirmButton")).click();
       alt=driver.switchTo().alert();
       System.out.println(alt.getText());
      // alt.accept();
       alt.dismiss();
       
       driver.findElement(By.id("promtButton")).click();
       alt=driver.switchTo().alert();
       alt.sendKeys("Hi....... VIRABHADRA");
      alt.accept();
       //alt.dismiss();
       
       
       
       
	}

}
