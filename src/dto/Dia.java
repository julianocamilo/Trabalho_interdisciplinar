package dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="dias")
public class Dia implements Serializable{

	private static final long serialVersionUID = 6036466372809289683L;

	@Id
	@Column(name="Id_dia")
	private int id;
	
	@Column(name="Descricao")
	private String descricao;
	

	public Dia(){}
	
	public Dia(String descricao){
		this.descricao = descricao;
	}
	public Dia(int id){
		this.id = id;
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
