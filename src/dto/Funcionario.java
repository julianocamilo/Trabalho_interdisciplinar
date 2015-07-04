package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "funcionarios")
public class Funcionario extends Pessoa implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6781236811990652271L;

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Column(name="Dt_admissao")
	private Date data_admissao;
	
	@Column(name="Cargo")
	private String cargo;
	
	public Funcionario(){}
	
	public Funcionario(String nome, String nomeSocial, int cep, String logradouro, Date data_admissao,String cargo, int etnia_id, int sexo_id, int religiao_id, ArrayList<Integer> deficiencias){
		
		super(nome, nomeSocial,  cep, logradouro,  etnia_id,  sexo_id,  religiao_id, deficiencias);
		this.data_admissao = data_admissao;
		this.cargo = cargo;
		
	}
	

	public Date getData_admissao() {
		return data_admissao;
	}

	public void setData_admissao(Date data_admissao) {
		this.data_admissao = data_admissao;
	}
	
	
	
}
