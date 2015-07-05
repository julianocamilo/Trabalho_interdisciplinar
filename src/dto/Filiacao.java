package dto;

import java.io.Serializable;




import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="filiacao")
public class Filiacao implements Serializable {

	private static final long serialVersionUID = -3260809670151112163L;

	@Id
	@Column(name="Id_filiacao")
	private int id;
	
	@Column(name="Descricao")
	private String descricao;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Id_pessoa")
	private Pessoa pessoa;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Id_tipo")
	private TipoFiliacao tipo;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public void setTipo(TipoFiliacao tipo) {
		this.tipo = tipo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
