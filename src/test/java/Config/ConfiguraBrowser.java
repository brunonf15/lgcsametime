package Config;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ConfiguraBrowser {

	public static WebDriver driver;

	public static WebDriver iniciaBrowser(String nomeBrowser) {
		
		WebDriverManager.chromedriver().setup();

		//String nomeBrowser = "edge";
		switch (nomeBrowser) {
		case "chrome":
			//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			//System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "edge":
			//System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			throw new IllegalArgumentException("browser nao suportado");

		}

		return driver;
	}

	public static void fechaBrowser(WebDriver driver) {
		if (driver != null) {
			driver.quit();
		}

	}

}
