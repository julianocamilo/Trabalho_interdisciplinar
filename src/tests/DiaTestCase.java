package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import bo.GerenciadorDia;


public class DiaTestCase {

	@Test
	public void saveDiaSuccess() {
		try {
			bo.GerenciadorDia.salvar("Segunda-feira");
		} 
		catch (Exception e) {
			fail("ERRO SALVAR Dia: " + e.getMessage());
		}
	}
	
	@Test(expected=Exception.class)
	public void saveDiaFail() throws Exception{
		GerenciadorDia.salvar("");
	}
	
	
	@Test
	public void GetAllDiaSuccess() throws Exception {
		GerenciadorDia.listar();
	}
	
	
	
	
}
