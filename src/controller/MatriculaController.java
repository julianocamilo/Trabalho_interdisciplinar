package controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dto.Aluno;
import dto.Dia;
import dto.TipoFiliacao;
import dto.Turma;
import bo.GerenciadorDia;
import bo.GerenciadorEtnia;
import bo.GerenciadorHorario;

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
			//GerenciadorMatricula.salvar(Integer.parseInt(this.id_aluno), Integer.parseInt(id_turma));
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
		//ArrayList<Dia> diaArray = (new GerenciadorDia()).listar();
		ArrayList<Aluno> alunoArray = new ArrayList<Aluno>();
		Aluno aluno = new Aluno();
		aluno.setNome("Juliano");
		aluno.setId(1);
		alunoArray.add(aluno);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Fernando");
		aluno2.setId(1);
		alunoArray.add(aluno2);
		
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
		//ArrayList<Dia> diaArray = (new GerenciadorDia()).listar();
		ArrayList<Turma> turmaArray = new ArrayList<Turma>();
		Turma turma = new Turma();
		turma.setTema("Tema 1");
		turma.setId(1);
		turmaArray.add(turma);
		
		Turma turma2 = new Turma();
		turma2.setTema("Tema 2");
		turma2.setId(1);
		turmaArray.add(turma2);
		
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
