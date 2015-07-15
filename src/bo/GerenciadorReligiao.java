package bo;

import java.util.ArrayList;

import javax.ejb.Local;
import javax.ejb.Stateless;

import dto.Religiao;
import model.IDAO;
import model.ReligiaoDAO;

@Stateless
@Local
public class GerenciadorReligiao {

	
	private static IDAO<Religiao> religiaoDao = new ReligiaoDAO();
	
	public static void salvar(String descricao) throws Exception{
		
		if(descricao.isEmpty()) throw new Exception("Campo descrição é obrigatório.");
		religiaoDao.save(new Religiao(descricao));
		
		
	}
	
	public static ArrayList<Religiao> listar() throws Exception{
		return religiaoDao.getAll();
	}
	
}
