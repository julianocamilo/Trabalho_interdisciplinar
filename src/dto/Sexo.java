package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sexo")
public class Sexo {
	
	@Id
	@Column(name="Id_sexo")
	private int id;
	
	@Column(name="Descricao")
	private String descricao;
	
	public Sexo(){}
	
	public Sexo(String descricao){
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
