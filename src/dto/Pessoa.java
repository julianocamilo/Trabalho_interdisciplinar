package dto;

public class Pessoa {
	
	private int id;
	private int cep;
	private String logradouro;
	private String nomeSocial;
	private String nome;
	
	protected int etnia_id;
	protected int religiao_id;
	protected int sexo_id;
	
	
	
	//LazyLoads
	public Sexo getSexo(){
		return null;
	}
	
	public Religiao getReligiao(){
		return null;
	}
	
	public Etnia getEtnia(){
		return null;
	}
	
	
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
