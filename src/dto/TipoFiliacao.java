package dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tipo_filiacao")
public class TipoFiliacao implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8235607019040736465L;
	
	@Id
	@Column(name="Id_tipo")
	private int id;
	
	@Column(name="Descricao")
	private String descricao;
	
	public TipoFiliacao(){}
	public TipoFiliacao(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
