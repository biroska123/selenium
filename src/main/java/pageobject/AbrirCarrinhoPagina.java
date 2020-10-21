package pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AbrirCarrinhoPagina extends ClasseBasePageObject {

	@FindBy(xpath = "//*/div[@class='btn-group btn-block']") 
	private WebElement botaoCarrinho;
	
	@FindBy(xpath = "//*/a[contains(@href,'?route=checkout/cart')]/strong")
	private WebElement linkCarrinho;
	
	@FindBy (xpath = "//*/div[@class='pull-right']/a")
	private WebElement botaoCheckout;
	
	
	public AbrirCarrinhoPagina(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void esperaBotaoCarrinho() {
		esperas();
		wait.until(ExpectedConditions.elementToBeClickable(botaoCarrinho));
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
}
