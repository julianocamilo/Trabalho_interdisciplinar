package bo;

import javax.ejb.Local;
import javax.ejb.Stateless;

import model.IDAO;
import model.UsuarioDAO;
import dto.Curso;
import dto.Usuario;

@Stateless
@Local
public class GerenciadorUsuario {
	
	
	private static IDAO<Usuario> usuarioDao = new UsuarioDAO();
	
	public static Usuario getUsuario(String login, String senha) throws Exception{
	
		Usuario usuarioDto = new Usuario(login, senha);
		return usuarioDao.get(usuarioDto);
	}
	
	public static void salvar(String login, String senha, int id_pessoa) throws Exception{		
		if(login.isEmpty()) throw new Exception("Descrição é campo obrigatório");
		if(senha.isEmpty()) throw new Exception("Senha é campo obrigatório");
		if((String.valueOf(id_pessoa)).isEmpty()) throw new Exception("id pessoa é campo obrigatório");
		//UsuarioDAO.save(new Usuario(login, senha, id_pessoa));
	}	
	
	
	
}

	
