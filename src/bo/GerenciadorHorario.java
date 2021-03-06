package bo;

import java.util.ArrayList;

import javax.ejb.Local;
import javax.ejb.Stateless;

import dto.Horario;
import model.IDAO;
import model.HorarioDAO;

@Stateless
@Local
public class GerenciadorHorario{

	private static IDAO<Horario> HorarioDao = new HorarioDAO();
	
	public static void salvar(String descricao, int dia_id) throws Exception{
		
		if(descricao.isEmpty()) throw new Exception("Descri��o � campo obrigat�rio");
		HorarioDao.save(new Horario(descricao, dia_id));
	}
	
	public static ArrayList<Horario> listar() throws Exception{
		return HorarioDao.getAll();
	}
	
	
	public static Horario selecionar(int horario_id)throws Exception{
		return HorarioDao.get(new Horario(horario_id));
	}
	
	
}
