package dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "professores")
public class Professor extends Pessoa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6973898656439572586L;
	@Column(name="Formacao")
	private String formacao;
	
	
	public Professor(){}
	
	public Professor(String nome, String nomeSocial, int cep, String logradouro, String formacao, int etnia_id, int sexo_id, int religiao_id){
		
		super(nome, nomeSocial,  cep, logradouro,  etnia_id,  sexo_id,  religiao_id);
		this.formacao = formacao;
		
	}
	

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

}
