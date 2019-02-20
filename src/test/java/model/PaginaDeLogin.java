package model;

import org.openqa.selenium.By;

public class PaginaDeLogin {
	private By enderecoDeEmail = By.id("email");
	private By campoDeSenha = By.id("password");
	private By btnEntrar = By.id("btn-login");
	
	
	public By getEnderecoDeEmail() {
		return enderecoDeEmail;
	}
	public By getCampoDeSenha() {
		return campoDeSenha;
	}
	public By getBotaoEntrar() {
		return btnEntrar;
	}
	
	
}
