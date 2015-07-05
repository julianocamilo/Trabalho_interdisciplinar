package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import dto.Item;
import bo.GerenciadorItem;


public class ItemTestCase {

	@Test
	public void saveItemSuccess() {
		try {
			bo.GerenciadorItem.salvar("lol", 666);
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
	
	@Test
	public void GetOneItemSuccess() throws Exception {
		Item item = GerenciadorItem.selecionar(1199633220);
		System.out.println("QUantidade" + item.getDescricao());
		
	}
	
	
	
	
}
