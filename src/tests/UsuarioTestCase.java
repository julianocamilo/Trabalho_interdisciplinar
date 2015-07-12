package tests;
import static org.junit.Assert.*;

import org.junit.Test;

import bo.GerenciadorUsuario;




public class UsuarioTestCase {

	@Test
	public void GetUsuarioSuccess() {
		
	
		try {
			bo.GerenciadorUsuario.getUsuario("root", "root");
		} 
		catch (Exception e) {
			fail("ERRO PEGAR USUARIO: " + e.getMessage());
		}
	
		
		//assertArrayEquals(expecteds, actuals);
	}
	
	
	
	@Test
	public void GetUsuarioFail() throws Exception {
		
		assertEquals(null, bo.GerenciadorUsuario.getUsuario("null", "null"));
	}
	
	
	@Test
	public void SaveUsuario() throws Exception {
		
		GerenciadorUsuario.salvar("rootao", "rootg", 6725675);
	}
	

}
