package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import bo.GerenciadorEtnia;

@ManagedBean
@ViewScoped
public class EtniaController extends ApplicationController {
	private String descricao;
	private String messageError;
	
	public void save() throws Exception{
		this.messageError = "";
		try {
			String message = validate(); 
			if (!message.isEmpty()) {
				throw new Exception(message);
			}
			GerenciadorEtnia.salvar(this.descricao);
		}catch(Exception ex) {						
			super.setMessage("msgError", ex.getMessage());
		}	
	}
	
	private String validate() {
		String message = "";		
		if (descricao.trim().isEmpty())
			message = "Campo descrição é obrigatório";			
		return message;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMessageError() {
		return messageError;
	}

	public void setMessageError(String messageError) {
		this.messageError = messageError;
	} 
		
}
