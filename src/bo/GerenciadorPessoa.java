package bo;

import helper.RandomHelper;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.AlunoDAO;
import model.FiliacaoDAO;
import model.FuncionarioDAO;
import model.HorarioPessoaDAO;
import model.IDAO;
import model.ProfessorDAO;
import model.TelefoneDAO;
import dto.Aluno;
import dto.Filiacao;
import dto.Funcionario;
import dto.Horario;
import dto.HorarioPessoa;
import dto.Pessoa;
import dto.Professor;
import dto.Telefone;
import dto.TipoFiliacao;

public class GerenciadorPessoa {
	
	
	private static IDAO<Professor> professorDao = new ProfessorDAO(); 
	private static IDAO<Aluno> alunoDao = new AlunoDAO(); 
	private static IDAO<Funcionario> funcDao = new FuncionarioDAO();
	private static IDAO<Filiacao> filiacaoDao = new FiliacaoDAO();
	private static IDAO<HorarioPessoa> horarioPessoaDao = new HorarioPessoaDAO();
	private static IDAO<Telefone> telefoneDao = new TelefoneDAO();
	
	
	
	private static void validPessoa(String nome) throws Exception{
		if(nome.isEmpty())
			throw new Exception("Nome é obrigatório");
	}
	
	private static void salvarFiliacoes(HashMap<Integer, String> filiacoes, int pessoa_id) throws Exception{
			
			for (Entry<Integer, String> entry : filiacoes.entrySet()) {
				int tipo_id = entry.getKey();
				String descricao = entry.getValue();
				
				Filiacao filiacao = new Filiacao();
				filiacao.setDescricao(descricao);
				filiacao.setTipo(new TipoFiliacao(tipo_id));
				filiacao.setId(RandomHelper.getIntRandom());
				filiacao.setPessoa(new Pessoa(pessoa_id));
				filiacaoDao.save(filiacao);
				
				
			}
		
	}
	
	
	private static void salvarHorarios(ArrayList<Horario> horarios, int pessoa_id) throws Exception{
		
		for (Horario horario : horarios) {
			
			HorarioPessoa horarioPessoa = new HorarioPessoa();
			horarioPessoa.setHorario(horario);
			horarioPessoa.setPessoa(new Pessoa(pessoa_id));
			horarioPessoa.setAno(horario.getAno());
			horarioPessoa.setSituacao(horario.getSituacao());
			horarioPessoaDao.save(horarioPessoa);
		}
		
		
	}
	
	private static void salvarTelefones(ArrayList<String> telefones, int pessoa_id) throws Exception{
		
		for (String phonenumber : telefones) {
			
			Telefone telefone = new Telefone();
			telefone.setTelefone(phonenumber);
			telefone.setId(RandomHelper.getIntRandom());
			telefone.setPessoa(new Pessoa(pessoa_id));
			telefoneDao.save(telefone);
		}
		
		
	}
	
	
	public static void salvarProfessor(int cep, String formacao,  String logradouro, String nome, String nomeSocial, int sexo_id, int etnia_id, int religiao_id, ArrayList<Integer> deficiencias_id, HashMap<Integer, String> filiacoes, ArrayList<Horario> horarios, ArrayList<String> telefones) throws Exception{
		validPessoa(nome);
		Professor professorDto = new Professor(nome,nomeSocial, cep, logradouro,formacao, etnia_id, sexo_id, religiao_id, deficiencias_id);
		professorDao.save(professorDto);
		
		ProfessorDAO pdao = (ProfessorDAO)professorDao;
		
		if(filiacoes != null) salvarFiliacoes(filiacoes, pdao.getId_created());
		if(horarios != null)  salvarHorarios(horarios, pdao.getId_created());
		if(telefones != null) salvarTelefones(telefones, pdao.getId_created());

	}
	
	
	
	public static void salvarAluno(int cep, String fpagamento,  String logradouro, String nome, String nomeSocial, int sexo_id, int etnia_id, int religiao_id, ArrayList<Integer> deficiencias_id, HashMap<Integer, String> filiacoes, ArrayList<Horario> horarios, ArrayList<String> telefones) throws Exception{
		validPessoa(nome);
		Aluno alunoDto = new Aluno(nome, nomeSocial, cep, logradouro, fpagamento, etnia_id, sexo_id, religiao_id, deficiencias_id);
		alunoDao.save(alunoDto);
		
		AlunoDAO pdao = (AlunoDAO)alunoDao;
		
		if(filiacoes != null) salvarFiliacoes(filiacoes, pdao.getId_created());
		if(horarios != null) salvarHorarios(horarios, pdao.getId_created());
		if(telefones != null) salvarTelefones(telefones, pdao.getId_created());
		
	}
	
	
	public static ArrayList<Aluno> listarAlunos() throws Exception{
		return alunoDao.getAll();
		
	}
	
	
	
	public static void salvarFuncionario(int cep, String cargo, Date data_admissao,  String logradouro, String nome, String nomeSocial, int sexo_id, int etnia_id, int religiao_id, ArrayList<Integer> deficiencias_id, HashMap<Integer, String> filiacoes, ArrayList<Horario> horarios, ArrayList<String> telefones) throws Exception{
		validPessoa(nome);
		Funcionario funcionarioDto = new Funcionario(nome, nomeSocial, cep, logradouro, data_admissao, cargo, etnia_id, sexo_id, religiao_id, deficiencias_id);
		funcDao.save(funcionarioDto);
		
		FuncionarioDAO pdao = (FuncionarioDAO)funcDao;
		
		if(filiacoes != null) salvarFiliacoes(filiacoes, pdao.getId_created());
		if(horarios != null) salvarHorarios(horarios, pdao.getId_created());
		if(telefones != null) salvarTelefones(telefones, pdao.getId_created());
		
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
