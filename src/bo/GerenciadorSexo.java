package bo;

import java.util.ArrayList;

import javax.ejb.Local;
import javax.ejb.Stateless;

import dto.Sexo;
import model.IDAO;
import model.SexoDAO;

@Stateless
@Local
public class GerenciadorSexo{

	private static IDAO<Sexo> sexoDao = new SexoDAO();
	
	public static void salvar(String descricao) throws Exception{
		
		if(descricao.isEmpty()) throw new Exception("Descri��o � campo obrigat�rio");
		sexoDao.save(new Sexo(descricao));
	}
	
	public static ArrayList<Sexo> listar() throws Exception{
		return sexoDao.getAll();
	}
	
	
}
