package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import bo.GerenciadorTelefone;


public class TelefoneTestCase {

	@Test
	public void saveTelefoneSuccess() {
		try {
			bo.GerenciadorTelefone.salvar("92081993", 1);
		} 
		catch (Exception e) {
			fail("ERRO SALVAR Telefone: " + e.getMessage());
		}
	}
	
	@Test(expected=Exception.class)
	public void saveTelefoneFail() throws Exception{
		GerenciadorTelefone.salvar("", 0);
	}
	
	
	@Test
	public void GetAllTelefoneSuccess() throws Exception {
		GerenciadorTelefone.listar();
	}
	
	
	
	
}
