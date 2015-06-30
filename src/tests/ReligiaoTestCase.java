package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import bo.GerenciadorReligiao;


public class ReligiaoTestCase {

	@Test
	public void saveReligiaoSuccess() {
		try {
			bo.GerenciadorReligiao.salvar("macumba");
		} 
		catch (Exception e) {
			fail("ERRO SALVAR Religiao: " + e.getMessage());
		}
	}
	
	@Test(expected=Exception.class)
	public void saveReligiaoFail() throws Exception{
		GerenciadorReligiao.salvar("");
	}
	
	
	@Test
	public void GetAllReligiaoSuccess() throws Exception {
		GerenciadorReligiao.listar();
	}
	
	
	
	
}
