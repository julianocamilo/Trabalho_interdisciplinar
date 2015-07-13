package controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dto.Deficiencia;
import dto.Etnia;
import dto.Horario;
import dto.Religiao;
import dto.Sexo;
import dto.Telefone;
import dto.TipoFiliacao;

import java.util.List;

import bo.GerenciadorDeficiencia;
import bo.GerenciadorEtnia;
import bo.GerenciadorHorario;
import bo.GerenciadorItem;
import bo.GerenciadorPessoa;
import bo.GerenciadorReligiao;
import bo.GerenciadorSexo;
import bo.GerenciadorTipoFiliacao;
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

	public class Filiacao {
		public String id;
		public String descricao;
		public String tipo;
		public String id_tipo;

		public String getId() {
			return id;
		}

		public String getDescricao() {
			return descricao;
		}

		public String getTipo() {
			return tipo;
		}

		public String getId_tipo() {
			return id_tipo;
		}

	}

	private String cep;
	private String logrado;
	private String nome;
	private String nome_social;
	private String id_etnia;
	private String id_religiao;
	private String id_sexo;
	private String tipo = "0";
	private String formacao;
	private String fpagamento;
	private String dt_admissao;
	private String cargo;

	private List<Deficiencias> itensList = new ArrayList<Deficiencias>();
	private List<Filiacao> filiacaoList = new ArrayList<Filiacao>();
	private List<Horario> horarioList = new ArrayList<Horario>();
	private List<Telefone> telefoneList = new ArrayList<Telefone>();
	private String telefone;
	private String descricao_filiacao;
	private String id_tipoFiliacao;
	private String id_deficiencia;
	private String id_horario;
	private String messageError;

	
	/* Hash de pesquisa */
	 private Map<String,Object> all_sexo = new HashMap<String, Object>();
	 private Map<String,Object> all_etnia = new HashMap<String, Object>();
	 private Map<String,Object> all_religiao = new HashMap<String, Object>();
	 private Map<String,Object> all_tipoFiliacao  = new HashMap<String, Object>();
	
	 
	
	 
	 
	public void save() throws Exception {
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
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			
			switch (tipo) {
			case 0:
				GerenciadorPessoa.salvarAluno(cepInt, this.fpagamento,
						this.logrado, this.nome, this.nome_social, id_sexo_int,
						id_etnia_int, id_religiao_int, retornaIdItens(),
						retornaHashfiliacao(),
						(ArrayList<Horario>) horarioList, retornaTelefone());

				break;
			case 1:
				
				Date data_admissao = (Date) formatter.parse(this.dt_admissao);
				GerenciadorPessoa.salvarFuncionario(cepInt, this.cargo,
						data_admissao, this.logrado, this.nome,
						this.nome_social, id_sexo_int, id_etnia_int,
						id_religiao_int, retornaIdItens(),
						retornaHashfiliacao(),
						(ArrayList<Horario>) horarioList, retornaTelefone());
				break;
			case 2:
				GerenciadorPessoa.salvarProfessor(cepInt, this.formacao,
						this.logrado, this.nome, this.nome_social, id_sexo_int,
						id_etnia_int, id_religiao_int, retornaIdItens(),
						retornaHashfiliacao(),
						(ArrayList<Horario>) horarioList, retornaTelefone());
			}
			super.setMessage("msgError", "Sucesso!");

		} catch (Exception ex) {
			super.setMessage("msgError", ex.getMessage());
		}
	}

	private ArrayList<String> retornaTelefone() {
		ArrayList<String> array = new ArrayList<String>();
		for (int i = 0; i < telefoneList.size(); i++)
			array.add(telefoneList.get(i).getTelefone());
		return array;
	}

	private HashMap<Integer, String> retornaHashfiliacao() {
		HashMap<Integer, String> hashFiliacao = new HashMap<Integer, String>();
		for (int i = 0; i < filiacaoList.size(); i++) {
			hashFiliacao.put(Integer.parseInt(filiacaoList.get(i).getId_tipo()),
					filiacaoList.get(i).getDescricao());
		}
		return hashFiliacao;
	}

	private static Map<String, Object> hashTipoFiliacao() throws Exception {
		ArrayList<TipoFiliacao> tipo_filiacao = GerenciadorTipoFiliacao
				.listar();

		Map<String, Object> hashFiliacao = new LinkedHashMap<String, Object>();
		for (int i = 0; i < tipo_filiacao.size(); i++) {
			hashFiliacao.put(tipo_filiacao.get(i).getDescricao(), tipo_filiacao
					.get(i).getId()); // label, value
		}
		return hashFiliacao;
	}

	 public Map<String,Object> getTipoFiliacao() throws Exception {
		 	if (all_tipoFiliacao.isEmpty()) all_tipoFiliacao = hashTipoFiliacao();	 
		 	return all_tipoFiliacao;
		 }

	// Sexo
	private static Map<String, Object> hashSexo() throws Exception {
		ArrayList<Sexo> sexoArray = GerenciadorSexo.listar();

		Map<String, Object> hashSexo = new LinkedHashMap<String, Object>();
		for (int i = 0; i < sexoArray.size(); i++) {
			hashSexo.put(sexoArray.get(i).getDescricao(), sexoArray.get(i)
					.getId()); // label, value
		}
		return hashSexo;
	}

	public Map<String,Object> getSexo() throws Exception {
	 	if (all_sexo.isEmpty()) all_sexo = hashSexo();	 
	 	return all_sexo;
	 }
	// End Sexo

	// Religiao
	private static Map<String, Object> hashReligiao() throws Exception {
		ArrayList<Religiao> religiaoArray = GerenciadorReligiao.listar();

		Map<String, Object> hashReligiao = new LinkedHashMap<String, Object>();
		for (int i = 0; i < religiaoArray.size(); i++) {
			hashReligiao.put(religiaoArray.get(i).getDescricao(), religiaoArray
					.get(i).getId()); // label, value
		}
		return hashReligiao;
	}

	public Map<String,Object> getReligiao() throws Exception {
	 	if (all_religiao.isEmpty()) all_religiao = hashReligiao();;	 
	 	return all_religiao;	 
	 }

	// End Religiao

	// Etnia
	private static Map<String, Object> hashEtnia() throws Exception {
		ArrayList<Etnia> etniaArray = GerenciadorEtnia.listar();

		Map<String, Object> hashEtnia = new LinkedHashMap<String, Object>();
		for (int i = 0; i < etniaArray.size(); i++) {
			hashEtnia.put(etniaArray.get(i).getDescricao(), etniaArray.get(i)
					.getId()); // label, value
		}
		return hashEtnia;
	}

	public Map<String,Object> getEtnia() throws Exception {
	 	if (all_etnia.isEmpty()) all_etnia= hashEtnia();
	 	return all_etnia;
	 }

	// End etinia
	//deficic

	public void adddeficiencia() throws NumberFormatException, Exception {
		if (this.id_deficiencia.isEmpty())
			return;
	
		Deficiencia deficiencia = GerenciadorDeficiencia.selecionar(Integer.parseInt(id_deficiencia));
		Deficiencias deficiencias = new Deficiencias();
		deficiencias.id = id_deficiencia;
		deficiencias.nome = deficiencia.getDescricao();
		itensList.add(deficiencias);
		this.id_deficiencia = "";
	}

	public void addFiliacao() {
		if (this.descricao_filiacao.trim().isEmpty())
			return;

		Filiacao filiacao = new Filiacao();
		filiacao.descricao = this.descricao_filiacao;
		filiacao.id_tipo = this.id_tipoFiliacao;
		filiacaoList.add(filiacao);
		this.descricao_filiacao = "";
		this.id_tipoFiliacao = "";
	}

	public void addTelefone() {
		if (this.telefone.trim().isEmpty())
			return;

		Telefone telefone = new Telefone();
		telefone.setTelefone(this.telefone);
		telefoneList.add(telefone);
		this.telefone = "";
	}

	public void addHorario() throws NumberFormatException, Exception {
		if (this.id_horario.trim().isEmpty())
			return;
		Horario horario = GerenciadorHorario.selecionar(Integer
				.parseInt(this.id_horario));

		horarioList.add(horario);
		this.id_horario = "";
	}

	private ArrayList<Integer> retornaIdItens() {
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int a = 0; a < itensList.size(); a++)
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

	public List<Filiacao> getFiliacaoList() {
		return filiacaoList;
	}

	public void setFiliacaoList(List<Filiacao> filiacaoList) {
		this.filiacaoList = filiacaoList;
	}

	public String getDescricao_filiacao() {
		return descricao_filiacao;
	}

	public void setDescricao_filiacao(String descricao_filiacao) {
		this.descricao_filiacao = descricao_filiacao;
	}

	public String getId_tipoFiliacao() {
		return id_tipoFiliacao;
	}

	public void setId_tipoFiliacao(String id_tipoFiliacao) {
		this.id_tipoFiliacao = id_tipoFiliacao;
	}

	public String getId_horario() {
		return id_horario;
	}

	public void setId_horario(String id_horario) {
		this.id_horario = id_horario;
	}

	public List<Horario> getHorarioList() {
		return horarioList;
	}

	public void setHorarioList(List<Horario> horarioList) {
		this.horarioList = horarioList;
	}

	public List<Telefone> getTelefoneList() {
		return telefoneList;
	}

	public void setTelefoneList(List<Telefone> telefoneList) {
		this.telefoneList = telefoneList;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
