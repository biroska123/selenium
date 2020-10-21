package teste;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import pageobject.AdicionarProdutoCarrinhoPagina;
import pageobject.ConcluirCompraPagina;
import pageobject.AbrirCarrinhoPagina;
import pageobject.MenuPagina;

public abstract class ClasseBaseTeste {
		
		protected WebDriver driver;
		protected MenuPagina menuPagina;
		protected AdicionarProdutoCarrinhoPagina adicionarProdutoCarrinhoPagina;
		protected AbrirCarrinhoPagina abrirCarrinhoPagina;
		protected ConcluirCompraPagina concluirCompraPagina;
		public void iniciaAplicacao() {
			System.setProperty(ConfiguracoesTeste.NOME_DRIVER, ConfiguracoesTeste.CAMINHO_DRIVER);
			driver = new ChromeDriver();
			//driver = DriverFactory.createDriver("chrome");
			driver.get(ConfiguracoesTeste.URL);
			menuPagina = new MenuPagina(driver);
			adicionarProdutoCarrinhoPagina = new AdicionarProdutoCarrinhoPagina(driver);
			abrirCarrinhoPagina = new AbrirCarrinhoPagina(driver);
			concluirCompraPagina = new ConcluirCompraPagina(driver);
			
			driver.manage().window().maximize();
		}
}
