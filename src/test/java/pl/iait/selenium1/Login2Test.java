package pl.iait.selenium1;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import pl.iait.pageObjects.LoginPage;
import pl.iait.pageObjects.Reservation2Page;
import pl.iait.pageObjects.ReservationPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)


public class Login2Test
{
WebDriver driver = null;
	
	@Before
	public void openPage()
	{
		driver = Init.getDriver();
	}
	
    @Ignore
	@Test
	public void login()
	{
		LoginPage loginPage = new LoginPage();
		loginPage.goToLoginPage();
		loginPage.loginAs("gm@op.pl", "zaq123");
	}
	
	@Test
	public void reservatin() 
	{
		LoginPage loginPage = new LoginPage();
		loginPage.goToLoginPage();
		loginPage.loginAs("gm@op.pl", "zaq123");
		
		ReservationPage reservationPage = new ReservationPage();
		reservationPage.roundTripRadioClick();
		Init.sleep(1);
		reservationPage.passCountSelect("2");
		Init.sleep(1);
		reservationPage.fromPortSelect("Frankfurt");
		Init.sleep(1);
		reservationPage.fromMonthSelect("4");
		reservationPage.fromDaySelect("21");
		reservationPage.toPortSelect("London");
		reservationPage.toMonthSelect("4");
		reservationPage.toDaySelect("25");
		reservationPage.businessRadioClick();
		reservationPage.airlineSelect("Blue Skies Airlines");
		Init.sleep(2);
		reservationPage.findFlightClick();
		//-----------------------------------
		
		Reservation2Page reservation2Page = new Reservation2Page();
		reservation2Page.departRadioClick();
		reservation2Page.returnRadioClick();
		Init.sleep(3);
		reservation2Page.reserveClick();
		//-----------------------------------
		
		reservation2Page.pass0("Marek", "Jarek", "Hindu");
		Init.sleep(2);
		reservation2Page.pass1("Jarek", "Jarek", "Hindu");
		Init.sleep(2);
		reservation2Page.creditCard("MasterCard");
		reservation2Page.numberCard("867875433");
		Init.sleep(2);
		reservation2Page.secPurchesClick();
		
	}	
	
	@After
	public void close ()
	{
		Init.sleep(3);
		Init.endTest();
	}
}
