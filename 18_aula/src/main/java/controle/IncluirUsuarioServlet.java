package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.TipoUsuario;
import modelo.Usuario;
import servico.UsuarioServico;

@WebServlet("/IncluirUsuarioServlet")
public class IncluirUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IncluirUsuarioServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario usr = new Usuario();
		TipoUsuario tipo = new TipoUsuario();
		
		UsuarioServico servico = new UsuarioServico();
		
		tipo.setId(Integer.parseInt(request.getParameter("tipoUsuario")));
		
		usr.setNome(request.getParameter("nome"));
		usr.setUsuario(request.getParameter("usuario"));
		usr.setSenha(request.getParameter("senha"));
		usr.setTipoUsuario(tipo);
		
		if(servico.incluir(usr)) {
			response.sendRedirect("menu.jsp");
		}
	}

}
