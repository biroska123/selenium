package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


import massateste.MassaTeste;
import massateste.Mensagens;

public class ConcluirCompraPagina extends ClasseBasePageObject {

	@FindBy (xpath = "//*[@id=\"collapse-checkout-option\"]/div/div/div[1]/div[1]/label/input")
	private WebElement checkoutOptionsRadio;
	
	@FindBy (id = "button-account")
	private WebElement botaoContinueCheckouOptions;
	
	@FindBy (name = "firstname")
	private WebElement campoNome;
	
	@FindBy (name = "lastname")
	private WebElement campoSobrenome;
	
	@FindBy (id = "input-payment-email")
	private WebElement campoEmail;
	
	@FindBy (id = "input-payment-telephone")
	private WebElement campoTelefone;
	
	@FindBy (id = "input-payment-password")
	private WebElement campoSenha;
	
	@FindBy (id = "input-payment-confirm")
	private WebElement campoConfirmarSenha;
	
	@FindBy (id = "input-payment-company")
	private WebElement campoEmpresa;
	
	@FindBy (id = "input-payment-address-1")
	private WebElement campoEndereco1;
	
	@FindBy (id = "input-payment-address-2")
	private WebElement campoEndereco2;
	
	@FindBy (id = "input-payment-city")
	private WebElement campoCidade;
	
	@FindBy (id = "input-payment-postcode")
	private WebElement campoCodigoPostal;
	
	@FindBy (id = "newsletter")
	private WebElement checkBoxNewsletter;
	
	@FindBy (id = "input-payment-country")
	private WebElement comboPais;
	
	@FindBy (id = "input-payment-zone")
	private WebElement comboEstado;
	
	@FindBy (xpath = "//*/div[@class='pull-right']/input")
	private WebElement checkBoxTermos;
	
	@FindBy (id = "button-register")
	private WebElement botaoContinuePersonalDetails;
	
	@FindBy (id = "button-shipping-address")
	private WebElement botaoContinueDeliveryDetails;
	
	@FindBy (id = "button-shipping-method")
	private WebElement botaoContinueDeliveryMethod;
	
	@FindBy (xpath = "//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]")
	private WebElement checkBoxTermos2;
	
	@FindBy (id = "button-payment-method")
	private WebElement botaoContinuePaymentMethod;
	
	@FindBy (id = "button-confirm")
	private WebElement botaoContinueConfirmOrder;
	
	public ConcluirCompraPagina(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void esperaCheckoutOptions() {
		esperas();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"collapse-checkout-option\"]/div/div/div[1]/p[1]")));
	}
	
	public void checkout() throws InterruptedException  {
		checkoutOptionsRadio.click();
		botaoContinueCheckouOptions.click();
		esperas();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*/div[@class='col-sm-6']/fieldset")));
		campoNome.sendKeys(MassaTeste.NOME);
		campoSobrenome.sendKeys(MassaTeste.SOBRENOME);
		campoEmail.sendKeys(MassaTeste.EMAIL);
		campoTelefone.sendKeys(MassaTeste.TELEFONE);
		campoSenha.sendKeys(MassaTeste.SENHA);
		campoConfirmarSenha.sendKeys(MassaTeste.SENHA);
		campoEmpresa.sendKeys(MassaTeste.EMPRESA);
		campoEndereco1.sendKeys(MassaTeste.ENDERECO1);
		campoEndereco2.sendKeys(MassaTeste.ENDERECO2);
		campoCidade.sendKeys(MassaTeste.CIDADE);
		campoCodigoPostal.sendKeys(MassaTeste.CODIGO_POSTAL);
		checkBoxNewsletter.click();
		select(comboPais);
		select.selectByVisibleText(MassaTeste.PAIS);
		Thread.sleep(1000);
		select(comboEstado);
		select.selectByVisibleText(MassaTeste.ESTADO);
		checkBoxTermos.click();
		botaoContinuePersonalDetails.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-address")));
		botaoContinueDeliveryDetails.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-method")));
		botaoContinueDeliveryMethod.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-method")));
		checkBoxTermos2.click();
		botaoContinuePaymentMethod.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("button-confirm")));
		botaoContinueConfirmOrder.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div/a")));
		Assert.assertTrue(driver.getPageSource().contains(Mensagens.MENSAGEM_SUCESSO_COMPRA));
	}
}
