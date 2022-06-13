package servico;

import dao.UsuarioDAO;

public class UsuarioServico {
	UsuarioDAO usuario = new UsuarioDAO();
	
	public boolean excluir(String id) {
		int idUsuario;
		
		idUsuario = Integer.parseInt(id);
		
		return usuario.excluirUsuario(idUsuario);
	}
}
