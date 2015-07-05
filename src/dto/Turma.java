package dto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="turmas")
public class Turma implements Serializable{

	private static final long serialVersionUID = 7514425153275021368L;

	@Id
	@Column(name="Id_turma")
	private int id;
	
	@Column(name="Capacidade")
	private int capacidade;
	
	@Column(name="Data_fim")
	private Date data_fim;
	
	@Column(name="Data_inicio")
	private Date data_inicio;
	
	@Column(name="Tema")
	private String tema;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Id_curso", referencedColumnName="Id_curso")
	private Curso curso;
	
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "matricula", joinColumns = { @JoinColumn(name = "Id_turma") }, 
			inverseJoinColumns = { @JoinColumn(name = "Id_pessoa") })
	private Set<Aluno> alunos = new HashSet<Aluno>();
	
	
	public Set<Horario> getHorarios() {
		return horarios;
	}
	public void setHorarios(Set<Horario> horarios) {
		this.horarios = horarios;
	}
	public Set<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(Set<Produto> produtos) {
		this.produtos = produtos;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "Horario_Turmas", joinColumns = { @JoinColumn(name = "Id_turma") }, 
			inverseJoinColumns = { @JoinColumn(name = "Id_horario") })
	private Set<Horario> horarios = new HashSet<Horario>();
	
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "Prod_Turmas", joinColumns = { @JoinColumn(name = "Id_turma") }, 
			inverseJoinColumns = { @JoinColumn(name = "Id_item") })
	private Set<Produto> produtos = new HashSet<Produto>();
	
		
	public Turma(){}
	public Turma(int capacidade, Date data_inicio, Date data_fim, String tema, int curso_id, Set<Integer> alunos_id, Set<Integer> horarios_id, Set<Integer> produtos_id){
		
		this.capacidade = capacidade;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.tema = tema;
		this.curso = new Curso(curso_id);
		
		if(alunos_id != null)
			for (Integer aluno_id : alunos_id) {
				this.alunos.add(new Aluno(aluno_id));
			}
		
		if(horarios_id != null)
			for (Integer horario_id : horarios_id) {
				this.horarios.add(new Horario(horario_id));
			}
		
		if (produtos_id != null){
			for (Integer produto_id : produtos_id) {
				this.produtos.add(new Produto(produto_id));
			}
			
		}
		
		
	}
	
	public Turma(int id, int capacidade, Date data_inicio, Date data_fim, String tema, int curso_id, Set<Integer> alunos_id){
		
		this.capacidade = capacidade;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.tema = tema;
		this.curso = new Curso(curso_id);
		
		if(alunos_id == null)return;
		
		
		for (Integer aluno_id : alunos_id) {
			this.alunos.add(new Aluno(aluno_id));
		}
		
	}
	
	
	
	
	
	
	public Set<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public Date getData_fim() {
		return data_fim;
	}
	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}
	public Date getData_inicio() {
		return data_inicio;
	}
	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}
