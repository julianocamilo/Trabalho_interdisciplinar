package bean;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public class NotaBeanWS {

	
	
	@WebMethod
	public String retornarOi(){
		return "Oi";
		
	}
	
	
	
	
}
