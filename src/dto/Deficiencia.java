package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="deficiencias")
public class Deficiencia implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7744268855775483643L;

	@Id
	@Column(name="Id_deficencia")
	private int id;
	
	@Column(name="Descricao")
	private String descricao;
	
	@Column(name="Grau")
	private int grau;
	
	@ManyToMany(mappedBy="defis")
    private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	/*@OneToMany(mappedBy = "deficiencia")
	private List<DeficienciaPessoa> deficienciasteste = new ArrayList<DeficienciaPessoa>();*/
	
	
	//@ManyToMany(fetch = FetchType.LAZY, mappedBy = "defis")
	public List<Pessoa> getPessoas() {
		return this.pessoas;
	}
	
	
	public Deficiencia(){}
	
	public Deficiencia(int id){
		this.id = id;
	}
	
	public Deficiencia(String descricao, int grau){
		this.descricao = descricao;
		this.grau = grau;
		
	}
	
	public Deficiencia(int id, String descricao, int grau){
		this.id = id;
		this.descricao = descricao;
	//	this.grau = grau;
		
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
	public int getGrau() {
		return grau;
	}
	public void setGrau(int grau) {
		this.grau = grau;
	}
	
	
}
