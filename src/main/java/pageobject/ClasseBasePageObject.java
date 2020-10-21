package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class ClasseBasePageObject {
	
	WebDriver driver;
	WebDriverWait wait; 
	Select select;
	
	public ClasseBasePageObject (WebDriver driver) {
		this.driver=driver;
	}
	public void esperas () {
		wait = new WebDriverWait (driver,5);
		
	}
	public void select (WebElement varivel) {
		select = new Select (varivel);
	}
	
}
