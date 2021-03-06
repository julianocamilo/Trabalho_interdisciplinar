package bo;

import java.util.ArrayList;

import javax.ejb.Local;
import javax.ejb.Stateless;

import dto.Etnia;
import model.IDAO;
import model.EtniaDAO;

@Stateless
@Local
public class GerenciadorEtnia{

	private static IDAO<Etnia> EtniaDao = new EtniaDAO();
	
	public static void salvar(String descricao) throws Exception{
		
		if(descricao.isEmpty()) throw new Exception("Descri��o � campo obrigat�rio");
		EtniaDao.save(new Etnia(descricao));
	}
	
	public static ArrayList<Etnia> listar() throws Exception{
		return EtniaDao.getAll();
	}
	
	
}
