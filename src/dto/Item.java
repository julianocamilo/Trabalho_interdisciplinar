package dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="item")
public class Item implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4654108872940250288L;

	@Id
	@Column(name="Id_item")
	private int id;
	
	@Column(name="Descricao")
	private String descricao;
	
	
	@Column(name="Valor")	
	private double valor;
	
	public Item(){}
	public Item(String descricao, double valor){
		this.descricao = descricao;
		this.valor = valor;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
		
	
}
