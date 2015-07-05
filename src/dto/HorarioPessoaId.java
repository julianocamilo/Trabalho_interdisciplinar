package dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class HorarioPessoaId  implements Serializable{

	private static final long serialVersionUID = 467111091606032127L;
	
	
	private Pessoa pessoa;
	private Horario horario;
	
	
	@ManyToOne(cascade= CascadeType.ALL)
	public Horario getHorario() {
		return horario;
	}
	
	public void setHorario(Horario horario) {
		this.horario = horario;
	}
	
	@ManyToOne(cascade=CascadeType.ALL)
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	
	
	
}
