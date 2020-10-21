package pageobject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


import massateste.MassaTeste;

public class CompraEletronicosPagina extends ClasseBasePageObject {

	@FindBy(xpath = "//*/div[@class='btn-group btn-block']") 
	private WebElement botaoCarrinho;
	
	@FindBy(xpath = "//*/a[contains(@href,'?route=checkout/cart')]/strong")
	private WebElement linkCarrinho;
	
	@FindBy (xpath = "//*/div[@class='pull-right']/a")
	private WebElement botaoCheckout;
	
	@FindBy (xpath = "//*[@id=\"collapse-checkout-option\"]/div/div/div[1]/div[2]/label/input")
	private WebElement radioCheckoutsOptions;
	
	@FindBy (id = "button-account")
	private WebElement botaoContinue;
	
	@FindBy (name = "firstname")
	private WebElement campoNome;
	
	@FindBy (name = "lastname")
	private WebElement campoSobrenome;
	
	@FindBy (name = "email")
	private WebElement campoEmail;
	
	@FindBy (name = "telephone")
	private WebElement campoTelefone;
	
	@FindBy (name = "company")
	private WebElement campoEmpresa;
	
	@FindBy (name = "address_1")
	private WebElement campoEndereco1;
	
	@FindBy (name = "address_2")
	private WebElement campoEndereco2;
	
	@FindBy (name = "city")
	private WebElement campoCidade;
	
	@FindBy (name = "postcode")
	private WebElement campoCodigo;
	
	@FindBy (xpath = "button-guest")
	private WebElement botaoContinue2;
	
	public CompraEletronicosPagina(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clicarBotaoCarrinho() {
		botaoCarrinho.click();
	}
	public void linkCarrinho() {
		linkCarrinho.click();
	}
	public void botaoCheckout() {
		botaoCheckout.click();
	}
	public void radio() {
		radioCheckoutsOptions.click();
	}
	public void esperaRadio() {
		esperas();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*/div[@class='radio']/label/input")));		
	}
	public void botaoContinuar() { 
		botaoContinue.click();
	}
	public void preencherBillingDetails() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*/div[@class='col-sm-6']/fieldset")));	
		campoNome.sendKeys(MassaTeste.NOME);
		campoSobrenome.sendKeys(MassaTeste.SOBRENOME);
		//Scroll();
		//js.executeScript("arguments[0].scrollIntoView(true);", campoEmail);		
		campoEmail.sendKeys(MassaTeste.EMAIL);
		campoTelefone.sendKeys(MassaTeste.TELEFONE);
		campoEmpresa.sendKeys(MassaTeste.EMPRESA);
		campoEndereco1.sendKeys(MassaTeste.ENDERECO1);
		campoEndereco2.sendKeys(MassaTeste.ENDERECO2);
		campoCidade.sendKeys(MassaTeste.CIDADE);
		//campoCodigo.sendKeys(MassaTeste.CODIGOPOSTAL);
	}
}
