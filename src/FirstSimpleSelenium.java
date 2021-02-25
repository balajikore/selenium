import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSimpleSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://en-gb.facebook.com/login/");
        WebDriver driver1=new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://demoqa.com/elements");
        WebElement ele = driver1.findElement(By.className("main-header"));
        String strname = ele.getText();
        System.out.println(strname);
       
        //checking for git commiet
        
      // List<WebElement> alllink = driver.findElements(By.tagName("a"));
       //System.out.println(alllink.size());
       //alllink.get(40).click();
        
       WebElement uname = driver.findElement(By.id("email"));
        uname.sendKeys("balaji.kore@gmail.com");
       WebElement pass = driver.findElement(By.id("pass"));
        pass.sendKeys("Balaji@1234");
        WebElement lgbtn = driver.findElement(By.name("login"));
       //lgbtn.submit();
       String name = uname.getAttribute("value");
       System.out.println(name);
       String password1 = pass.getAttribute("value");
       System.out.println(password1);
       
	}

}
