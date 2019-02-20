package model;

import org.openqa.selenium.By;

public class PageHome {

	private By TxtPesquisa = By.xpath("//*[@id=\"searchForm\"]/div/span/input[2]");
	private By ButtonPesquisa = By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div/div/button");

	public By getTxtPesquisa() {
		return TxtPesquisa;

	}

	public By getButtonPesquisa() {
		return ButtonPesquisa;

	}
}