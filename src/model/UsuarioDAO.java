package model;

import helper.HibernateHelper;
import java.util.ArrayList;
import java.util.HashMap;



import dto.Usuario;

public class UsuarioDAO extends HibernateHelper<Usuario> implements IDAO<Usuario>{

	public void save(Usuario usuario) throws Exception {
		executar(usuario);
	}

	public ArrayList<Usuario> getAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario get(Usuario obj) throws Exception {
		
		HashMap<String, Object> args = new HashMap<String, Object>();

		String query_string = "SELECT u from Usuario u " +
				"WHERE u.login = :paramLogin and :paramSenha = :paramSenha";

		args.put("paramLogin", obj.getLogin());
		args.put("paramSenha", obj.getSenha());
		
		ArrayList<Usuario> users =  (ArrayList<Usuario>) consultar(query_string, args);
		
		if(users.isEmpty()) return null;
			
		return users.get(0);
	}
	
}
