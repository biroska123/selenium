package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPagina extends ClasseBasePageObject{

	@FindBy (xpath = "//*[@id=\"menu\"]/div[2]/ul/li[6]/a")
	private WebElement botaoPhonesEPDAs;
	
	public MenuPagina(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void acionarBotao() {
		botaoPhonesEPDAs.click();
	}
}
