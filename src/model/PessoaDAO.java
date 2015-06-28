package model;

import java.util.ArrayList;

import dto.Pessoa;

public class PessoaDAO  implements IDAO<Pessoa>{

	public String INTERDISCIPLINAR_INSERT_PESSOA = "INSERT INTO pessoas " + 
			"(CEP, Logradouro, Nome_social, Nome, etnia_id, religiao_id, sexo_id) VALUES" +
			"({cep}, '{logradouro}', '{nome_social}', '{nome}', '{etnia_id}', '{religiao_id}', '{sexo_id}')";
	
	public void save(Pessoa pessoa) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Pessoa> getAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
