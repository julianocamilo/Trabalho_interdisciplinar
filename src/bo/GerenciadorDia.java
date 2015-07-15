package bo;

import java.util.ArrayList;

import javax.ejb.Local;
import javax.ejb.Stateless;

import dto.Dia;
import model.IDAO;
import model.DiaDAO;

@Stateless
@Local
public class GerenciadorDia{

	private static IDAO<Dia> DiaDao = new DiaDAO();
	
	public static void salvar(String descricao) throws Exception{
		
		if(descricao.isEmpty()) throw new Exception("Descrição é campo obrigatório");
		DiaDao.save(new Dia(descricao));
	}
	
	public static ArrayList<Dia> listar() throws Exception{
		return DiaDao.getAll();
	}
	
	
}
