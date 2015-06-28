package bo;

import java.util.ArrayList;

import dto.Pessoa;

public class GerenciadorPessoa {
	
	
	public Pessoa getPessoa(int pessoa_id){
		return null;
	}
	
	public void salvarPessoa(String nomeSocial, int sexo_id, int etnia_id, int religiao_id, ArrayList<Integer> deficiencias_id, int dia_id ) throws Exception{
		
		if(nomeSocial.isEmpty())
			throw new Exception("Nome social obrigatório");
	}
	
	
	public void salvarProfessor(String nomeSocial, int sexo_id, int etnia_id, int religiao_id, ArrayList<Integer> deficiencias_id, int dia_id ){
		
		
		
		
		
	}
	

}
