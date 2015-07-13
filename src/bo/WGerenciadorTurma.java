package bo;

import java.util.ArrayList;





import javax.jws.WebMethod;
import javax.jws.WebService;

import model.IDAO;
import model.TurmaDAO;
import dto.Turma;

@WebService
public class WGerenciadorTurma {

	private static IDAO<Turma> TurmaDao = new TurmaDAO();
	

	@WebMethod
	public static ArrayList<Turma> listar() throws Exception{
		return TurmaDao.getAll();
	}
	
}
