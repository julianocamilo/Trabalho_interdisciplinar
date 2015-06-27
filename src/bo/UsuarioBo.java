package bo;

import javax.ejb.Local;
import javax.ejb.Stateless;

import dao.UsuarioDao;

import model.Usuario;

@Stateless
@Local
public class UsuarioBo {
	
	public Usuario userLogin(String login, String senha) throws Exception{
		UsuarioDao userDao = new UsuarioDao();
		Usuario userLogged = userDao.Login(login, senha);		
		return userLogged == null ? null : userLogged;		
	}
	
}
