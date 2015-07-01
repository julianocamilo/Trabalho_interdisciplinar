package app;



public class mainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		EntityManagerFactory factory = null;
		EntityManager em;
		
		try {
			
			
			
			factory = Persistence.createEntityManagerFactory("interdisciplinar");
			
			
			
			em = factory.createEntityManager();
			
			Query query = em.createQuery("select u from Pessoa u "+
										 "where u.nome = :paramName");
			
			query = query.setParameter("paramName", "fernando");
		
			List<Pessoa> res = query.getResultList();
			
			for (Pessoa object : res) {
				
				System.out.println(object.toString());
				
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		finally{
			if (factory != null)
			
				factory.close();	
		}
		*/
		
		
		
		/*
		try {
			//System.out.println("FAZENDO LOGIN.....");
			//Usuario d =GerenciadorUsuario.getUsuario("root", "root");
			//System.out.println(d.getPessoa());
			
			
			
			

			Professor d = new Professor();
			d.setId(RandomHelper.getIntRandom());
			d.setNome("odin");
			d.setNomeSocial("dsmdisjds");

			EntityManagerFactory factory = Persistence.createEntityManagerFactory("interdisciplinar");
			
			EntityManager em = factory.createEntityManager(); 
			    
		    em.getTransaction().begin();    
		    em.persist(d);
		    em.getTransaction().commit();
		    
		    
		    em.close();
		    factory.close();
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ERRO" + e.getMessage());
		}
		
		
		*/
		

	}

}
