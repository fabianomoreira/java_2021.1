package controle;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Usuario;
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
		HttpSession session = request.getSession();
		
		UsuarioServico servico = new UsuarioServico();
		Usuario usuario = new Usuario();
		
		String idRequisicao = request.getParameter("id");
		
		usuario = servico.buscarPorId(Integer.parseInt(idRequisicao));
		
		if(!Objects.isNull(usuario)) {
			session.setAttribute("usuarioSelecionado", usuario);
			response.sendRedirect("alterar.jsp");
		} else {
			response.sendRedirect("erro.jsp");
		}
	}

}
