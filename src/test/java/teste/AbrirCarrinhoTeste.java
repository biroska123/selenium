package teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AbrirCarrinhoTeste extends ClasseBaseTeste{
	@Before
	public void antesDoTeste() {
		iniciaAplicacao();
	}
	
	@Test
	public void duranteOTeste() throws InterruptedException {
		menuPagina.acionarBotao();
		adicionarProdutoCarrinhoPagina.adicionandoProduto();
		adicionarProdutoCarrinhoPagina.esperaAdicionarCarrinho();
		Assert.assertTrue(adicionarProdutoCarrinhoPagina.verificandoAdicao());	
		abrirCarrinhoPagina.esperaBotaoCarrinho();
		abrirCarrinhoPagina.clicarBotaoCarrinho();
		abrirCarrinhoPagina.linkCarrinho();
		abrirCarrinhoPagina.botaoCheckout();
	}
	
}
