package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


import massateste.Mensagens;

public class AdicionarProdutoCarrinhoPagina extends ClasseBasePageObject{

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[2]/button[1]")
	private WebElement botaoCarrinho;
	
	public AdicionarProdutoCarrinhoPagina(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void adicionandoProduto() {
		botaoCarrinho.click();
	}
	public void esperaAdicionarCarrinho() {
		esperas();	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*/div[@class='alert alert-success alert-dismissible']/i")));
	}
		
	public boolean verificandoAdicao() {
	return (driver.getPageSource().contains(Mensagens.MENSAGEM_SUCESSO_ADICAOCARRINHO));
	}
}

