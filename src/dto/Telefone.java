package dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="telefones")
public class Telefone implements Serializable{
	
	private static final long serialVersionUID = 6991375454214887838L;

	@Id
	@Column(name="Id_telefone")
	private int id;
	
	@Column(name="Telefones")
	private String telefone;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Id_pessoa", referencedColumnName="Id_pessoa")
	private Pessoa pessoa;
	
	
	public Telefone(){}
	public Telefone(String telefone, int pessoa_id){
		this.telefone = telefone;
		this.pessoa = new Pessoa(pessoa_id);
	}
	
	//LazyLoad
	public Pessoa getPessoa(){
		return null;
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	
	
	
	
}
