package dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="servicos")
public class Servico extends Item implements Serializable {

	private static final long serialVersionUID = -8928541407985626827L;
	
	@Column(name="Especificacao")
	private String especificacao;
	
	@Column(name="Duracao")
	private int duracao;
	
	public Servico(){}
	
	public Servico(int id){
		super(id);
	}
	
	public Servico(String descricao, double valor, String especificacao, int duracao){
		super(descricao,valor);
		this.especificacao = especificacao;
		this.duracao = duracao;
	}
	
	public Servico(int id, String descricao, double valor, String especificacao, int duracao){
		super(id, descricao,valor);
		this.especificacao = especificacao;
		this.duracao = duracao;
	}
	
	public String getEspecificacao() {
		return especificacao;
	}
	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	
	
	
}
