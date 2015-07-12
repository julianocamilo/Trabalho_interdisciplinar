package tests;

import static org.junit.Assert.*;
import helper.RandomHelper;

import org.junit.Test;

import dto.Produto;
import bo.GerenciadorProduto;


public class ProdutoTestCase {

	/*
	 * Produto é salvo comm sucesso  com um item existente no banco de dados
	 * Não foi possíel adicionar mais de um Produto para cada item, pois o SQL está limitado e não alterei por
	 * motivos de- avaliações finais do projeto.
	 */
	@Test
	public void saveProdutoSuccess() {
		try {
			bo.GerenciadorProduto.salvar("chupeta", 18, 445, "Japao"); 
		} 
		catch (Exception e) {
			fail("ERRO SALVAR Produto: " + e.getMessage());
		}
	}
	
	@Test(expected=Exception.class)
	public void saveProdutoFail() throws Exception{
		GerenciadorProduto.salvar("", 18, 445, "Japao");
	}
	
	
	@Test
	public void getAllProdutoSuccess() throws Exception {
		GerenciadorProduto.listar();
	}
	
	@Test
	public void getAvailableProdutoSuccess() throws Exception {
		GerenciadorProduto.listarDisponiveis();
	}
	
	@Test
	public void updateProdutoSuccess() {
		try {
			bo.GerenciadorProduto.atualizar(new Produto(666 ,"dsdds", 200, 16, "PRERIFGO"));
		} 
		catch (Exception e) {
			fail("ERRO SALVAR Produto: " + e.getMessage());
		}
	}
	
	
	@Test
	public void getOneProdutoSuccess() throws Exception {
		GerenciadorProduto.selecionar(666);
	}
	
	
	
}
