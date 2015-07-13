
package bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de itemVendaId complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="itemVendaId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" type="{http://bean/}item" minOccurs="0"/>
 *         &lt;element name="venda" type="{http://bean/}venda" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemVendaId", propOrder = {
    "item",
    "venda"
})
public class ItemVendaId {

    protected Item item;
    protected Venda venda;

    /**
     * Obtém o valor da propriedade item.
     * 
     * @return
     *     possible object is
     *     {@link Item }
     *     
     */
    public Item getItem() {
        return item;
    }

    /**
     * Define o valor da propriedade item.
     * 
     * @param value
     *     allowed object is
     *     {@link Item }
     *     
     */
    public void setItem(Item value) {
        this.item = value;
    }

    /**
     * Obtém o valor da propriedade venda.
     * 
     * @return
     *     possible object is
     *     {@link Venda }
     *     
     */
    public Venda getVenda() {
        return venda;
    }

    /**
     * Define o valor da propriedade venda.
     * 
     * @param value
     *     allowed object is
     *     {@link Venda }
     *     
     */
    public void setVenda(Venda value) {
        this.venda = value;
    }

}
