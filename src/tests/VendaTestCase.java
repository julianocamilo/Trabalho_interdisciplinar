package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import dto.Item;
import bo.GerenciadorVenda;


public class VendaTestCase {

	@Test
	public void saveVendaSuccess() {
		try {
			ArrayList<Item> itens = new ArrayList<Item>();
			
			Item item1 = new Item(243873596, "chupeta", 18);
			Item item2 = new Item(1199633220, "lol", 666);
			
			item1.setQuantidadeSolicitada(500);
			item2.setQuantidadeSolicitada(80);
			
			itens.add(item1);
			itens.add(item2);
			
			bo.GerenciadorVenda.salvar(new Date(), 45, 1,  itens);
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
