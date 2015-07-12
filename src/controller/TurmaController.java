package controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import controller.VendaController.Itens;
import bo.GerenciadorCurso;
import bo.GerenciadorHorario;
import bo.GerenciadorItem;
import bo.GerenciadorTurma;
import dto.Curso;
import dto.Horario;
import dto.Item;
import dto.Produto;
import dto.Sexo;
import dto.Turma;

@ManagedBean
@ViewScoped
public class TurmaController extends ApplicationController {
	
	private String capacidade;
	private String data_ini;
	private String data_fim;
	private String tema;
	private String curso_id;
	
	private String horarioId;
	private List<Horario> horarioList =  new ArrayList<Horario>();
	private String produtoId;
	private List<Produto> produtoList =  new ArrayList<Produto>();
	private String messageError;
	private List<Turma> turmaList =  new ArrayList<Turma>();
//	private List<Turma> turmaList =  carregaTurmas();
	//TurmaController() throws Exception{ carregaTurmas(); };
	
	public void save() throws Exception{ 
		this.messageError = "";
		try {
			String message = validate(); 
			if (!message.isEmpty()) {
				throw new Exception(message);
			}
			int capacidade_int = Integer.parseInt(capacidade);
			DateFormat formatter = new SimpleDateFormat("MM/dd/yy");  
			Date date_inicio = (Date)formatter.parse(this.data_ini);
			Date date_fim = (Date)formatter.parse(this.data_fim);
			
		//	GerenciadorTurma.salvar(capacidade_int, date_inicio, date_fim, this.tema, this.curso_id, returnHorarioId(), returnProdutoId());
		}catch(Exception ex) {						
			super.setMessage("msgError", ex.getMessage());
		}	
	}
	
	private List<Integer> returnHorarioId() {
		List<Integer> horariosId = new ArrayList<Integer>();		
		for (int index = 0; index < horarioList.size(); index++)
			horariosId.add(horarioList.get(index).getId());
		return horariosId;
	}
	
	private List<Integer> returnProdutoId() {
		List<Integer> produtoId = new ArrayList<Integer>();		
		for (int index = 0; index < produtoList.size(); index++)
			produtoId.add(produtoList.get(index).getId());
		return produtoId;
	}
	
	// Curso
	private static Map<String,Object> hashCurso() throws Exception {
		//ArrayList<Curso> cursoArray = (new GerenciadorCurso()).listar();
		ArrayList<Curso> cursoArray = new ArrayList<Curso>();
		Curso curso = new Curso();
		curso.setDescricao("Matemarico");
		curso.setId(1);
		cursoArray.add(curso);
		
		Curso curso2 = new Curso();
		curso2.setDescricao("Portugues");
		curso2.setId(1);
		cursoArray.add(curso2);
		
		Map<String,Object> hashCurso = new LinkedHashMap<String,Object>();
		for (int i=0; i< cursoArray.size(); i++) {			
			hashCurso.put(cursoArray.get(i).getDescricao(), cursoArray.get(i).getId()); //label, value			
		}		
		return hashCurso;
	}
 
	public Map<String,Object> getCurso() throws Exception {
		return hashCurso();
	}
	// End Curso
	
	private String validate() {
		String message = "";		
		return message;
	}

	public void addProduto() throws NumberFormatException, Exception {
		if (this.produtoId.isEmpty()) return;
		Item item = GerenciadorItem.selecionar(Integer.parseInt(this.produtoId));
		Produto produto = new Produto();
		produto.setDescricao(item.getDescricao());
		produto.setId(item.getId());
		produtoList.add(produto);
		this.produtoId = "";					
	}
	
	public void addHorario() throws NumberFormatException, Exception {
		if (this.horarioId.isEmpty()) return;
		Horario horario = GerenciadorHorario.selecionar(Integer.parseInt(this.horarioId));						
		horarioList.add(horario);
		this.horarioId = "";					
	}
	
	public List<Turma> carregaTurmas(){		
		try {
			return GerenciadorTurma.listar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return turmaList;
		
	}
	
	public String getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}

	public String getData_ini() {
		return data_ini;
	}

	public void setData_ini(String data_ini) {
		this.data_ini = data_ini;
	}

	public String getData_fim() {
		return data_fim;
	}

	public void setData_fim(String data_fim) {
		this.data_fim = data_fim;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getCurso_id() {
		return curso_id;
	}

	public void setCurso_id(String curso_id) {
		this.curso_id = curso_id;
	}

	public String getHorarioId() {
		return horarioId;
	}

	public void setHorarioId(String horarioId) {
		this.horarioId = horarioId;
	}

	public List<Horario> getHorarioList() {
		return horarioList;
	}

	public void setHorarioList(List<Horario> horarioList) {
		this.horarioList = horarioList;
	}

	public String getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(String produtoId) {
		this.produtoId = produtoId;
	}

	public List<Produto> getProdutoList() {
		return produtoList;
	}

	public void setProdutoList(List<Produto> produtoList) {
		this.produtoList = produtoList;
	}

	public String getMessageError() {
		return messageError;
	}

	public void setMessageError(String messageError) {
		this.messageError = messageError;
	}

	public List<Turma> getTurmaList() {
		return turmaList;
	}

	public void setTurmaList(List<Turma> turmaList) {
		this.turmaList = turmaList;
	}
	
}
