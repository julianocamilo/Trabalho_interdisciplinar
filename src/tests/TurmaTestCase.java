package tests;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import dto.Turma;
import bo.GerenciadorTurma;


public class TurmaTestCase {

	@Test
	public void saveTurmaSuccess() {
		try {
			
			Set<Integer> alunos = new HashSet<Integer>();
			alunos.add(213552162);
			
			bo.GerenciadorTurma.salvar(50, new Date(), new Date(), "Excel avan�ado", 1661903814, alunos);
		} 
		catch (Exception e) {
			fail("ERRO SALVAR Turma: " + e.getMessage());
		}
	}
	
	@Test(expected=Exception.class)
	public void saveTurmaFail() throws Exception{
		GerenciadorTurma.salvar(0, new Date(), new Date(), "Excel avan�ado", 1661903814, null);
	}
	
	@Test(expected=Exception.class)
	public void saveTurmaLimiteQuantidadeFail() throws Exception{
		Set<Integer> alunos = new HashSet<Integer>();
		alunos.add(213552162);
		alunos.add(231676079);
		
		bo.GerenciadorTurma.salvar(1, new Date(), new Date(), "Excel avan�ado", 1661903814, alunos);
	}
	
	
	@Test(expected=Exception.class)
	public void saveTurmaNegativeFail() throws Exception{
		GerenciadorTurma.salvar(-9, new Date(), new Date(), "Excel avan�ado", 1661903814, null);
	}
	
	
	
	@Test
	public void GetAllTurmaSuccess() throws Exception {
		GerenciadorTurma.listar();
	}
	
	@Test
	public void updateTurmaSuccess() {
		try {
			
			Set<Integer> alunos = new HashSet<Integer>();
			alunos.add(213552162);
			
			Set<Integer> alunos1 = new HashSet<Integer>();
			alunos1.add(337444603);
			
			bo.GerenciadorTurma.atualizar( new Turma(97678800, 90, new Date(),  new Date(), "Exceld", 154, alunos), alunos1);
		} 
		catch (Exception e) {
			fail("ERRO SALVAR Turma: " + e.getMessage());
		}
	}
	
	
}