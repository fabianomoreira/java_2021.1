package controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.TipoUsuario;
import servico.TipoUsuarioServico;

@WebServlet("/PrepararInclusaoUsuarioServlet")
public class PrepararInclusaoUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PrepararInclusaoUsuarioServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TipoUsuarioServico servico = new TipoUsuarioServico();
		List<TipoUsuario> listaDeTipos = new ArrayList<TipoUsuario>();
		
		HttpSession session = request.getSession();
		
		listaDeTipos = servico.listar();
		
		session.setAttribute("tipoUsuario", listaDeTipos);
		
		response.sendRedirect("cadastrar.jsp");
	}

}
