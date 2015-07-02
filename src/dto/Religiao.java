package dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="religiao")
public class Religiao implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8590176403385826006L;

	@Id
	@Column(name="Id_religiao")
	private int id;
	
	@Column(name="Descricao")
	private String descricao;
	
	public Religiao(){}
	
	public Religiao(int id){
		this.id = id;
	}
	
	public Religiao(String descricao){
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
