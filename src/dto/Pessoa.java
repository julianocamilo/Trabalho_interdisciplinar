package dto;

import helper.RandomHelper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="pessoas")
public class Pessoa implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 322317077739507674L;

	@Id
	@Column(name="Id_pessoa")
	protected int id;
	
	@Column(name="CEP")
	protected int cep;
	
	@Column(name="Logradouro")
	protected String logradouro;

	@Column(name="Nome_social")
	protected String nomeSocial;

	
	/*@OneToMany(fetch=FetchType.LAZY, mappedBy="pessoas")
	@Transient
	HashSet<Telefone> telefones = new HashSet<Telefone>();
	
	//@OneToMany(mappedBy="pessoas")
	public HashSet<Telefone> getTelefones(){
		return this.telefones;
	}
	*/
	
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Id_etnia", referencedColumnName="Id_etnia")
	private Etnia etnia;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Id_sexo", referencedColumnName="Id_sexo")
	private Sexo sexo;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Id_religiao", referencedColumnName="Id_religiao")
	private Religiao religiao;
	
	
	
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "defic_pessoas", joinColumns = { @JoinColumn(name = "Id_pessoa") }, 
			inverseJoinColumns = { @JoinColumn(name = "Id_deficencia") })
	private Set<Deficiencia> defis = new HashSet<Deficiencia>() ;
	
	/*
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "defic_pessoas", catalog = "interdisciplinar", joinColumns = { @JoinColumn(name = "Id_pessoa", nullable = true, updatable = true) }, 
			inverseJoinColumns = { @JoinColumn(name = "Id_deficencia", 
					nullable = true, updatable = true) })
	public Set<Deficiencia> getDeficiencias() {
		return this.deficiencias;
	}*/
	
	/* @OneToMany(mappedBy = "pessoa")
	 private List<DeficienciaPessoa> deficienciasteste = new ArrayList<DeficienciaPessoa>();*/
	
	
	
	public Pessoa(){}
	
	public Pessoa(int id){
		this.id =id;
	}
	
	public Pessoa(String nome, String nomSocial, int cep, String logradouro, int etnia_id, int sexo_id, int religiao_id, ArrayList<Integer> deficiencias){
		this.nome = nome;
		this.nomeSocial = nomSocial;
		this.logradouro = logradouro;
		this.cep = cep;
		
		this.etnia		= new Etnia(etnia_id);
		this.sexo		= new Sexo(sexo_id);
		this.religiao	= new Religiao(religiao_id);
		
		if(deficiencias == null) return;
		
		for (Integer deficiencia_id : deficiencias) {
			this.defis.add(new Deficiencia(deficiencia_id));
		}
	}
	
	public Etnia getEtnia() {
		return etnia;
	}

	public void setEtnia(Etnia etnia) {
		this.etnia = etnia;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Religiao getReligiao() {
		return religiao;
	}

	public void setReligiao(Religiao religiao) {
		this.religiao = religiao;
	}

	public Set<Deficiencia> getDefis() {
		return defis;
	}

	public void setDefis(Set<Deficiencia> defis) {
		this.defis = defis;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column(name="Nome")
	private String nome;
	
	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pessoas", cascade = CascadeType.ALL)
	@OneToOne(mappedBy = "pessoa", cascade = CascadeType.ALL)
	private Usuario usuario;
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getCep() {
		return cep;
	}
	
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	public String getNomeSocial() {
		return nomeSocial;
	}
	
	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	
}
