package bo;

import java.util.ArrayList;

import javax.ejb.Local;
import javax.ejb.Stateless;

import dto.Curso;
import model.IDAO;
import model.CursoDAO;

@Stateless
@Local
public class GerenciadorCurso{

	private static IDAO<Curso> CursoDao = new CursoDAO();
	
	public static void salvar(String descricao) throws Exception{
		
		if(descricao.isEmpty()) throw new Exception("Descri��o � campo obrigat�rio");
		CursoDao.save(new Curso(descricao));
	}
	
	public static ArrayList<Curso> listar() throws Exception{
		return CursoDao.getAll();
	}
	
	
}
