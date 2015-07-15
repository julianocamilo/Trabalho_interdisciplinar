package controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dto.Aluno;
import dto.Turma;
import bo.GerenciadorPessoa;
import bo.GerenciadorTurma;

@ManagedBean
@ViewScoped
public class MatriculaController extends ApplicationController {
	private String id_aluno;
	private String id_turma;
	private String messageError;
	
	public void save() throws Exception{
		this.messageError = "";
		try {
			String message = validate(); 
			if (!message.isEmpty()) {
				throw new Exception(message);
			}
			GerenciadorTurma.adicionarAluno(Integer.parseInt(id_turma), Integer.parseInt(this.id_aluno));
			super.setMessage("msgError", "Cadastro com sucesso");
			
		}catch(Exception ex) {						
			super.setMessage("msgError", ex.getMessage());
		}	
	}
	
	private String validate() {
		String message = "";		
		if (id_aluno.trim().isEmpty())
			message = "Campo id aluno é obrigatório";
		else if (id_turma.trim().isEmpty())
			message = "Campo id turma é obrigatório";
		return message;
	}
	
	private static Map<String,Object> hashAluno() throws Exception {
		ArrayList<Aluno> alunoArray = GerenciadorPessoa.listarAlunos();
		
		
		Map<String,Object> hashAluno = new LinkedHashMap<String,Object>();
		for (int i=0; i< alunoArray.size(); i++) {			
			hashAluno.put(alunoArray.get(i).getNome(), alunoArray.get(i).getId()); //label, value			
		}		
		return hashAluno;
	}
 
	public Map<String,Object> getAluno() throws Exception {
		return hashAluno();
	}
	
	private static Map<String,Object> hashTurma() throws Exception {
		ArrayList<Turma> turmaArray = GerenciadorTurma.listar();
		
		
		Map<String,Object> hashTurma = new LinkedHashMap<String,Object>();
		for (int i=0; i< turmaArray.size(); i++) {			
			hashTurma.put(turmaArray.get(i).getTema(), turmaArray.get(i).getId()); //label, value			
		}		
		return hashTurma;
	}
 
	public Map<String,Object> getTurma() throws Exception {
		return hashTurma();
	}
	
	
	public String getMessageError() {
		return messageError;
	}

	public void setMessageError(String messageError) {
		this.messageError = messageError;
	}

	public String getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(String id_aluno) {
		this.id_aluno = id_aluno;
	}

	public String getId_turma() {
		return id_turma;
	}

	public void setId_turma(String id_turma) {
		this.id_turma = id_turma;
	}
		
}
