package model;

import org.openqa.selenium.By;

public class ValidacaoCompra {

	
	private By btnEntrar = By.xpath("/html/body/div[2]/div/div/div/div/div[4]/div/div/div/div/div[2]/div[1]");

	
	public By getEnderecoDeEmail() {
		return btnEntrar;
	}
	
}
