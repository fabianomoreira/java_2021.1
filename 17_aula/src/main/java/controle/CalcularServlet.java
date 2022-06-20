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

@WebServlet("/CalcularServlet")
public class CalcularServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CalcularServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int numero = Integer.parseInt(request.getParameter("numero"));
		int valor = 0;
		
		HttpSession session = request.getSession();
		
		List<Integer> tabuada = new ArrayList<Integer>();
		
		for(int i = 1; i <= 10; i++) {
			valor = numero * i;
			tabuada.add(valor);
		}
		
		session.setAttribute("tabuada", tabuada);
		session.setAttribute("numero", numero);
		
		response.sendRedirect("tabuada.jsp");
	}

}
