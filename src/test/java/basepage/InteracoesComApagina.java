package basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InteracoesComApagina {
	
	private WebDriver driver;
	
	public InteracoesComApagina(WebDriver webDriver) {
		driver = webDriver;
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}
	
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
	
	public void navegar(String url) {
		driver.get(url);
	}
	public void mudarAba(int numero) {
		driver.switchTo().window((String) driver.getWindowHandles().toArray()[numero]);
	}
}
