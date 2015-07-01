package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

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

	
	
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Id_etnia", referencedColumnName="Id_etnia")
	private Etnia etnia;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Id_sexo", referencedColumnName="Id_sexo")
	private Sexo sexo;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Id_religiao", referencedColumnName="Id_religiao")
	private Religiao religiao;
	
	
	
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "defic_pessoas", joinColumns = { @JoinColumn(name = "Id_pessoa") }, 
			inverseJoinColumns = { @JoinColumn(name = "Id_deficencia") })
	private List<Deficiencia> deficiencias = new ArrayList<Deficiencia>() ;
	
	/*
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "defic_pessoas", catalog = "interdisciplinar", joinColumns = { @JoinColumn(name = "Id_pessoa", nullable = true, updatable = true) }, 
			inverseJoinColumns = { @JoinColumn(name = "Id_deficencia", 
					nullable = true, updatable = true) })
	public Set<Deficiencia> getDeficiencias() {
		return this.deficiencias;
	}*/
	
	
	
	
	
	public Pessoa(){}
	public Pessoa(String nome, String nomSocial, int cep, String logradouro, int etnia_id, int sexo_id, int religiao_id){
		this.nome = nome;
		this.nomeSocial = nomSocial;
		this.logradouro = logradouro;
		this.cep = cep;
		
		this.etnia		= new Etnia(etnia_id);
		this.sexo		= new Sexo(sexo_id);
		this.religiao	= new Religiao(religiao_id);
		
		
		//List<Deficiencia> ld = new ArrayList<Deficiencia>();
		
		//ld.add(new Deficiencia(8371116));
		//this.deficiencias = ld;
		//this.deficiencias.add(new Deficiencia(8371116));
		//this.deficiencias.add(new Deficiencia(675577231));
		
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
