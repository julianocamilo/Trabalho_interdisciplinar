package tests;

import static org.junit.Assert.*;
import helper.RandomHelper;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import dto.Funcionario;
import bo.GerenciadorPessoa;
import bo.GerenciadorSexo;


public class PessoaTestCase {

	@Test
	public void saveFuncionarioSuccess() {
		try {
			GerenciadorPessoa.salvarFuncionario(123456, "Jogador", new Date(), "Rua legal", "severino",
					"quebragalho", 1420560671, 683618013, 1746794390, null, 0);
		} 
		catch (Exception e) {
			fail("ERRO SALVAR FUNCIONARIO: " + e.getMessage());
		}
	}
	
	@Test(expected=Exception.class)
	public void saveFuncionarioFail() throws Exception{
		GerenciadorPessoa.salvarFuncionario(123456, "Jogador", new Date(), "Rua legal", "",
				"", 1420560671, 683618013, 1746794390, null, 0);
	}
	
	
	@Test
	public void saveAlunoSuccess() {
		try {
			GerenciadorPessoa.salvarAluno(123456, "cartão", "ruazinha", "beitinho", "betiao", 1420560671,
					683618013, 1746794390, null, 0);
		} 
		catch (Exception e) {
			fail("ERRO SALVAR ALUNO: " + e.getMessage());
		}
	}
	
	@Test(expected=Exception.class)
	public void saveAlunoFail() throws Exception{
		GerenciadorPessoa.salvarAluno(123456, "cartão", "", "", "", 1420560671,
				683618013, 1746794390, null, 0);
	}
	
	
	@Test
	public void saveProfessorSuccess() {
		try {
			
			GerenciadorPessoa.salvarProfessor(RandomHelper.getIntRandom(), "fdsfs", "Eff", "Edd", "Edff", 1420560671,
					683618013, 1746794390, null, 0);
		} 
		catch (Exception e) {
			fail("ERRO SALVAR PROFESSOR: " + e.getMessage());
		}
	}
	
	
	
	
	@Test(expected=Exception.class)
	public void saveProfessorFail() throws Exception{
		GerenciadorPessoa.salvarProfessor(123456, "", "", "", "", 1420560671,
				683618013, 1746794390, null, 0);
	}
	
	
	
	
	
}
