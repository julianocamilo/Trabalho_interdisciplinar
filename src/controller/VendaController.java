package controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dto.Item;

import java.util.List;

import bo.GerenciadorItem;
import bo.GerenciadorVenda;

@ManagedBean
@ViewScoped
public class VendaController extends ApplicationController {
	
	public class Itens {
		public String id;
		public String nome;
		public String tipo;
		public String valor;
		public String quantidade;
		public String getId() {
			return id;
		}
				
		public String getQuantidade() {
			return quantidade;
		}

		public String getNome() {
			return nome;
		}
		
		public String getTipo() {
			return tipo;
		}

		public String getValor() {
			return valor;
		}		
		
	} 
	
	private String data;
	private String valor = "0.00";
	private String id_pessoa;
	private List<Itens> itensList =  new ArrayList<Itens>();
	private String id_item;
	private String tipo; 
	private String quantidade_item;
	private String messageError;
	
	public void save() throws Exception{
		this.messageError = "";
		try {
			String message = validate(); 
			if (!message.isEmpty()) {
				throw new Exception(message);
			}			
			double valor = this.valor.isEmpty() ? 0.00 : Double.parseDouble(this.valor);
			DateFormat formatter = new SimpleDateFormat("MM/dd/yy");  
			Date date = (Date)formatter.parse(this.data);
			int id_pessoa =Integer.parseInt(this.id_pessoa);
			GerenciadorVenda.salvar(date, valor, id_pessoa, retornaItens());
		}catch(Exception ex) {						
			super.setMessage("msgError", ex.getMessage());
		}	
	}	

	public void addItem(){
		//if (this.id_item.isEmpty()) return;
		//HashMap<Object, Object> item = GerenciadorItem.retornaItem(id_item);		//
		// Usei pra teste
		HashMap<Object, Object> itemHash = new HashMap<Object, Object>();		
		itemHash.put("id", "1");
		itemHash.put("nome", "test");
		itemHash.put("valor", "2.50");		
		
		if (quantidade_item.trim().isEmpty())
			quantidade_item = "1";
			
		Itens item = new Itens();
		item.id = itemHash.get("id").toString();
		item.nome = itemHash.get("nome").toString();
		item.tipo = Integer.parseInt(this.tipo) == 0 ? "Produto" : "Serviço";
		item.quantidade = quantidade_item;
		double valorTotalItem = Integer.parseInt(quantidade_item) * Double.parseDouble(itemHash.get("valor").toString()); 
		item.valor = String.valueOf(valorTotalItem);
		itensList.add(item);
		double valorTotal = 0;
		for(int a = 0; a < itensList.size() ; a++ )
			valorTotal += Double.parseDouble(itensList.get(a).valor);		
		this.valor = String.valueOf(valorTotal);
		this.id_item = "";				
	} 	
	
	private ArrayList<Item> retornaItens() {
		ArrayList<Item> array = new ArrayList<Item>();
		for(int a = 0; a < itensList.size() ; a++ )
		{
			Item item = new Item();
			item.setValor(Double.parseDouble(itensList.get(a).valor));
			item.setQuantidadeSolicitada(Integer.parseInt(itensList.get(a).quantidade));
			array.add(item);
		}
		return array;
	}
	
	private String validate() {
		String message = "";		
		if (id_pessoa.trim().isEmpty())
			message = "Campo id pessoa é obrigatório";
		else
			if (itensList.size() == 0)
				message = "É obrigatório ter um produto na venda";
		return message;
	}

	public String getMessageError() {
		return messageError;
	}

	public void setMessageError(String messageError) {
		this.messageError = messageError;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getId_pessoa() {
		return id_pessoa;
	}

	public void setId_pessoa(String id_pessoa) {
		this.id_pessoa = id_pessoa;
	}

	public String getId_item() {
		return id_item;
	}

	public void setId_item(String id_item) {
		this.id_item = id_item;
	}

	public List<Itens> getItensList() {
		return itensList;
	}

	public void setItensList(List<Itens> itensList) {
		this.itensList = itensList;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getQuantidade_item() {
		return quantidade_item;
	}

	public void setQuantidade_item(String quantidade_item) {
		this.quantidade_item = quantidade_item;
	}
	
}
