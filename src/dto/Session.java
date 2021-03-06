package dto;

import java.io.IOException;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

public class Session {
	private static Session instance;
	
	private Session() {
		
	}
	
	public static Session getInstance() {		
		return instance == null ? instance = new Session() : instance;		
	}
	
	private ExternalContext currentExternalContext() {
		if (FacesContext.getCurrentInstance() == null) {
			throw new RuntimeException("O FacesContext n�o pode ser chamado");
		} else {
			return FacesContext.getCurrentInstance().getExternalContext();
		}
	}
	
	public Object getAttribute(String nome){
        return currentExternalContext().getSessionMap().get(nome);
    }
	
	public void setAttribute(String nome, Object valor) {
		currentExternalContext().getSessionMap().put(nome, valor);
	}
		
	public String getUsuarioLogado() {
		return  getAttribute("username").toString();
	}
	
	public void setUsuarioLogado(String usuario) {
        setAttribute("username", usuario);
    }
	
	public void encerrarSessao() throws IOException {   
        currentExternalContext().invalidateSession();
        FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
    }
	
}
