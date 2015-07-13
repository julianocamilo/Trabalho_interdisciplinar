
package bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de horarioPessoa complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="horarioPessoa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ano" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="horario" type="{http://bean/}horario" minOccurs="0"/>
 *         &lt;element name="horarioPessoaPk" type="{http://bean/}horarioPessoaId" minOccurs="0"/>
 *         &lt;element name="pessoa" type="{http://bean/}pessoa" minOccurs="0"/>
 *         &lt;element name="situacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "horarioPessoa", propOrder = {
    "ano",
    "horario",
    "horarioPessoaPk",
    "pessoa",
    "situacao"
})
public class HorarioPessoa {

    protected int ano;
    protected Horario horario;
    protected HorarioPessoaId horarioPessoaPk;
    protected Pessoa pessoa;
    protected String situacao;

    /**
     * Obtém o valor da propriedade ano.
     * 
     */
    public int getAno() {
        return ano;
    }

    /**
     * Define o valor da propriedade ano.
     * 
     */
    public void setAno(int value) {
        this.ano = value;
    }

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
     * Obtém o valor da propriedade horarioPessoaPk.
     * 
     * @return
     *     possible object is
     *     {@link HorarioPessoaId }
     *     
     */
    public HorarioPessoaId getHorarioPessoaPk() {
        return horarioPessoaPk;
    }

    /**
     * Define o valor da propriedade horarioPessoaPk.
     * 
     * @param value
     *     allowed object is
     *     {@link HorarioPessoaId }
     *     
     */
    public void setHorarioPessoaPk(HorarioPessoaId value) {
        this.horarioPessoaPk = value;
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

    /**
     * Obtém o valor da propriedade situacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * Define o valor da propriedade situacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacao(String value) {
        this.situacao = value;
    }

}
