package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import bo.GerenciadorDeficiencia;

@ManagedBean
@ViewScoped
public class DeficienciaController extends ApplicationController {
	private String descricao;
	private String grau;
	private String messageError;
	
	public void save() throws Exception{
		this.messageError = "";
		try {
			String message = validate(); 
			if (!message.isEmpty()) {
				throw new Exception(message);
			}
			int grau = Integer.parseInt(this.grau);
			GerenciadorDeficiencia.salvar(this.descricao, grau);
		}catch(Exception ex) {						
			super.setMessage("msgError", ex.getMessage());
		}	
	}	

	private String validate() {
		String message = "";		
		if (descricao.trim().isEmpty())
			message = "Campo descrição é obrigatório";			
		if (grau.trim().isEmpty())
			message = "Campo grau é obrigatório";
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
		
	public String getGrau() {
		return grau;
	}

	public void setGrau(String grau) {
		this.grau = grau;
	}
}
