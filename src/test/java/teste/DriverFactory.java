package teste;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public abstract class DriverFactory {

private static WebDriver driver;
private static final String DRIVER_CHROME = "chrome";
private static final String DRIVER_EDGE = "edge";
private static final String DRIVER_FIREFOX = "firefox";


public static WebDriver createDriver(String browserName) {
   
   if (browserName.equals(DRIVER_CHROME)) {
      System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
      driver = new ChromeDriver();
   } 
   
   else if (browserName.equals(DRIVER_EDGE)) {
      System.setProperty("webdriver.ie.driver", "src/test/resources/MicrosoftWebDriver.exe");
      driver = new InternetExplorerDriver();
   } 
   
   else if (browserName.equals(DRIVER_FIREFOX)) {
      System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
      driver = new FirefoxDriver();
   } 
   return driver;
   }
}
