package bo;

import java.util.ArrayList;

import javax.ejb.Local;
import javax.ejb.Stateless;

import model.TipoFiliacaoDAO;
import model.IDAO;
import dto.TipoFiliacao;

@Stateless
@Local
public class GerenciadorTipoFiliacao {

	private static IDAO<TipoFiliacao> TipoFiliacaoDao = new TipoFiliacaoDAO();
	
	public static void salvar(String descricao) throws Exception{
		if(descricao.isEmpty()) throw new Exception("Descrição é campo obrigatório");
		TipoFiliacaoDao.save(new TipoFiliacao(descricao));
	}
	
	public static ArrayList<TipoFiliacao> listar() throws Exception{
		return TipoFiliacaoDao.getAll();
	}
	
}
