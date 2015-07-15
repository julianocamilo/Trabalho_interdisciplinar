package bo;

import java.util.ArrayList;

import javax.ejb.Local;
import javax.ejb.Stateless;
import model.ProdutoDAO;
import model.IDAO;
import dto.Produto;

@Stateless
@Local
public class GerenciadorProduto {

	
	private static IDAO<Produto> produtoDao = new ProdutoDAO();
	
	public static void salvar(String descricao, double valor, int quantidade, String local) throws Exception{
		if (descricao.isEmpty()) throw new Exception("Descrição é obrigatório.");
		if (local.isEmpty()) throw new Exception("Local é obrigatório.");
		produtoDao.save(new Produto(descricao, valor, quantidade, local));
	}
	
	public static ArrayList<Produto> listar() throws Exception{
		return produtoDao.getAll();
	}
	
	
	public static ArrayList<Produto> listarDisponiveis() throws Exception{
		ProdutoDAO d = (ProdutoDAO) produtoDao;
		return d.getAvailables();
	}
	
	public static void atualizar(Produto produto) throws Exception{
		ProdutoDAO estoqueDao2 = (ProdutoDAO) produtoDao;
		estoqueDao2.update(produto);
	} 
	
	
	public static Produto selecionar(int item_id)throws Exception{
		return produtoDao.get(new Produto(item_id));
	}
	
	
	
}
