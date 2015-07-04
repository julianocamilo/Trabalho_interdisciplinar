package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="horarios")
public class Horario {

	@Id
	@Column(name="Id_horario")
	private int id;
	
	@Column(name="Descricao")
	private String descricao;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Id_dia", referencedColumnName="Id_dia")
	private Dia dia;
	
	
	public Horario(){}
	
	public Horario(String descricao, int dia_id){
		this.descricao = descricao;
		this.dia = new Dia(dia_id);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Dia getDia() {
		return dia;
	}
	public void setDia(Dia dia) {
		this.dia = dia;
	}
	
	
	
	
	
}
