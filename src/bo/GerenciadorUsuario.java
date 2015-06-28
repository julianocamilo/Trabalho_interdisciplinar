package bo;

import javax.ejb.Local;
import javax.ejb.Stateless;

import dao.UsuarioDao;
import dto.Usuario;

@Stateless
@Local
public class GerenciadorUsuario {
	
	public static Usuario getUsuario(String login, String senha){
		return null;
		
		
	}
	
	public static boolean autenticar(String login, String senha) throws Exception{
		UsuarioDao userDao = new UsuarioDao();
		Usuario userLogged = userDao.Login(login, senha);		
		return true;		
	}
	
}

	
