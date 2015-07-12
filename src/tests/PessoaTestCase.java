package tests;

import static org.junit.Assert.*;
import helper.RandomHelper;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

import dto.Horario;
import dto.TipoFiliacao;
import bo.GerenciadorPessoa;



public class PessoaTestCase {

	@Test
	public void saveFuncionarioSuccess() {
		try {
			
			ArrayList<String> numeros = new ArrayList<String>();
			
			numeros.add("666666454");
			numeros.add("6787878454");
			numeros.add("77778454");
			
			ArrayList<Integer> deficiencias = new ArrayList<Integer>();
			deficiencias.add(8371116);
			deficiencias.add(8371117);
			
			
			HashMap<Integer, String> fil = new HashMap<Integer, String>();
			
			fil.put(1005413916, "testefunc");
			fil.put(1845267859, "testefunc");
			fil.put(960292675, "testefunc");
			
			
			ArrayList<Horario> horarios = new ArrayList<Horario>();
			
			Horario horario1 = new Horario(1524540745);
			Horario horario2 = new Horario(1701799444);
			
			horario1.setAno(2015);
			horario1.setDescricao("Eu passei de ano");
			
			horario2.setAno(2014);
			horario2.setDescricao("Eu ganhei uma motoca");
			horario2.setSituacao("olaa");
			
			horarios.add(horario1);
			horarios.add(horario2);
			
			GerenciadorPessoa.salvarFuncionario(123456, "seila", new Date(), "Rua legal", "Funcionario1",
					"quebragalho", 1420560671, 683618013, 1746794390, deficiencias, fil, horarios, numeros);
		} 
		catch (Exception e) {
			fail("ERRO SALVAR FUNCIONARIO: " + e.getMessage());
		}
	}
	
	@Test(expected=Exception.class)
	public void saveFuncionarioFail() throws Exception{
		GerenciadorPessoa.salvarFuncionario(123456, "Jogador", new Date(), "Rua legal", "",
				"", 1420560671, 683618013, 1746794390, null, null, null, null);
	}
	
	
	@Test
	public void saveAlunoSuccess() {
		try {
			HashMap<Integer, String> fil = new HashMap<Integer, String>();
			
			fil.put(533965793, "testealuno");
			fil.put(960292675, "testealuno");
			
			GerenciadorPessoa.salvarAluno(123456, "Junho", "ruazinha", "Aluno1", "Aluno1", 1420560671,
					683618013, 1746794390, null, fil, null, null);
		} 
		catch (Exception e) {
			fail("ERRO SALVAR ALUNO: " + e.getMessage());
		}
	}
	
	@Test(expected=Exception.class)
	public void saveAlunoFail() throws Exception{
		
		
		GerenciadorPessoa.salvarAluno(123456, "cartão", "", "", "", 1420560671,
				683618013, 1746794390, null, null, null, null);
	}
	
	
	@Test
	public void saveProfessorSuccess() {
		try {
			
			HashMap<Integer, String> fil = new HashMap<Integer, String>();
			
			fil.put(171755205, "testeprof");
			
			GerenciadorPessoa.salvarProfessor(254847455, "Professor1", "Eff", "Professor1", "Professor1", 1420560671,
					683618013, 1746794390, null, fil, null, null);
		} 
		catch (Exception e) {
			fail("ERRO SALVAR PROFESSOR: " + e.getMessage());
		}
	}
	
	
	
	
	@Test(expected=Exception.class)
	public void saveProfessorFail() throws Exception{
		GerenciadorPessoa.salvarProfessor(123456, "", "", "", "", 1420560671,
				683618013, 1746794390, null, null, null, null);
	}
	
	
	
	
	
}
