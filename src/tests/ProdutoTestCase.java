package tests;

import static org.junit.Assert.*;
import helper.RandomHelper;

import org.junit.Test;

import dto.Produto;
import bo.GerenciadorProduto;


public class ProdutoTestCase {

	/*
	 * Estoque � salvo comm sucesso  com um item existente no banco de dados
	 * N�o foi poss�el adicionar mais de um estoque para cada item, pois o SQL est� limitado e n�o alterei por
	 * motivos de- avalia��es finais do projeto.
	 */
	@Test
	public void saveEstoqueSuccess() {
		try {
			bo.GerenciadorProduto.salvar("chupeta", 18, 445, "Japao"); 
		} 
		catch (Exception e) {
			fail("ERRO SALVAR Estoque: " + e.getMessage());
		}
	}
	
	@Test(expected=Exception.class)
	public void saveEstoqueFail() throws Exception{
		GerenciadorProduto.salvar("", 18, 445, "Japao");
	}
	
	
	@Test
	public void getAllEstoqueSuccess() throws Exception {
		GerenciadorProduto.listar();
	}
	
	@Test
	public void getAvailableEstoqueSuccess() throws Exception {
		GerenciadorProduto.listarDisponiveis();
	}
	
	@Test
	public void updateEstoqueSuccess() {
		try {
			bo.GerenciadorProduto.atualizar(new Produto(666 ,"dsdds", 200, 16, "PRERIFGO"));
		} 
		catch (Exception e) {
			fail("ERRO SALVAR Estoque: " + e.getMessage());
		}
	}
	
	
	
}
