
package bean;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de horario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="horario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ano" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dia" type="{http://bean/}dia" minOccurs="0"/>
 *         &lt;element name="horarios" type="{http://bean/}horarioPessoa" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="situacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="turmas" type="{http://bean/}turma" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "horario", propOrder = {
    "ano",
    "descricao",
    "dia",
    "horarios",
    "id",
    "situacao",
    "turmas"
})
public class Horario {

    protected int ano;
    protected String descricao;
    protected Dia dia;
    @XmlElement(nillable = true)
    protected List<HorarioPessoa> horarios;
    protected int id;
    protected String situacao;
    @XmlElement(nillable = true)
    protected List<Turma> turmas;

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
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade dia.
     * 
     * @return
     *     possible object is
     *     {@link Dia }
     *     
     */
    public Dia getDia() {
        return dia;
    }

    /**
     * Define o valor da propriedade dia.
     * 
     * @param value
     *     allowed object is
     *     {@link Dia }
     *     
     */
    public void setDia(Dia value) {
        this.dia = value;
    }

    /**
     * Gets the value of the horarios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the horarios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHorarios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HorarioPessoa }
     * 
     * 
     */
    public List<HorarioPessoa> getHorarios() {
        if (horarios == null) {
            horarios = new ArrayList<HorarioPessoa>();
        }
        return this.horarios;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(int value) {
        this.id = value;
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

    /**
     * Gets the value of the turmas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the turmas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTurmas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Turma }
     * 
     * 
     */
    public List<Turma> getTurmas() {
        if (turmas == null) {
            turmas = new ArrayList<Turma>();
        }
        return this.turmas;
    }

}
