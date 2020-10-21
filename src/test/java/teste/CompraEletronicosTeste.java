package teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CompraEletronicosTeste extends ClasseBaseTeste{
	
	
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
//		compraEletronicosPagina.clicarBotaoCarrinho();
//		compraEletronicosPagina.linkCarrinho();
//		compraEletronicosPagina.botaoCheckout();
//		compraEletronicosPagina.esperaRadio();
//		compraEletronicosPagina.radio();
//		compraEletronicosPagina.botaoContinuar();
//		compraEletronicosPagina.preencherBillingDetails();
//		
	}
	
}
