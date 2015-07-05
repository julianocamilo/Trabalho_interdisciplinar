package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="horarios")
public class Horario implements Serializable{

	private static final long serialVersionUID = -8660691480916988837L;

	@Id
	@Column(name="Id_horario")
	private int id;
	
	@Column(name="Descricao")
	private String descricao;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Id_dia", referencedColumnName="Id_dia")
	private Dia dia;
	
	
	@ManyToMany(mappedBy="horarios")
    private List<Turma> turmas = new ArrayList<Turma>();
	
	@OneToMany(mappedBy = "horarioPessoaPk.horario", cascade = CascadeType.ALL)
	private Set<HorarioPessoa> horarios = new HashSet<HorarioPessoa>();
	
	
	@Transient
	private int ano;
	
	@Transient
	private String situacao;
	
	
	
	
	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	public Set<HorarioPessoa> getHorarios() {
		return horarios;
	}

	public void setHorarios(Set<HorarioPessoa> horarios) {
		this.horarios = horarios;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Horario(){}
	
	public Horario(int id){
		this.id = id;
	}
	
	public Horario(String descricao, int dia_id){
		this.descricao = descricao;
		this.dia = new Dia(dia_id);
	}
	
	
	public Horario(int id, String descricao, int dia_id){
		this.id = id;
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
