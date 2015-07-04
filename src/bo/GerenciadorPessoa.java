package bo;



import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.AlunoDAO;
import model.FuncionarioDAO;
import model.IDAO;
import model.ProfessorDAO;
import dto.Aluno;
import dto.Funcionario;
import dto.Pessoa;
import dto.Professor;

public class GerenciadorPessoa {
	
	
	private static IDAO<Professor> professorDao = new ProfessorDAO(); 
	private static IDAO<Aluno> alunoDao = new AlunoDAO(); 
	private static IDAO<Funcionario> funcDao = new FuncionarioDAO();
	
	
	
	
	private static void validPessoa(String nome) throws Exception{
		if(nome.isEmpty())
			throw new Exception("Nome é obrigatório");
	}
	
	public static void salvarProfessor(int cep, String formacao,  String logradouro, String nome, String nomeSocial, int sexo_id, int etnia_id, int religiao_id, ArrayList<Integer> deficiencias_id) throws Exception{
		validPessoa(nome);
		Professor professorDto = new Professor(nome,nomeSocial, cep, logradouro,formacao, etnia_id, sexo_id, religiao_id, deficiencias_id);
		professorDao.save(professorDto);
	}
	
	
	public static void salvarAluno(int cep, String fpagamento,  String logradouro, String nome, String nomeSocial, int sexo_id, int etnia_id, int religiao_id, ArrayList<Integer> deficiencias_id ) throws Exception{
		validPessoa(nome);
		Aluno alunoDto = new Aluno(nome, nomeSocial, cep, logradouro, fpagamento, etnia_id, sexo_id, religiao_id, deficiencias_id);
		alunoDao.save(alunoDto);
	}
	
	
	public static void salvarFuncionario(int cep, String cargo, Date data_admissao,  String logradouro, String nome, String nomeSocial, int sexo_id, int etnia_id, int religiao_id, ArrayList<Integer> deficiencias_id) throws Exception{
		validPessoa(nome);
		Funcionario funcionarioDto = new Funcionario(nome, nomeSocial, cep, logradouro, data_admissao, cargo, etnia_id, sexo_id, religiao_id, deficiencias_id);
		funcDao.save(funcionarioDto);
	}
	
	
	
	
	
	/////DEIXAR AKI PARA EXEMPLO DE CRIACAO
	public static Pessoa get1(){ 
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("interdisciplinar");
		EntityManager manager = factory.createEntityManager();

		Pessoa encontrada = manager.find(Pessoa.class, 1);

		System.out.println(encontrada.getNome());
		return encontrada;
	}


	
	

}
