package dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class ItemVendaId implements Serializable {

	private static final long serialVersionUID = -7026488319057616722L;
	
	private Venda venda;
	private Item item;

	@ManyToOne(cascade = CascadeType.ALL)
	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

	
	
}
