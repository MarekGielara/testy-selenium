package pl.iait.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.iait.selenium1.Init;

public class Reservation2Page
{
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table"
			+ "/tbody/tr[4]/td/table/tbody/tr/td[2]/table"
			+ "/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input")
	WebElement depart;

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table"
			+ "/tbody/tr[4]/td/table/tbody/tr/td[2]/table"
			+ "/tbody/tr[5]/td/form/table[2]/tbody/tr[7]/td[1]/input")
	WebElement return_dep;
	
	@FindBy(name = "reserveFlights")
	WebElement res_fly;
	
	//----------------------------------------
	
	@FindBy(name = "passFirst0")
	WebElement firstName;
	
	@FindBy(name = "passLast0")
	WebElement lastName;
	
	@FindBy(name = "passFirst1")
	WebElement firstName1;
	
	@FindBy(name = "passLast1")
	WebElement lastName1;
	
	@FindBy (name = "pass.0.meal")
	WebElement meal;
	
	@FindBy (name = "pass.1.meal")
	WebElement meal1;
	
	@FindBy (name = "creditCard")
	WebElement creditCard;
	
	@FindBy (name = "creditnumber")
	WebElement creditnumber;
	
	@FindBy (name = "buyFlights")
	WebElement secParches;
	
	
	
	
	
	
	
	
	public Reservation2Page()
	{
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void departRadioClick ()
	{
		depart.click();
	}	
	public void returnRadioClick ()
	{
		return_dep.click();
	}
	
	public void reserveClick()
	{
		res_fly.click();
	}
	
	//---------------------------------------
	
	
	public void pass0(String imie, String nazwisko, String posilek)
	{
		firstName.sendKeys(imie);
		lastName.sendKeys(nazwisko);
		
		Select m = new Select(meal);
		m.selectByVisibleText(posilek);
		
		
	}
	
	public void pass1(String imie, String nazwisko, String posilek)
	{
		firstName1.sendKeys(imie);
		lastName1.sendKeys(nazwisko);
		
		Select m = new Select(meal1);
		m.selectByVisibleText(posilek);
		
		
	}
	
	public void creditCard(String name)
	{
		Select c = new Select(creditCard);
		c.selectByVisibleText(name);
	}
	
	public void numberCard(String number)
	
	{
		creditnumber.sendKeys(number);
	}
	
	public void secPurchesClick()
	{
		secParches.click();
	}
	
	
	
}
