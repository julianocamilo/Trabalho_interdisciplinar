
package bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de horarioPessoaId complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="horarioPessoaId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="horario" type="{http://bean/}horario" minOccurs="0"/>
 *         &lt;element name="pessoa" type="{http://bean/}pessoa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "horarioPessoaId", propOrder = {
    "horario",
    "pessoa"
})
public class HorarioPessoaId {

    protected Horario horario;
    protected Pessoa pessoa;

    /**
     * Obtém o valor da propriedade horario.
     * 
     * @return
     *     possible object is
     *     {@link Horario }
     *     
     */
    public Horario getHorario() {
        return horario;
    }

    /**
     * Define o valor da propriedade horario.
     * 
     * @param value
     *     allowed object is
     *     {@link Horario }
     *     
     */
    public void setHorario(Horario value) {
        this.horario = value;
    }

    /**
     * Obtém o valor da propriedade pessoa.
     * 
     * @return
     *     possible object is
     *     {@link Pessoa }
     *     
     */
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * Define o valor da propriedade pessoa.
     * 
     * @param value
     *     allowed object is
     *     {@link Pessoa }
     *     
     */
    public void setPessoa(Pessoa value) {
        this.pessoa = value;
    }

}
