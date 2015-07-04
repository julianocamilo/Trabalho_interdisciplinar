package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="vendas")
public class Venda implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3717694400422744776L;

	@Id
	@Column(name="Id_venda")
	private int id;
	
	//Many to One Pessoa
	//private int pesosa_id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Id_pessoa", referencedColumnName="Id_pessoa")
	private Pessoa pessoa;
	
	
	/*public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}*/
	
	@Column(name="Data")
	private Date data;
	
	@Column(name="Valor_total")
	private double valor_total;
	
	
	public Venda(){}
	
	public Venda(Date data, double valor_total, int pessoa_id, ArrayList<Integer> items_id){
		this.data = data;
		this.valor_total = valor_total;
		
		
		pessoa = new Pessoa(pessoa_id);
		
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getValor_total() {
		return valor_total;
	}
	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}
	
	
	
}
