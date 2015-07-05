package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
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
	
	public Aluno(int id){
		super(id);
	}

	public Aluno(String nome, String nomeSocial, int cep, String logradouro, String fpagamento, int etnia_id, int sexo_id, int religiao_id, ArrayList<Integer> deficiencias){
		
		super(nome, nomeSocial,  cep, logradouro,  etnia_id,  sexo_id,  religiao_id,  deficiencias);
		this.fpagamento = fpagamento;
		
	}

	@ManyToMany(mappedBy="alunos")
    private List<Turma> turmas = new ArrayList<Turma>();
	
	
	public String getFpagamento() {
		return fpagamento;
	}

	public void setFpagamento(String fpagamento) {
		this.fpagamento = fpagamento;
	}


	
	
	
}
