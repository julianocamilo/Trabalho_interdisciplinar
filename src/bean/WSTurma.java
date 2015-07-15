package bean;

import java.util.ArrayList;
import java.util.HashMap;

import javax.jws.WebMethod;
import javax.jws.WebService;

import dto.Turma;
import bo.GerenciadorTurma;

@WebService
public class WSTurma {
	
	@WebMethod
	public String[] listarTurmas(){
		
		ArrayList<String> listaTurmas = new ArrayList<String>();
		 
		try {
			ArrayList<Turma> turmas = GerenciadorTurma.listar();
			
			for (Turma turma : turmas) {
			
				String texto = "{id} - {tema} - {curso} - {capacidade}";
				
				texto = texto.replace("{id}", String.valueOf(turma.getId()))
					.replace("{tema}", turma.getTema())
					.replace("{curso}", turma.getCurso().getDescricao())
					.replace("{capacidade}", String.valueOf(turma.getCapacidade()));
				
				listaTurmas.add(texto);
			}
			
		} catch (Exception e) {
			return null;
		}
	
		return listaTurmas.toArray(new String[listaTurmas.size()]);
		
	}
	
	

}
