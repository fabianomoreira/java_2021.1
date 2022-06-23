package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.TipoUsuario;

public class TipoUsuarioDAO {
	Connection cnx = null;
	
	public List<TipoUsuario> listar(){
		List<TipoUsuario> listaDeTiposDeUsuarios = new ArrayList<TipoUsuario>();
		ResultSet rs = null;
		TipoUsuario tipoUsuario = null;
		
		cnx = DAO.createConnection();
		
		String sql = "SELECT * FROM tb_tipousuario";
		
		try {
			PreparedStatement ps = cnx.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				tipoUsuario = new TipoUsuario();
				
				tipoUsuario.setId(rs.getInt("id"));
				tipoUsuario.setDescricao(rs.getString("descricao"));
				
				listaDeTiposDeUsuarios.add(tipoUsuario);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaDeTiposDeUsuarios;
	}
}
