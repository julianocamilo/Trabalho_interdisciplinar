package bo;

import java.util.ArrayList;

import model.DeficienciaDAO;
import model.IDAO;
import dto.Deficiencia;

public class GerenciadorDeficiencia {

	private static IDAO<Deficiencia> deficienciaDao = new DeficienciaDAO();
	
	public static void salvar(String descricao, int grau) throws Exception{
		if(descricao.isEmpty()) throw new Exception("Descrição é campo obrigatório");
		deficienciaDao.save(new Deficiencia(descricao, grau));
	}
	
	public static ArrayList<Deficiencia> listar() throws Exception{
		return deficienciaDao.getAll();
	}

	public static Deficiencia selecionar(int deficiencia_id) throws Exception{
		
		System.out.println(deficiencia_id);
		return deficienciaDao.get(new Deficiencia(deficiencia_id));
		
	}
	
}
