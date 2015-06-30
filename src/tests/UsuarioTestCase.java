package tests;
import static org.junit.Assert.*;

import org.junit.Test;




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

}
