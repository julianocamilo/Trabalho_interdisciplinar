package bo;

import java.util.ArrayList;

import model.IDAO;
import model.TelefoneDAO;
import dto.Telefone;

public class GerenciadorTelefone {

	private static IDAO<Telefone> TelefoneDao = new TelefoneDAO();
	
	public static void salvar(String telefone, int pessoa_id) throws Exception{
		if(telefone.isEmpty()) throw new Exception("Telefone é campo obrigatório");
		TelefoneDao.save(new Telefone(telefone, pessoa_id));
		
		
	}
	
	public static ArrayList<Telefone> listar() throws Exception{
		return TelefoneDao.getAll();
	}
	
	
}
