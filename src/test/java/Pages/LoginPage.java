package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	private final By elementAcceptAllCookiesId = By.id("onetrust-accept-btn-handler");
	private final By elementUserNameId = By.id("userName");
	private final By elementPasswordId = By.id("password");
	private final By elementSingInXpath = By.xpath("//button[normalize-space()='Sign in']");

	private final WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void AceitarCookies() {
		WebElement elementAcceptAllCookies = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(elementAcceptAllCookiesId));
		elementAcceptAllCookies.click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void DigitarEmailESenhaValido() {
		WebElement elementUserName = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(elementUserNameId));
		elementUserName.sendKeys("brunonf15@gmail.com");

		WebElement elementPassword = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(elementPasswordId));
		elementPassword.sendKeys("Qwop120-1234567");
	}

	public void DigitarEmailESenha(String email, String senha) {
		WebElement elementUserName = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(elementUserNameId));
		elementUserName.sendKeys(email);

		WebElement elementPassword = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(elementPasswordId));
		elementPassword.sendKeys(senha);
	}
	
	
	public void ClicarBotaoLogin() {
		WebElement elementSingIn = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(elementSingInXpath));
		elementSingIn.click();
	}

}
