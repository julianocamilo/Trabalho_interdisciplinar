package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import bo.GerenciadorEtnia;


public class EtniaTestCase {

	@Test
	public void saveEtniaSuccess() {
		try {
			bo.GerenciadorEtnia.salvar("seila");
		} 
		catch (Exception e) {
			fail("ERRO SALVAR Etnia: " + e.getMessage());
		}
	}
	
	@Test(expected=Exception.class)
	public void saveEtniaFail() throws Exception{
		GerenciadorEtnia.salvar("");
	}
	
	
	@Test
	public void GetAllEtniaSuccess() throws Exception {
		GerenciadorEtnia.listar();
	}
	
	
	
	
}
