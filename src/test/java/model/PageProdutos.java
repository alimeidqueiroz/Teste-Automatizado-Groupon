package model;

import org.openqa.selenium.By;

public class PageProdutos {
	
	private By produto = By.xpath("//img[@alt='Escolha 1 Entre 4 Opções de Pratos para 2 pessoas']");
	private By comprarProduto = By.xpath("//*[@id=\"compre\"]");
	
	public By getProduto() {
		return produto;
	}
	
	
	public By getComprarProduto() {
		return comprarProduto;
	}
}
