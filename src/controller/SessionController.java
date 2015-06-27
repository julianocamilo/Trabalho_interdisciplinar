package controller;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import model.Session; 

import model.Usuario;
import bo.UsuarioBo;

@ManagedBean
@SessionScoped
public class SessionController {
	@EJB
	UsuarioBo userBo;
	private String login;
	private String senha;
	private String messageError;
	
	public Usuario getUsuario() {
		return Session.getInstance().getUsuarioLogado();	
	}
	
	public void login() throws Exception {
		try {
			Usuario user = userBo.userLogin(login, senha);
			if (user == null) {
				FacesContext.getCurrentInstance().validationFailed();
				throw new Exception("Usuario incorreto");
			}
			else
			{
				Session.getInstance().setAttribute("usuarioLogado", user);			
			}
		} catch(Exception ex) {
			this.messageError = "";
			this.setMessage("Mensagem de erro", ex.getMessage());
		}		
	}
	
	private void setMessage(String obj,String msg)
	{		
	   FacesMessage message = new FacesMessage(msg);
	   FacesContext.getCurrentInstance().addMessage(obj, message);
	}

	public UsuarioBo getUserBo() {
		return userBo;
	}

	public void setUserBo(UsuarioBo userBo) {
		this.userBo = userBo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getMessageError() {
		return messageError;
	}

	public void setMessageError(String messageError) {
		this.messageError = messageError;
	}
	
}
