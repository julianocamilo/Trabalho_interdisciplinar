package bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;




import dto.Aluno;
import dto.Horario;
import dto.Produto;
import dto.Turma;
import model.IDAO;
import model.TurmaDAO;


@Stateless
@Local
public class GerenciadorTurma{

	private static IDAO<Turma> TurmaDao = new TurmaDAO();
	
	
	public static void salvar(int capacidade, Date data_inicio, Date data_fim, String tema, int curso_id, Set<Integer> horarios_id, Set<Integer> produtos_id) throws Exception{
		
		if(capacidade <= 0) throw new Exception("A capacidade deve ser maior que zero.");
		
		TurmaDao.save(new Turma(capacidade, data_inicio, data_fim, tema, curso_id,horarios_id, produtos_id ));
	}
	
	public static ArrayList<Turma> listar() throws Exception{
		return TurmaDao.getAll();
	}
	
	
	/*
	 * TODO: ATUALIZAR AINDA NÃO FUNCIONANDO
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
	
	
	public static void adicionarAluno(int turma_id, int aluno_id) throws Exception{
		
		Turma turma = TurmaDao.get(new Turma(turma_id));
		
		int quantidade_disponivel = turma.getCapacidade() - turma.getAlunos().size();
		if(quantidade_disponivel <= 0) throw new Exception("Não há vagas nesta turma, tente outra turma");
		
		
		turma.getAlunos().add(new Aluno(aluno_id));
		TurmaDAO turmaDao2 = (TurmaDAO)TurmaDao;
		turmaDao2.update(turma);
		
		
		
	}
	
	
	
	
}
