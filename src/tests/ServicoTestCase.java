package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import dto.Servico;
import bo.GerenciadorServico;


public class ServicoTestCase {

	/*
	 * Estoque é salvo comm sucesso  com um item existente no banco de dados
	 * Não foi possíel adicionar mais de um estoque para cada item, pois o SQL está limitado e não alterei por
	 * motivos de- avaliações finais do projeto.
	 */
	@Test
	public void saveEstoqueSuccess() {
		try {
			bo.GerenciadorServico.salvar("manutenção", 18, "Japao", 445); 
		} 
		catch (Exception e) {
			fail("ERRO SALVAR Estoque: " + e.getMessage());
		}
	}
	
	@Test(expected=Exception.class)
	public void saveEstoqueFail() throws Exception{
		GerenciadorServico.salvar("", 18, "Japao", 445);
	}
	
	
	@Test
	public void getAllEstoqueSuccess() throws Exception {
		GerenciadorServico.listar();
	}
	

	
	@Test
	public void updateEstoqueSuccess() {
		try {
			bo.GerenciadorServico.atualizar(new Servico(669 ,"dsdds", 200, "PRERIFGO", 16));
		} 
		catch (Exception e) {
			fail("ERRO SALVAR Estoque: " + e.getMessage());
		}
	}
	
	
	
}
