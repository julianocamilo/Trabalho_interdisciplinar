
package bean.jaxws;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "listarTurmasResponse", namespace = "http://bean/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarTurmasResponse", namespace = "http://bean/")
public class ListarTurmasResponse {

    @XmlElement(name = "return", namespace = "")
    private ArrayList<dto.Turma> _return;

    /**
     * 
     * @return
     *     returns ArrayList<Turma>
     */
    public ArrayList<dto.Turma> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(ArrayList<dto.Turma> _return) {
        this._return = _return;
    }

}
