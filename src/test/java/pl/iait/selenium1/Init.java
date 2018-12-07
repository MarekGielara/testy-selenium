package pl.iait.selenium1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Init
{
	static WebDriver driver;

	public static WebDriver getDriver()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Tester\\CHD\\chromedriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		/*URL url = null;
		try
		{
			url = new URL("http://192.168.1.14:4444/wd/hub");
		} catch (MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		if (driver == null)
		{
			//driver = new ChromeDriver();
			driver = new RemoteWebDriver(url, cap);
			driver.get("http://newtours.demoaut.com");
			return driver;
		} else
		{
			return driver;
		} */
		return driver;
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//Init.sleep(2);

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
