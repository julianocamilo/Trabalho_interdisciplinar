package bo;

import java.util.ArrayList;

import dto.Horario;
import model.IDAO;
import model.HorarioDAO;

public class GerenciadorHorario{

	private static IDAO<Horario> HorarioDao = new HorarioDAO();
	
	public static void salvar(String descricao, int dia_id) throws Exception{
		
		if(descricao.isEmpty()) throw new Exception("Descrição é campo obrigatório");
		HorarioDao.save(new Horario(descricao, dia_id));
	}
	
	public static ArrayList<Horario> listar() throws Exception{
		return HorarioDao.getAll();
	}
	
	
}
