package test;

import org.junit.Test;

import basepage.InteracoesComApagina;
import driver.Driver;
import enumeradores.Navegadores;
import model.PageHome;
import model.PageProdutos;
import model.PaginaDeLogin;

public class Teste {
	PaginaDeLogin paginaDeLogin = new PaginaDeLogin();
	InteracoesComApagina interacoesComApagina = new InteracoesComApagina(Driver.getDriver(Navegadores.CHROME));
	//PaginaDePesquisaTrivago paginaDePesquisaTrivago = new PaginaDePesquisaTrivago();
	PageHome home = new PageHome();
	PageProdutos produto = new PageProdutos();

//	@org.junit.Test
//	public void metodoUm() throws InterruptedException {
//		interacoesComApagina.navegar("https://www.trivago.com.br/");
//		Thread.sleep(3000);
//		interacoesComApagina.clicar(paginaDePesquisaTrivago.getBotaoFazerLogin());
//		interacoesComApagina.escrever(paginaDeLogin.getEnderecoDeEmail(), "pauloqualquercoisa@gmail.com");
//		interacoesComApagina.escrever(paginaDeLogin.getCampoDeSenha(), "12345678");
//
//	}
	
	@Test
	public void testeDoGroupon() throws InterruptedException{
		interacoesComApagina.navegar("http://www.groupon.com.br");
		interacoesComApagina.navegar("https://www.groupon.com.br/login");
		interacoesComApagina.escrever(paginaDeLogin.getEnderecoDeEmail(), "almeidaq.line@gmail.com");
		interacoesComApagina.escrever(paginaDeLogin.getCampoDeSenha(), "Al1ne@brq");
		interacoesComApagina.clicar(paginaDeLogin.getBotaoEntrar());
		interacoesComApagina.escrever(home.getTxtPesquisa(), "Alphaville");
		interacoesComApagina.clicar(home.getButtonPesquisa());
		interacoesComApagina.clicar(home.getButtonPesquisa());
		interacoesComApagina.clicar(produto.getProduto());	
		interacoesComApagina.clicar(produto.getComprarProduto());
		
		
	}
}
