package bo;

import java.util.ArrayList;

import dto.Curso;
import model.IDAO;
import model.CursoDAO;

public class GerenciadorCurso{

	private static IDAO<Curso> CursoDao = new CursoDAO();
	
	public static void salvar(String descricao) throws Exception{
		
		if(descricao.isEmpty()) throw new Exception("Descrição é campo obrigatório");
		CursoDao.save(new Curso(descricao));
	}
	
	public static ArrayList<Curso> listar() throws Exception{
		return CursoDao.getAll();
	}
	
	
}
