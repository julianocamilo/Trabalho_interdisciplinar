package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import bo.GerenciadorServico;

@ManagedBean
@ViewScoped
public class ServicoController extends ApplicationController {
	private String descricao;
	private String valor = "0.00";
	private String especificacao;
	private String duracao = "0";
	private String messageError;
	
	public void save() throws Exception{
		this.messageError = "";
		try {
			String message = validate(); 
			if (!message.isEmpty()) {
				throw new Exception(message);
			}
			double valor = this.valor.trim().isEmpty() ? 0.00 : Double.parseDouble(this.valor.trim());
			int duracao= this.duracao.trim().isEmpty() ? 0 : Integer.parseInt(this.duracao.trim());
			GerenciadorServico.salvar(this.descricao, valor, this.especificacao, duracao);
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

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
		
}
