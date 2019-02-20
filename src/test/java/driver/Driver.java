package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import enumeradores.Navegadores;

public class Driver {

	static WebDriver driver;

	public static WebDriver getDriver(Navegadores navegador) {
		if (driver == null) {
			definirTipoNavegador(navegador);
		}
		return driver;
	}

	public static void definirTipoNavegador(Navegadores navegador) {
		if (Navegadores.CHROME == navegador) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (Navegadores.EXPLORER == navegador) {
			System.setProperty("webdriver.explorer.driver", "src/test/resources/drivers/explorer.exe");
			driver = new EdgeDriver();
		} else if (Navegadores.FIREFOX == navegador) {
			System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}

	}

	public static void matarDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
