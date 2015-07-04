package bo;


import java.util.ArrayList;


import model.ProdutoDAO;
import model.IDAO;
import dto.Produto;



public class GerenciadorProduto {

	
	private static IDAO<Produto> produtoDao = new ProdutoDAO();
	
	public static void salvar(String descricao, double valor, int quantidade, String local) throws Exception{
		if (descricao.isEmpty()) throw new Exception("Descrição é obrigatório.");
		if (local.isEmpty()) throw new Exception("Local é obrigatório.");
		produtoDao.save(new Produto(descricao, valor, quantidade, local));
		
		//session = HibernateUtil.getSessionFactory().openSession();
		
		/*
		System.out.println("parte1");
		
		
		EntityManager em = HibernateHelper.getFactory2();
		 em.getTransaction().begin(); 
		Item item = new Item(666,"teste", 666);
		  
		 
		   
		
		em.persist(item);
		
		Estoque estoque = new Estoque(666, 10, "testelocal");
		estoque.setItem(item);
		
		em.persist(estoque);


	    em.getTransaction().commit();
		em.close();*/
		
		/*Session session = HibernateUtil.getSessionFactory().openSession();
		
		System.out.println("parte2");
		
		session.beginTransaction();
	
		System.out.println("part3");
		
		Item item = new Item(668,"teste", 666);
		session.save(item);
		
	
		System.out.println("parte4");
		
		Estoque estoque = new Estoque(668, 10, "testelocal");
		//estoque.setItem(item);
		
		System.out.println("parte5");
		
		session.save(estoque);
		session.getTransaction().commit();
		
		
		*/
		
		
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
	
	
	
	
	
	
}
