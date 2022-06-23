package controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.TipoUsuario;
import modelo.Usuario;
import servico.TipoUsuarioServico;
import servico.UsuarioServico;

@WebServlet("/PrepararAlteracaoUsuario")
public class PrepararAlteracaoUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PrepararAlteracaoUsuario() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<TipoUsuario> listaDeTiposDeUsuario = new ArrayList<TipoUsuario>();
		
		HttpSession session = request.getSession();
		
		UsuarioServico servico = new UsuarioServico();
		TipoUsuarioServico servicoTipo = new TipoUsuarioServico();
		
		Usuario usuario = new Usuario();
		
		String idRequisicao = request.getParameter("id");
		
		listaDeTiposDeUsuario = servicoTipo.listar();
		
		usuario = servico.buscarPorId(Integer.parseInt(idRequisicao));
		
		if(!Objects.isNull(usuario)) {
			session.setAttribute("usuarioSelecionado", usuario);
			session.setAttribute("listaDeTipos", listaDeTiposDeUsuario);
			response.sendRedirect("alterar.jsp");
		} else {
			response.sendRedirect("erro.jsp");
		}
	}

}
