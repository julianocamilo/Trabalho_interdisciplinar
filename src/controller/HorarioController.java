package controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dto.Dia;
import dto.TipoFiliacao;
import bo.GerenciadorDia;
import bo.GerenciadorEtnia;
import bo.GerenciadorHorario;

@ManagedBean
@ViewScoped
public class HorarioController extends ApplicationController {
	private String descricao;
	private String id_dia;
	private String messageError;
	
	public void save() throws Exception{
		this.messageError = "";
		try {
			String message = validate(); 
			if (!message.isEmpty()) {
				throw new Exception(message);
			}
			GerenciadorHorario.salvar(this.descricao,Integer.parseInt(id_dia));
		}catch(Exception ex) {						
			super.setMessage("msgError", ex.getMessage());
		}	
	}
	
	private String validate() {
		String message = "";		
		if (descricao.trim().isEmpty())
			message = "Campo descrição é obrigatório";
		else if (id_dia.trim().isEmpty())
			message = "Campo id dia é obrigatório";
		return message;
	}
	
	private static Map<String,Object> hashDia() throws Exception {
		//ArrayList<Dia> diaArray = (new GerenciadorDia()).listar();
		ArrayList<Dia> diaArray = new ArrayList<Dia>();
		Dia dia = new Dia();
		dia.setDescricao("Segunda");
		dia.setId(1);
		diaArray.add(dia);
		
		Dia dia2 = new Dia();
		dia2.setDescricao("Terça");
		dia2.setId(2);
		diaArray.add(dia2);
		
		Map<String,Object> hashDia = new LinkedHashMap<String,Object>();
		for (int i=0; i< diaArray.size(); i++) {			
			hashDia.put(diaArray.get(i).getDescricao(), diaArray.get(i).getId()); //label, value			
		}		
		return hashDia;
	}
 
	public Map<String,Object> getDia() throws Exception {
		return hashDia();
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

	public String getId_dia() {
		return id_dia;
	}

	public void setId_dia(String id_dia) {
		this.id_dia = id_dia;
	} 
		
}
