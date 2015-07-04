package bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import dto.Aluno;
import dto.Turma;
import model.IDAO;
import model.TurmaDAO;

public class GerenciadorTurma{

	private static IDAO<Turma> TurmaDao = new TurmaDAO();
	
	
	public static void salvar(int capacidade, Date data_inicio, Date data_fim, String tema, int curso_id, Set<Integer> alunos_id) throws Exception{
		
		if(capacidade <= 0) throw new Exception("A capacidade deve ser maior que zero.");
		if(alunos_id.size() > capacidade) throw new Exception("Limite de alunos ultrapassado");
		TurmaDao.save(new Turma(capacidade, data_inicio, data_fim, tema, curso_id, alunos_id));
	}
	
	public static ArrayList<Turma> listar() throws Exception{
		return TurmaDao.getAll();
	}
	
	
	/*
	 * TODO: ATUALIZAR AINDA NÃO FUNCIONANDO
	 */
	public static void atualizar(Turma turma, Set<Integer>alunos_id) throws Exception{
		
		if(alunos_id == null)throw new Exception("Nenhum aluno solicitado"); ;
		int quantidade_disponivel = turma.getCapacidade() - turma.getAlunos().size();
		if(quantidade_disponivel < alunos_id.size()) throw new Exception("Limite de alunos ultrapassado"); 
		
		for (Integer aluno_id : alunos_id) {
			turma.getAlunos().add(new Aluno(aluno_id));
		}
		
		TurmaDAO turmaDao2 = (TurmaDAO)TurmaDao;
		turmaDao2.update(turma);
		
	}
	
}
