package helper;


import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;



public class HibernateHelper<T>{

	
	private EntityManagerFactory factory;
	
	
	public static EntityManager getFactory2(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("interdisciplinar");
		return factory.createEntityManager();
	}
	
	private EntityManager getFactory(){
		
		factory = Persistence.createEntityManagerFactory("interdisciplinar");
		return factory.createEntityManager();
	}
	
	private void closeFactory(){
		factory.close();
	}
	
	
	protected void executar(T obj) throws Exception{
		
		EntityManager em =  this.getFactory();
		em.getTransaction().begin();   
	    em.persist(obj);
	    em.getTransaction().commit();
	    em.close();
	    closeFactory();
	}
	
	
	protected void atualizar(T obj) throws Exception{
		
		EntityManager em =  this.getFactory();
		em.getTransaction().begin(); 
		em.merge(obj);
		em.getTransaction().commit();
		em.close();
	}
	
	
	
	//APENAS TESTE
	protected void executarTeste(T obj) throws Exception{
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(obj);
		
		session.getTransaction().commit();
		session.close();
		
		
	}
	
	

	protected Collection<T> consultar(String query_string, HashMap<String, Object> args) throws Exception{
		
		
		EntityManager em =  this.getFactory();
		Query query = em.createQuery(query_string);
	    
	    
		for(Entry<String, Object> entry : args.entrySet()) {
		    String key = entry.getKey();
		    Object value = entry.getValue();
		    
		    query = query.setParameter(key, value);
		}		
		
		List<T> res = query.getResultList();
		em.close();
		closeFactory();
		return res;
		
		
	}
	
	
	protected T selecionar(T obj) throws Exception{
		
		EntityManager em =  this.getFactory();
		T obj_encontrado = (T) em.find(obj.getClass() , obj);
		return obj_encontrado;
	}
	
	
}
	

