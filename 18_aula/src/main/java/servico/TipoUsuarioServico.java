package servico;

import java.util.List;

import dao.TipoUsuarioDAO;
import modelo.TipoUsuario;

public class TipoUsuarioServico {
	TipoUsuarioDAO dao = new TipoUsuarioDAO();

	public List<TipoUsuario> listar(){
		return dao.listar();
	}
}
