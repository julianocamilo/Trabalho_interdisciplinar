package bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import dto.Aluno;
import dto.Horario;
import dto.Produto;
import dto.Turma;
import model.IDAO;
import model.TurmaDAO;

public class GerenciadorTurma{

	private static IDAO<Turma> TurmaDao = new TurmaDAO();
	
	
	public static void salvar(int capacidade, Date data_inicio, Date data_fim, String tema, int curso_id, Set<Integer> alunos_id, Set<Integer> horarios_id, Set<Integer> produtos_id) throws Exception{
		
		if(capacidade <= 0) throw new Exception("A capacidade deve ser maior que zero.");
		if(alunos_id.size() > capacidade) throw new Exception("Limite de alunos ultrapassado");
		TurmaDao.save(new Turma(capacidade, data_inicio, data_fim, tema, curso_id, alunos_id,horarios_id, produtos_id ));
	}
	
	public static ArrayList<Turma> listar() throws Exception{
		return TurmaDao.getAll();
	}
	
	
	/*
	 * TODO: ATUALIZAR AINDA N�O FUNCIONANDO
	 */
	public static void atualizar(Turma turma, Set<Integer>alunos_id, Set<Integer> horarios_id, Set<Integer> produtos_id) throws Exception{
		
		if(alunos_id == null)throw new Exception("Nenhum aluno solicitado"); ;
		int quantidade_disponivel = turma.getCapacidade() - turma.getAlunos().size();
		if(quantidade_disponivel < alunos_id.size()) throw new Exception("Limite de alunos ultrapassado"); 
		
		for (Integer aluno_id : alunos_id) {
			turma.getAlunos().add(new Aluno(aluno_id));
		}
		
		for (Integer horario_id : horarios_id) {
			turma.getHorarios().add(new Horario(horario_id));
		}
		
		for (Integer produto_id : produtos_id) {
			turma.getProdutos().add(new Produto(produto_id));
		}
		
		
		
		TurmaDAO turmaDao2 = (TurmaDAO)TurmaDao;
		turmaDao2.update(turma);
		
	}
	
}
