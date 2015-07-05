package dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipo")
	private Set<Filiacao> filiacoes = new HashSet<Filiacao>();
	
	public TipoFiliacao(){}
	public TipoFiliacao(int id){
		this.id = id;
	}
	
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
