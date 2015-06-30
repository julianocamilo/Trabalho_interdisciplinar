package bo;

import java.util.ArrayList;

import dto.Etnia;
import model.IDAO;
import model.EtniaDAO;

public class GerenciadorEtnia{

	private static IDAO<Etnia> EtniaDao = new EtniaDAO();
	
	public static void salvar(String descricao) throws Exception{
		
		if(descricao.isEmpty()) throw new Exception("Descrição é campo obrigatório");
		EtniaDao.save(new Etnia(descricao));
	}
	
	public static ArrayList<Etnia> listar() throws Exception{
		return EtniaDao.getAll();
	}
	
	
}
