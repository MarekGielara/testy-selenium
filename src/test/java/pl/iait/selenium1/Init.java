package pl.iait.selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Init
{
	static WebDriver driver;

	public static WebDriver getDriver()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Tester\\CHD\\chromedriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.chrome();

		if (driver == null)
		{
			driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com");
			return driver;
		} else
		{
			return driver;
		}
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//sleep(2);

	}

	public static void endTest()
	{
		driver.quit();
		driver = null;
	}

	/**
	 * Metoda wstrzymuje wykonanie programu na x sekund
	 * 
	 * @param seconds
	 */
	public static void sleep(int seconds)
	{
		try
		{
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
