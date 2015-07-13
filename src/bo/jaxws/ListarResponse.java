
package bo.jaxws;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "listarResponse", namespace = "http://bo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarResponse", namespace = "http://bo/")
public class ListarResponse {

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
