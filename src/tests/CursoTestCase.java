package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import bo.GerenciadorCurso;


public class CursoTestCase {

	@Test
	public void saveCursoSuccess() {
		try {
			bo.GerenciadorCurso.salvar("Informática");
		} 
		catch (Exception e) {
			fail("ERRO SALVAR Curso: " + e.getMessage());
		}
	}
	
	@Test(expected=Exception.class)
	public void saveCursoFail() throws Exception{
		GerenciadorCurso.salvar("");
	}
	
	
	@Test
	public void GetAllCursoSuccess() throws Exception {
		GerenciadorCurso.listar();
	}
	
	
	
	
}
