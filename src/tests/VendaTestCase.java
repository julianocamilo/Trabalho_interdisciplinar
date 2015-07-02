package tests;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import bo.GerenciadorVenda;


public class VendaTestCase {

	@Test
	public void saveVendaSuccess() {
		try {
			bo.GerenciadorVenda.salvar(new Date(), 45, 1,  null);
		} 
		catch (Exception e) {
			fail("ERRO SALVAR Venda: " + e.getMessage());
		}
	}
	
	/*@Test(expected=Exception.class)
	public void saveVendaFail() throws Exception{
		GerenciadorVenda.salvar(new Date(), 76, 1, null);
	}*/
	
	
	
	
	@Test
	public void GetAllVendaSuccess() throws Exception {
		GerenciadorVenda.listar();
	}
	
	
	
	
}
