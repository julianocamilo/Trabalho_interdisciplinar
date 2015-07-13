
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
 * <p>Classe Java de turma complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="turma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alunos" type="{http://bean/}aluno" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="capacidade" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="curso" type="{http://bean/}curso" minOccurs="0"/>
 *         &lt;element name="data_fim" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="data_inicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="horarios" type="{http://bean/}horario" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="produtos" type="{http://bean/}produto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "turma", propOrder = {
    "alunos",
    "capacidade",
    "curso",
    "dataFim",
    "dataInicio",
    "horarios",
    "id",
    "produtos",
    "tema"
})
public class Turma {

    @XmlElement(nillable = true)
    protected List<Aluno> alunos;
    protected int capacidade;
    protected Curso curso;
    @XmlElement(name = "data_fim")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFim;
    @XmlElement(name = "data_inicio")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicio;
    @XmlElement(nillable = true)
    protected List<Horario> horarios;
    protected int id;
    @XmlElement(nillable = true)
    protected List<Produto> produtos;
    protected String tema;

    /**
     * Gets the value of the alunos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alunos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlunos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aluno }
     * 
     * 
     */
    public List<Aluno> getAlunos() {
        if (alunos == null) {
            alunos = new ArrayList<Aluno>();
        }
        return this.alunos;
    }

    /**
     * Obtém o valor da propriedade capacidade.
     * 
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * Define o valor da propriedade capacidade.
     * 
     */
    public void setCapacidade(int value) {
        this.capacidade = value;
    }

    /**
     * Obtém o valor da propriedade curso.
     * 
     * @return
     *     possible object is
     *     {@link Curso }
     *     
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * Define o valor da propriedade curso.
     * 
     * @param value
     *     allowed object is
     *     {@link Curso }
     *     
     */
    public void setCurso(Curso value) {
        this.curso = value;
    }

    /**
     * Obtém o valor da propriedade dataFim.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFim() {
        return dataFim;
    }

    /**
     * Define o valor da propriedade dataFim.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFim(XMLGregorianCalendar value) {
        this.dataFim = value;
    }

    /**
     * Obtém o valor da propriedade dataInicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicio() {
        return dataInicio;
    }

    /**
     * Define o valor da propriedade dataInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicio(XMLGregorianCalendar value) {
        this.dataInicio = value;
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
     * {@link Horario }
     * 
     * 
     */
    public List<Horario> getHorarios() {
        if (horarios == null) {
            horarios = new ArrayList<Horario>();
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
     * Gets the value of the produtos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the produtos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdutos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Produto }
     * 
     * 
     */
    public List<Produto> getProdutos() {
        if (produtos == null) {
            produtos = new ArrayList<Produto>();
        }
        return this.produtos;
    }

    /**
     * Obtém o valor da propriedade tema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTema() {
        return tema;
    }

    /**
     * Define o valor da propriedade tema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTema(String value) {
        this.tema = value;
    }

}
