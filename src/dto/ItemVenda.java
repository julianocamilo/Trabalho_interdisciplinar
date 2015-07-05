package dto;

import java.io.Serializable;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="item_venda")
@AssociationOverrides({
	@AssociationOverride(name="pk.venda", joinColumns=@JoinColumn(name="Id_venda")),
	@AssociationOverride(name="pk.item", joinColumns=@JoinColumn(name="Id_item")) })
public class ItemVenda implements Serializable{

	private static final long serialVersionUID = -5622554388900873849L;
	
	private ItemVendaId pk = new ItemVendaId();
	
	
	private int quantidade;
	
	
	private double valor;
	
	@EmbeddedId
	public ItemVendaId getPk(){
		return pk;
	}
	
	
	public void setPk(ItemVendaId pk) {
		this.pk = pk;
	}

	@Column(name="Quantidade")
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Column(name="Valor_unitario")
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	@Transient
	public Venda getVenda(){
		return getPk().getVenda();
	}
	
	public void setVenda(Venda venda){
		getPk().setVenda(venda);
	}
	
	
	@Transient
	public Item getItem(){
		return getPk().getItem();
	}
	
	public void setItem(Item item){
		getPk().setItem(item);
	}
	
	
}
