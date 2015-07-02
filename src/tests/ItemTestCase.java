package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import bo.GerenciadorItem;


public class ItemTestCase {

	@Test
	public void saveItemSuccess() {
		try {
			bo.GerenciadorItem.salvar("trans", 23);
		} 
		catch (Exception e) {
			fail("ERRO SALVAR Item: " + e.getMessage());
		}
	}
	
	@Test(expected=Exception.class)
	public void saveItemFail() throws Exception{
		GerenciadorItem.salvar("", 0);
	}
	
	
	@Test
	public void GetAllItemSuccess() throws Exception {
		GerenciadorItem.listar();
	}
	
	
	
	
}
