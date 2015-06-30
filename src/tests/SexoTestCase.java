package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import bo.GerenciadorSexo;


public class SexoTestCase {

	@Test
	public void saveSexoSuccess() {
		try {
			bo.GerenciadorSexo.salvar("trans");
		} 
		catch (Exception e) {
			fail("ERRO SALVAR SEXO: " + e.getMessage());
		}
	}
	
	@Test(expected=Exception.class)
	public void saveSexoFail() throws Exception{
		GerenciadorSexo.salvar("");
	}
	
	
	@Test
	public void GetAllSexoSuccess() throws Exception {
		GerenciadorSexo.listar();
	}
	
	
	
	
}
