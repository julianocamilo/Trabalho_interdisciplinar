
package bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de aluno complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="aluno">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean/}pessoa">
 *       &lt;sequence>
 *         &lt;element name="fpagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aluno", propOrder = {
    "fpagamento"
})
public class Aluno
    extends Pessoa
{

    protected String fpagamento;

    /**
     * Obtém o valor da propriedade fpagamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpagamento() {
        return fpagamento;
    }

    /**
     * Define o valor da propriedade fpagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpagamento(String value) {
        this.fpagamento = value;
    }

}
