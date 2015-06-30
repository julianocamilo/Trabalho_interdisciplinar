package bo;

import java.util.ArrayList;

import dto.Sexo;
import model.IDAO;
import model.SexoDAO;

public class GerenciadorSexo{

	private static IDAO<Sexo> sexoDao = new SexoDAO();
	
	public static void salvar(String descricao) throws Exception{
		
		if(descricao.isEmpty()) throw new Exception("Descrição é campo obrigatório");
		sexoDao.save(new Sexo(descricao));
	}
	
	public static ArrayList<Sexo> listar() throws Exception{
		return sexoDao.getAll();
	}
	
	
}
