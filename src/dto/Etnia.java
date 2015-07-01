package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name="etnias")
public class Etnia {
	
	@Id
	@Column(name="Id_etnia")
	private int id;
	
	@Column(name="Descricao")
	private String descricao;
	
	public Etnia(){}
	
	public Etnia(int id){
		this.id = id;
	}
	
	public Etnia(String descricao){
		this.descricao = descricao;
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
	
}
