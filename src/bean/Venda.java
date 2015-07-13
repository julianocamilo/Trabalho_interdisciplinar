
package bean;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de venda complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="venda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemvendas" type="{http://bean/}itemVenda" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pessoa" type="{http://bean/}pessoa" minOccurs="0"/>
 *         &lt;element name="valor_total" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "venda", propOrder = {
    "data",
    "id",
    "itemvendas",
    "pessoa",
    "valorTotal"
})
public class Venda {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    protected int id;
    @XmlElement(nillable = true)
    protected List<ItemVenda> itemvendas;
    protected Pessoa pessoa;
    @XmlElement(name = "valor_total")
    protected double valorTotal;

    /**
     * Obtém o valor da propriedade data.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Define o valor da propriedade data.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
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
     * Gets the value of the itemvendas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemvendas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemvendas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemVenda }
     * 
     * 
     */
    public List<ItemVenda> getItemvendas() {
        if (itemvendas == null) {
            itemvendas = new ArrayList<ItemVenda>();
        }
        return this.itemvendas;
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
     * Obtém o valor da propriedade valorTotal.
     * 
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * Define o valor da propriedade valorTotal.
     * 
     */
    public void setValorTotal(double value) {
        this.valorTotal = value;
    }

}
