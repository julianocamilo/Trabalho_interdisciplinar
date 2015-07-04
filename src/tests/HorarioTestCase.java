package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import bo.GerenciadorHorario;


public class HorarioTestCase {

	/*
	 * Para funcionar o salvar, tem que ter outro nome, ee não salva outro com os mesmos
	 * dados
	 */
	@Test
	public void saveHorarioSuccess() {
		try {
			bo.GerenciadorHorario.salvar("Feliz yttrg", 1894441562);
		} 
		catch (Exception e) {
			fail("ERRO SALVAR Horario: " + e.getMessage());
		}
	}
	
	@Test(expected=Exception.class)
	public void saveHorarioFail() throws Exception{
		GerenciadorHorario.salvar("", 1894441562);
	}
	
	
	@Test
	public void GetAllHorarioSuccess() throws Exception {
		GerenciadorHorario.listar();
	}
	
	
	
	
}
