package Pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	
	private final By elementFullUserNameXpath = By.xpath("//span[normalize-space()='BRUNO NASCIMENTO DE FIGUEIREDO']");
	
	private final WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void validaNomeUsuario(String nomeDeUsuario) {
		WebElement elementFullUserName = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(elementFullUserNameXpath));
		String fullName = elementFullUserName.getText();
		Assert.assertTrue(fullName.equals(nomeDeUsuario));
	}

}
