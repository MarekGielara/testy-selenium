package pl.iait.pageObjects;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.iait.selenium1.Init;

public class ReservationPage
{
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")
	WebElement one_way;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")
	WebElement round_trip;
	
	@FindBy(name = "passCount")
	WebElement passCount;
	
	@FindBy(name = "fromPort")
	WebElement fromPort;
	
	@FindBy(name = "fromMonth")
	WebElement fromMonth;
	
	@FindBy(name = "fromDay")
	WebElement fromDay;
	
	@FindBy(name = "toPort")
	WebElement toPort;
	
	@FindBy(name = "toMonth")
	WebElement toMonth;
	
	@FindBy(name = "toDay")
	WebElement toDay;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/input")
	WebElement econo_class;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")
	WebElement business_class;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")
	WebElement first_class;
	
	@FindBy(name = "airline")
	WebElement airline;
	
	@FindBy(name = "findFlights")
	WebElement findBtn;
	
	
	
	
	
	//-------------------------------------------------------------
	
	public ReservationPage()
	{
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void oneWayRadioClick ()
	{
		one_way.click();
	}
	public void roundTripRadioClick()
	{
		round_trip.click();
	}
	
	
	public void passCountSelect(String count) {
		Select pCountSel = new Select(passCount);
		pCountSel.selectByValue(count);
	}
	
	public void fromPortSelect(String from) {
		Select sel = new Select(fromPort);
		sel.selectByValue(from);
	}
	
	public void fromMonthSelect(String month)
	{
		Select mon = new Select(fromMonth);
		mon.selectByValue(month);
	}
	
	public void fromDaySelect(String day)
	{
		Select d = new Select(fromDay);
		d.selectByValue(day);
	}
	
	public void toPortSelect(String to)
	{
		Select t = new Select(toPort);
		t.selectByValue(to);
		
	}
	
	public void toMonthSelect(String tmonth)
	{
		Select tm = new Select(toMonth);
		tm.selectByValue(tmonth);
		
	}
	public void toDaySelect(String tday)
	{
		Select td = new Select(toDay);
		td.selectByValue(tday);
		
	}
	
	public void econoRadioClick ()
	{
		econo_class.click();
	}
	public void businessRadioClick()
	{
		business_class.click();
	}
	
	public void firstRadioClick()
	{
		first_class.click();
	}
		
	public void airlineSelect(String aline) 
	{
		Select airSel = new Select(airline);
		airSel.selectByVisibleText(aline);
		
	}
	public void findFlightClick()
	{
		findBtn.click();
	}
	
	

}