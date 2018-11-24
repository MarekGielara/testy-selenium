package pl.iait.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class App 
{
	static WebDriver driver; 
	
    public static void main( String[] args )
    {
        
    	System.setProperty("webdriver.chrome.driver", "D:\\Tester\\CHD\\chromedriver.exe");
    	DesiredCapabilities cap = DesiredCapabilities.chrome();
    	driver = new ChromeDriver();
    	driver.get("http://newtours.demoaut.com");
   
    	String pageTitle = driver.getTitle();
    	System.out.print(pageTitle);
    	
    	driver.findElement(By.linkText("SIGN-ON")).click();
    	driver.findElement(By.name("userName")).sendKeys("gm@op.pl");
    	driver.findElement(By.name("password")).sendKeys("zaq123");
    	driver.findElement(By.name("login")).click();
    	
    }
}
