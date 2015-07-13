
package bean;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pessoa complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pessoa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cep" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="defis" type="{http://bean/}deficiencia" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="etnia" type="{http://bean/}etnia" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="logradouro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="religiao" type="{http://bean/}religiao" minOccurs="0"/>
 *         &lt;element name="sexo" type="{http://bean/}sexo" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://bean/}usuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pessoa", propOrder = {
    "cep",
    "defis",
    "etnia",
    "id",
    "logradouro",
    "nome",
    "nomeSocial",
    "religiao",
    "sexo",
    "usuario"
})
@XmlSeeAlso({
    Aluno.class
})
public class Pessoa {

    protected int cep;
    @XmlElement(nillable = true)
    protected List<Deficiencia> defis;
    protected Etnia etnia;
    protected int id;
    protected String logradouro;
    protected String nome;
    protected String nomeSocial;
    protected Religiao religiao;
    protected Sexo sexo;
    protected Usuario usuario;

    /**
     * Obtém o valor da propriedade cep.
     * 
     */
    public int getCep() {
        return cep;
    }

    /**
     * Define o valor da propriedade cep.
     * 
     */
    public void setCep(int value) {
        this.cep = value;
    }

    /**
     * Gets the value of the defis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Deficiencia }
     * 
     * 
     */
    public List<Deficiencia> getDefis() {
        if (defis == null) {
            defis = new ArrayList<Deficiencia>();
        }
        return this.defis;
    }

    /**
     * Obtém o valor da propriedade etnia.
     * 
     * @return
     *     possible object is
     *     {@link Etnia }
     *     
     */
    public Etnia getEtnia() {
        return etnia;
    }

    /**
     * Define o valor da propriedade etnia.
     * 
     * @param value
     *     allowed object is
     *     {@link Etnia }
     *     
     */
    public void setEtnia(Etnia value) {
        this.etnia = value;
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
     * Obtém o valor da propriedade logradouro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * Define o valor da propriedade logradouro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogradouro(String value) {
        this.logradouro = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade nomeSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeSocial() {
        return nomeSocial;
    }

    /**
     * Define o valor da propriedade nomeSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeSocial(String value) {
        this.nomeSocial = value;
    }

    /**
     * Obtém o valor da propriedade religiao.
     * 
     * @return
     *     possible object is
     *     {@link Religiao }
     *     
     */
    public Religiao getReligiao() {
        return religiao;
    }

    /**
     * Define o valor da propriedade religiao.
     * 
     * @param value
     *     allowed object is
     *     {@link Religiao }
     *     
     */
    public void setReligiao(Religiao value) {
        this.religiao = value;
    }

    /**
     * Obtém o valor da propriedade sexo.
     * 
     * @return
     *     possible object is
     *     {@link Sexo }
     *     
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * Define o valor da propriedade sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link Sexo }
     *     
     */
    public void setSexo(Sexo value) {
        this.sexo = value;
    }

    /**
     * Obtém o valor da propriedade usuario.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Define o valor da propriedade usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuario(Usuario value) {
        this.usuario = value;
    }

}
