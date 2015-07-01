package dto;

import java.util.Date;

public class Venda {

	private int id;
	private int pesosa_id;
	private Date data;
	private double valor_total;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPesosa_id() {
		return pesosa_id;
	}
	public void setPesosa_id(int pesosa_id) {
		this.pesosa_id = pesosa_id;
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
