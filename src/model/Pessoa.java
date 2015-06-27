package model;

public class Pessoa {
	private String id;
	private int cep;
	private String logrado;
	private String nomeSocial;
	private String nome;
	private Etnia etnia;
	private Sexo sexo;
	private Religiao religiao;	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public int getCep() {
		return cep;
	}
	
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	public String getLogrado() {
		return logrado;
	}
	
	public void setLogrado(String logrado) {
		this.logrado = logrado;
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
		
}
