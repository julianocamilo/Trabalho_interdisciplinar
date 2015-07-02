package bo;

import java.util.ArrayList;
import java.util.Date;

import model.IDAO;
import model.VendaDAO;
import dto.Venda;

public class GerenciadorVenda {

	
	private static IDAO<Venda> VendaDao = new VendaDAO();
	
	public static void salvar(Date data, double valor, int pessoa_id, ArrayList<Integer> itens_id) throws Exception{
		
		VendaDao.save(new Venda(data, valor,pessoa_id, itens_id));
	}
	
	public static ArrayList<Venda> listar() throws Exception{
		return VendaDao.getAll();
	}
	
	
}
