package controller;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class ApplicationController {
	
	protected void setMessage(String obj,String msg)
	{		
	   FacesMessage message = new FacesMessage(msg);
	   FacesContext.getCurrentInstance().addMessage(obj, message);
	}
}
