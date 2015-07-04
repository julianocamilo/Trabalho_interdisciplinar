package tests;

import static org.junit.Assert.*;
import helper.RandomHelper;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import org.junit.Test;

import bo.GerenciadorPessoa;



public class PessoaTestCase {

	@Test
	public void saveFuncionarioSuccess() {
		try {
			
			ArrayList<Integer> deficiencias = new ArrayList<Integer>();
			deficiencias.add(8371116);
			deficiencias.add(8371117);
			
			
			
			GerenciadorPessoa.salvarFuncionario(123456, "seila", new Date(), "Rua legal", "Funcionario1",
					"quebragalho", 1420560671, 683618013, 1746794390, deficiencias);
		} 
		catch (Exception e) {
			fail("ERRO SALVAR FUNCIONARIO: " + e.getMessage());
		}
	}
	
	@Test(expected=Exception.class)
	public void saveFuncionarioFail() throws Exception{
		GerenciadorPessoa.salvarFuncionario(123456, "Jogador", new Date(), "Rua legal", "",
				"", 1420560671, 683618013, 1746794390, null);
	}
	
	
	@Test
	public void saveAlunoSuccess() {
		try {
			GerenciadorPessoa.salvarAluno(123456, "Junho", "ruazinha", "Aluno1", "Aluno1", 1420560671,
					683618013, 1746794390, null);
		} 
		catch (Exception e) {
			fail("ERRO SALVAR ALUNO: " + e.getMessage());
		}
	}
	
	@Test(expected=Exception.class)
	public void saveAlunoFail() throws Exception{
		GerenciadorPessoa.salvarAluno(123456, "cartão", "", "", "", 1420560671,
				683618013, 1746794390, null);
	}
	
	
	@Test
	public void saveProfessorSuccess() {
		try {
			
			GerenciadorPessoa.salvarProfessor(254847455, "Professor1", "Eff", "Professor1", "Professor1", 1420560671,
					683618013, 1746794390, null);
		} 
		catch (Exception e) {
			fail("ERRO SALVAR PROFESSOR: " + e.getMessage());
		}
	}
	
	
	
	
	@Test(expected=Exception.class)
	public void saveProfessorFail() throws Exception{
		GerenciadorPessoa.salvarProfessor(123456, "", "", "", "", 1420560671,
				683618013, 1746794390, null);
	}
	
	
	
	
	
}
