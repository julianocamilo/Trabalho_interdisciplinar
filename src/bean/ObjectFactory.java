
package bean;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bean package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListarTurmas_QNAME = new QName("http://bean/", "listarTurmas");
    private final static QName _ListarTurmasResponse_QNAME = new QName("http://bean/", "listarTurmasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bean
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarTurmasResponse }
     * 
     */
    public ListarTurmasResponse createListarTurmasResponse() {
        return new ListarTurmasResponse();
    }

    /**
     * Create an instance of {@link ListarTurmas }
     * 
     */
    public ListarTurmas createListarTurmas() {
        return new ListarTurmas();
    }

    /**
     * Create an instance of {@link Aluno }
     * 
     */
    public Aluno createAluno() {
        return new Aluno();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Pessoa }
     * 
     */
    public Pessoa createPessoa() {
        return new Pessoa();
    }

    /**
     * Create an instance of {@link Horario }
     * 
     */
    public Horario createHorario() {
        return new Horario();
    }

    /**
     * Create an instance of {@link ItemVendaId }
     * 
     */
    public ItemVendaId createItemVendaId() {
        return new ItemVendaId();
    }

    /**
     * Create an instance of {@link Deficiencia }
     * 
     */
    public Deficiencia createDeficiencia() {
        return new Deficiencia();
    }

    /**
     * Create an instance of {@link Etnia }
     * 
     */
    public Etnia createEtnia() {
        return new Etnia();
    }

    /**
     * Create an instance of {@link Venda }
     * 
     */
    public Venda createVenda() {
        return new Venda();
    }

    /**
     * Create an instance of {@link ItemVenda }
     * 
     */
    public ItemVenda createItemVenda() {
        return new ItemVenda();
    }

    /**
     * Create an instance of {@link Produto }
     * 
     */
    public Produto createProduto() {
        return new Produto();
    }

    /**
     * Create an instance of {@link Curso }
     * 
     */
    public Curso createCurso() {
        return new Curso();
    }

    /**
     * Create an instance of {@link HorarioPessoaId }
     * 
     */
    public HorarioPessoaId createHorarioPessoaId() {
        return new HorarioPessoaId();
    }

    /**
     * Create an instance of {@link HorarioPessoa }
     * 
     */
    public HorarioPessoa createHorarioPessoa() {
        return new HorarioPessoa();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link Turma }
     * 
     */
    public Turma createTurma() {
        return new Turma();
    }

    /**
     * Create an instance of {@link Sexo }
     * 
     */
    public Sexo createSexo() {
        return new Sexo();
    }

    /**
     * Create an instance of {@link Dia }
     * 
     */
    public Dia createDia() {
        return new Dia();
    }

    /**
     * Create an instance of {@link Religiao }
     * 
     */
    public Religiao createReligiao() {
        return new Religiao();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTurmas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean/", name = "listarTurmas")
    public JAXBElement<ListarTurmas> createListarTurmas(ListarTurmas value) {
        return new JAXBElement<ListarTurmas>(_ListarTurmas_QNAME, ListarTurmas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTurmasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean/", name = "listarTurmasResponse")
    public JAXBElement<ListarTurmasResponse> createListarTurmasResponse(ListarTurmasResponse value) {
        return new JAXBElement<ListarTurmasResponse>(_ListarTurmasResponse_QNAME, ListarTurmasResponse.class, null, value);
    }

}
