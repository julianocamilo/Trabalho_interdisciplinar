package dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
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
	
	@OneToMany(mappedBy = "pk.item", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	private Set<ItemVenda> itemvendas = new HashSet<ItemVenda>();
	
	@Transient
	private int quantidadeSolicitada;
	
	public int getQuantidadeSolicitada() {
		return quantidadeSolicitada;
	}
	public void setQuantidadeSolicitada(int quantidadeSolicitada) {
		this.quantidadeSolicitada = quantidadeSolicitada;
	}
	public Set<ItemVenda> getItemvendas() {
		return itemvendas;
	}
	public void setItemvendas(Set<ItemVenda> itemvendas) {
		this.itemvendas = itemvendas;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Item(){}
	public Item(int id){
		this.id = id;
	}
	
	public Item(String descricao, double valor){
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public Item(int id, String descricao, double valor){
		this.id = id;
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
