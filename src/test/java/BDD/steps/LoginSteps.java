package BDD.steps;

import org.openqa.selenium.WebDriver;

import Config.ConfiguraBrowser;
import Pages.DashboardPage;
import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	
	@Given("I am using Selenium on {string}")
	public void i_am_using_selenium_on(String browser) {
		driver = ConfiguraBrowser.iniciaBrowser(browser);
		loginPage = new LoginPage(driver);
		dashboardPage = new DashboardPage(driver);
	    
	}
	
	
	@Given("I am at LGC login page")
	public void i_am_at_lgc_login_page() {
		driver.get("https://www.letsgetchecked.ie/account/login");
		loginPage.AceitarCookies();
	}

	@And("I insert valid data")
	public void i_insert_valid_data() {
		loginPage.DigitarEmailESenhaValido();
	}

	@When("I click to sign in button")
	public void i_click_to_sign_in_button() {
		loginPage.ClicarBotaoLogin();
	}

	@Then("I will be at dashboard")
	public void i_will_be_at_dashboard() {
		dashboardPage.validaNomeUsuario("BRUNO NASCIMENTO DE FIGUEIREDO");
	}

	@After
    public void fecharBrowser() {
        ConfiguraBrowser.fechaBrowser(driver);
    }

}
