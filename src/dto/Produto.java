package dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="produtos")
public class Produto extends Item implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7096926445840775785L;

	
	@Column(name="Quantidade")
	private int quantidade;
	
	@Column(name="Local")
	private String local;
	
	public Produto(){}
	
	public Produto(String descricao, double valor, int quantidade, String local){
		super(descricao, valor);
		this.quantidade = quantidade;
		this.local = local;
	}
	
	public Produto(int id, String descricao, double valor, int quantidade, String local){
		super(id, descricao, valor);
		this.quantidade = quantidade;
		this.local = local;
	}
	
	/*
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}*/
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getQuatidade() {
		return quantidade;
	}
	public void setQuatidade(int quatidade) {
		this.quantidade = quatidade;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	
}
