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
@Table(name="horario_pessoas")
@AssociationOverrides({
	@AssociationOverride(name="horarioPessoaPk.pessoa", joinColumns=@JoinColumn(name="Id_pessoa")),
	@AssociationOverride(name="horarioPessoaPk.horario", joinColumns=@JoinColumn(name="Id_horario")) })
public class HorarioPessoa implements Serializable{

	private static final long serialVersionUID = -7919670261670353478L;

	private HorarioPessoaId horarioPessoaPk = new HorarioPessoaId();
	private int ano;
	private String situacao;
	
	@EmbeddedId
	public HorarioPessoaId getHorarioPessoaPk() {
		return horarioPessoaPk;
	}
	public void setHorarioPessoaPk(HorarioPessoaId horarioPessoaPk) {
		this.horarioPessoaPk = horarioPessoaPk;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Transient
	public Pessoa getPessoa(){
		return getHorarioPessoaPk().getPessoa();
	}
	
	public void setPessoa(Pessoa pessoa){
		getHorarioPessoaPk().setPessoa(pessoa);
	}
	
	@Transient
	public Horario getHorario(){
		return getHorarioPessoaPk().getHorario();
	}
	
	
	public void setHorario(Horario horario){
		getHorarioPessoaPk().setHorario(horario);
	}
	
	
	@Column(name="Ano")
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	@Column(name="Situacao")
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	

	
	
}
