package dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "alunos")
public class Aluno extends Pessoa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 165214148039913493L;
	
	@Column(name="F_pagamento")
	private String fpagamento;

	
	public Aluno(){}

	public Aluno(String nome, String nomeSocial, int cep, String logradouro, String fpagamento, int etnia_id, int sexo_id, int religiao_id){
		
		super(nome, nomeSocial,  cep, logradouro,  etnia_id,  sexo_id,  religiao_id);
		this.fpagamento = fpagamento;
		
	}

	
	
	
	public String getFpagamento() {
		return fpagamento;
	}

	public void setFpagamento(String fpagamento) {
		this.fpagamento = fpagamento;
	}


	
	
	
}
