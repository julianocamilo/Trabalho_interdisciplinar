package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import bo.GerenciadorDeficiencia;


public class DeficienciaTestCase {

	@Test
	public void saveDeficienciaSuccess() {
		try {
			bo.GerenciadorDeficiencia.salvar("quinze", 10);
		} 
		catch (Exception e) {
			fail("ERRO SALVAR Deficiencia: " + e.getMessage());
		}
	}
	
	@Test(expected=Exception.class)
	public void saveDeficienciaFail() throws Exception{
		GerenciadorDeficiencia.salvar("", 0);
	}
	
	
	@Test
	public void GetAllDeficienciaSuccess() throws Exception {
		GerenciadorDeficiencia.listar();
	}
	
	
	
	
}
