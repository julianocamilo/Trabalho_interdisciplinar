package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import bo.GerenciadorProduto;

@ManagedBean
@ViewScoped
public class ProdutoController extends ApplicationController {
	private String descricao;
	private String valor = "0.00";
	private String quantidade = "0";
	private String local;
	private String messageError;
	
	public void save() throws Exception{
		this.messageError = "";
		try {
			String message = validate(); 
			if (!message.isEmpty()) {
				throw new Exception(message);
			}
			double valor = this.valor.trim().isEmpty() ? 0.00 : Double.parseDouble(this.valor.trim());
			int quantidade= this.quantidade.trim().isEmpty() ? 0 : Integer.parseInt(this.quantidade.trim());
			GerenciadorProduto.salvar(this.descricao, valor, quantidade, this.local);
			super.setMessage("msgError", "Cadastrado com sucesso");
		}catch(Exception ex) {						
			super.setMessage("msgError", ex.getMessage());
		}	
	}	

	private String validate() {
		String message = "";		
		if (descricao.trim().isEmpty())
			message = "Campo descrição é obrigatório";			
		if (local.trim().isEmpty())
			message = "Campo local é obrigatório";
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

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	} 
		
}
