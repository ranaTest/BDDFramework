package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination {

	WebDriver driver;

	@Given("^user is on login page$")
	public void user_is_on_login_page(){
		System.setProperty("webdriver.geckodriver.driver", "D:/ranaCucumber/freecrmCucumber/Resource/geckodriver.exe");
	//	System.setProperty("webdriver.chrome.driver", "/ranaCucumber/freecrmCucumber/Resource/chromedriver.exe");
		//System.setProperty("webdriver.chrom.driver", "/ranaCucumber/freecrmCucumber/Resource/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://outlook.live.com/");

	}

	@When("^title of login page is gmail$")
	public void title_of_login_page_is_gmail(){

		String tittle = driver.getTitle();
		System.out.println(tittle);
		Assert.assertEquals("Sign in to your Microsoft account", tittle);

	}

	@Then("^user enter username and password$")
	public void user_enter_username_and_password(){

		driver.findElement(By.name("loginfmt")).sendKeys("ranathakurace@hotmail.com");
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.name("passwd")).sendKeys("kaushalk2@");

	}

	@Then("^user clicks on login page$")
	public void user_clicks_on_login_page(){

		driver.findElement(By.id("idSIButton9")).click();

	}

	@Then("^user is on home page$")
	public void user_is_on_home_page(){
		System.out.println("hi");
	}

}
