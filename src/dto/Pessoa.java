package dto;

import java.io.Serializable;










import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


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

	
	/*
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private Etnia etnia;
	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private Religiao religiao;
	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private Sexo sexo;
	*/
	/*
	
	@Id
	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name="property", value="etnias"))
	@GeneratedValue(generator = "generator")
	@Column(name = "Id_etnia")
	protected int etnia_id;
	
	@Id
	@GenericGenerator(name = "generator2", strategy = "foreign", parameters = @Parameter(name="property", value="religiao"))
	@GeneratedValue(generator = "generator2")
	@Column(name = "Id_religiao")
	protected int religiao_id;
	
	@Id
	@GenericGenerator(name = "generator3", strategy = "foreign", parameters = @Parameter(name="property", value="sexo"))
	@GeneratedValue(generator = "generator3")
	@Column(name = "Id_sexo")
	protected int sexo_id;*/
	
	
	@ManyToOne
	@JoinColumn(name="Id_etnia", referencedColumnName="Id_etnia")
	private Etnia etnia;
	
	@ManyToOne
	@JoinColumn(name="Id_sexo", referencedColumnName="Id_sexo")
	private Sexo sexo;
	
	@ManyToOne
	@JoinColumn(name="Id_religiao", referencedColumnName="Id_religiao")
	private Religiao religiao;
	
	
	public Pessoa(){}
	public Pessoa(String nome, String nomSocial, int cep, String logradouro, int etnia_id, int sexo_id, int religiao_id){
		this.nome = nome;
		this.nomeSocial = nomSocial;
		this.logradouro = logradouro;
		this.cep = cep;
		
		this.etnia.setId(etnia_id);
		this.sexo.setId(sexo_id);
		this.religiao.setId(religiao_id);
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
