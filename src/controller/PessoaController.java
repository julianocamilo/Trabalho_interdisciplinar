package controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import java.util.List;

import bo.GerenciadorItem;
import bo.GerenciadorPessoa;
import bo.GerenciadorVenda;

@ManagedBean
@ViewScoped
public class PessoaController extends ApplicationController {
	
	public class Deficiencias {
		public String id;
		public String nome;
		public String getId() {
			return id;
		}

		public String getNome() {
			return nome;
		}		
		
	} 
	
	private String cep;	
	private String logrado;
	private String nome;
	private String nome_social;
	private String id_etnia;
	private String id_religiao;
	private String id_sexo;
	private String tipo;
	private String formacao;
	private String fpagamento;
	private String dt_admissao;
	private String cargo;
	
	private List<Deficiencias> itensList =  new ArrayList<Deficiencias>();
	private String id_deficiencia;
	private String messageError;
	
	public void save() throws Exception{
		this.messageError = "";
		try {
			String message = validate(); 
			if (!message.isEmpty()) {
				throw new Exception(message);
			}			
			
			int cepInt = Integer.parseInt(this.cep);
			int tipo = Integer.parseInt(this.tipo);
			int id_sexo_int = Integer.parseInt(this.id_sexo);
			int id_etnia_int = Integer.parseInt(this.id_etnia);
			int id_religiao_int = Integer.parseInt(this.id_religiao);
			DateFormat formatter = new SimpleDateFormat("MM/dd/yy");  
			Date data_admissao = (Date)formatter.parse(this.dt_admissao);
			
			switch (tipo) {
			case 0:
				GerenciadorPessoa.salvarAluno(cepInt, this.fpagamento, this.logrado, this.nome, this.nome_social, id_sexo_int, id_etnia_int, id_religiao_int, retornaIdItens(), 1);
				break;
			case 1:	
				GerenciadorPessoa.salvarFuncionario(cepInt, this.cargo, data_admissao, this.logrado, this.nome, this.nome_social, id_sexo_int, id_etnia_int, id_religiao_int, retornaIdItens(), 1);
				break;
			case 2:	
				GerenciadorPessoa.salvarProfessor(cepInt, this.formacao, this.logrado, this.nome, this.nome_social, id_sexo_int, id_etnia_int, id_religiao_int, retornaIdItens(), 1);			
			}									
		}catch(Exception ex) {						
			super.setMessage("msgError", ex.getMessage());
		}	
	}	

	public void addItem(){
		if (this.id_deficiencia.isEmpty()) return;
		//String nome = GerenciadorItem.retornaItem(id_deficiencia);
		String nome = "Teste";
		Deficiencias item = new Deficiencias();
		item.id = id_deficiencia;
		item.nome = nome;		
		itensList.add(item);
		this.id_deficiencia = "";				
	} 	
	
	private ArrayList<Integer> retornaIdItens() {
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int a = 0; a < itensList.size() ; a++ )
			array.add(Integer.parseInt(itensList.get(a).id));
		return array;
	}
	
	private String validate() {
		String message = "";		
		if (this.nome.trim().isEmpty())
			message = "Campo nome é obrigatório";		
		return message;
	}

	public String getMessageError() {
		return messageError;
	}

	public void setMessageError(String messageError) {
		this.messageError = messageError;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogrado() {
		return logrado;
	}

	public void setLogrado(String logrado) {
		this.logrado = logrado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome_social() {
		return nome_social;
	}

	public void setNome_social(String nome_social) {
		this.nome_social = nome_social;
	}

	public String getId_etnia() {
		return id_etnia;
	}

	public void setId_etnia(String id_etnia) {
		this.id_etnia = id_etnia;
	}

	public String getId_religiao() {
		return id_religiao;
	}

	public void setId_religiao(String id_religiao) {
		this.id_religiao = id_religiao;
	}

	public String getId_sexo() {
		return id_sexo;
	}

	public void setId_sexo(String id_sexo) {
		this.id_sexo = id_sexo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getFpagamento() {
		return fpagamento;
	}

	public void setFpagamento(String fpagamento) {
		this.fpagamento = fpagamento;
	}

	public String getDt_admissao() {
		return dt_admissao;
	}

	public void setDt_admissao(String dt_admissao) {
		this.dt_admissao = dt_admissao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public List<Deficiencias> getItensList() {
		return itensList;
	}

	public void setItensList(List<Deficiencias> itensList) {
		this.itensList = itensList;
	}

	public String getId_deficiencia() {
		return id_deficiencia;
	}

	public void setId_deficiencia(String id_deficiencia) {
		this.id_deficiencia = id_deficiencia;
	}

}
