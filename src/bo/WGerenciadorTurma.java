package bo;

import java.util.ArrayList;

import model.IDAO;
import model.TurmaDAO;
import dto.Turma;

public class WGerenciadorTurma {

	private static IDAO<Turma> TurmaDao = new TurmaDAO();
	

	public static ArrayList<Turma> listar() throws Exception{
		return TurmaDao.getAll();
	}
	
}
