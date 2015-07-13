
package bean;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSTurma", targetNamespace = "http://bean/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSTurma {


    /**
     * 
     * @return
     *     returns java.util.List<bean.Turma>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarTurmas", targetNamespace = "http://bean/", className = "bean.ListarTurmas")
    @ResponseWrapper(localName = "listarTurmasResponse", targetNamespace = "http://bean/", className = "bean.ListarTurmasResponse")
    @Action(input = "http://bean/WSTurma/listarTurmasRequest", output = "http://bean/WSTurma/listarTurmasResponse")
    public List<Turma> listarTurmas();

}
