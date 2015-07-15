package controller;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import dto.Session; 
import dto.Usuario;
import bo.GerenciadorUsuario;


@ManagedBean
@SessionScoped
public class SessionController  extends ApplicationController{
	private String login;
	private String senha;
	private String messageError;
	
	public void accesslogin() throws Exception {
		this.messageError = "";
		try {

			Usuario user = GerenciadorUsuario.getUsuario(login, senha);
			if (user == null) {	
				throw new Exception("incorrect user or password");
			}
			else
			{
				Session.getInstance().setAttribute("username", user.getLogin());			
			}
			FacesContext.getCurrentInstance().getExternalContext().redirect("home.xhtml");
		} catch(Exception ex) {			
			super.setMessage("msgError", ex.getMessage());
		}		
	}
	
	public void logout() throws IOException {
		Session.getInstance().encerrarSessao();		
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
