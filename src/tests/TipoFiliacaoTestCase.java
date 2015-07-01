package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import bo.GerenciadorTipoFiliacao;


public class TipoFiliacaoTestCase {

	@Test
	public void saveTipoFiliacaoSuccess() {
		try {
			bo.GerenciadorTipoFiliacao.salvar("papai");
		} 
		catch (Exception e) {
			fail("ERRO SALVAR TipoFiliacao: " + e.getMessage());
		}
	}
	
	@Test(expected=Exception.class)
	public void saveTipoFiliacaoFail() throws Exception{
		GerenciadorTipoFiliacao.salvar("");
	}
	
	
	@Test
	public void GetAllTipoFiliacaoSuccess() throws Exception {
		GerenciadorTipoFiliacao.listar();
	}
	
	
	
	
}
