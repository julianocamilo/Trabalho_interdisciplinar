package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import bo.GerenciadorUsuario;

@ManagedBean
@ViewScoped
public class UsuarioController extends ApplicationController {
	private String login;
	private String senha;
	private String id_pessoa;
	private String messageError;
	
	public void save() throws Exception{
		this.messageError = "";
		try {
			String message = validate(); 
			if (!message.isEmpty()) {
				throw new Exception(message);
			}
			GerenciadorUsuario.salvar(this.login, this.senha, Integer.parseInt(this.id_pessoa));
		}catch(Exception ex) {						
			super.setMessage("msgError", ex.getMessage());
		}	
	}
	
	private String validate() {
		String message = "";		
		if (this.login.trim().isEmpty())
			message = "Campo login é obrigatório";
		else if (this.senha.trim().isEmpty())
			message = "Campo senha é obrigatório";
		else if (this.id_pessoa.trim().isEmpty())
			message = "Campo id pessoa é obrigatório";
		
		return message;
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

	public String getId_pessoa() {
		return id_pessoa;
	}

	public String getMessageError() {
		return messageError;
	}

	public void setMessageError(String messageError) {
		this.messageError = messageError;
	}

	public void setId_pessoa(String id_pessoa) {
		this.id_pessoa = id_pessoa;
	}
	
	
}

