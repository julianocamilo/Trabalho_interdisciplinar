package bo;

import java.util.ArrayList;
import java.util.Date;

import javax.ejb.Local;
import javax.ejb.Stateless;

import model.IDAO;
import model.ItemVendaDAO;
import model.VendaDAO;
import dto.Item;
import dto.ItemVenda;
import dto.Produto;
import dto.Venda;

@Stateless
@Local
public class GerenciadorVenda {

	
	private static IDAO<Venda> VendaDao = new VendaDAO();
	private static IDAO<ItemVenda> itemVendaDao = new ItemVendaDAO();
	
	public static void salvar(Date data, double valor, int pessoa_id, ArrayList<Item> itens) throws Exception{
		
		VendaDao.save(new Venda(data, valor,pessoa_id));
		
		VendaDAO vdao = (VendaDAO) VendaDao;
		
		int venda_id = vdao.getId_created();
		
		if(itens!=null)
			
			for (Item item : itens) {
				
				
				if(item.getQuantidadeSolicitada() > 0){
					Produto produto = GerenciadorProduto.selecionar(item.getId());
					int quantidadeEstoque = produto.getQuantidade();
					if (quantidadeEstoque < item.getQuantidadeSolicitada())
						throw new Exception(item.getId() + " - No estoque há apenas " + quantidadeEstoque + " produtos disponiveis");
						//continue;
					produto.setQuantidade(quantidadeEstoque - item.getQuantidadeSolicitada());
					GerenciadorProduto.atualizar(produto);
				}
				
				
				ItemVenda itemVenda = new ItemVenda();
				itemVenda.setVenda(new Venda(venda_id));
				itemVenda.setItem(item);
				itemVenda.setValor(item.getValor());
				itemVenda.setQuantidade(item.getQuantidadeSolicitada());
				itemVendaDao.save(itemVenda);
			}
			
			
		
	}
	
	public static ArrayList<Venda> listar() throws Exception{
		return VendaDao.getAll();
	}
	
	public static Venda selecionar(int venda_id)throws Exception{
		return VendaDao.get(new Venda(venda_id));
	}
	
	
}
