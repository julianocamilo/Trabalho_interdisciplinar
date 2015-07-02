package dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name="produtos")
public class Estoque implements Serializable{

	//OneTO one Item
	//@Id
	//@Column(name="Id_item")
	//private int id;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5044748030917868563L;
	
	@Column(name="Quantidade")
	private int quantidade;
	
	@Column(name="Local")
	private String local;
	
	
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
