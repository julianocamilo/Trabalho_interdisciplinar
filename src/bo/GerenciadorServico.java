package bo;


import java.util.ArrayList;



import model.ServicoDAO;
import model.IDAO;
import dto.Servico;
import dto.Venda;



public class GerenciadorServico {

	
	private static IDAO<Servico> servicoDao = new ServicoDAO();
	
	public static void salvar(String descricao, double valor, String especificacao, int duracao) throws Exception{
		if (descricao.isEmpty()) throw new Exception("Descrição é obrigatório.");
		servicoDao.save(new Servico(descricao, valor, especificacao, duracao));
	}
	
	public static ArrayList<Servico> listar() throws Exception{
		return servicoDao.getAll();
	}
	
	
	
	public static void atualizar(Servico Servico) throws Exception{
		ServicoDAO estoqueDao2 = (ServicoDAO) servicoDao;
		estoqueDao2.update(Servico);
	} 
	
	
	public static Servico selecionar(int item_id)throws Exception{
		return servicoDao.get(new Servico(item_id));
	}
	
	
	
	
}
