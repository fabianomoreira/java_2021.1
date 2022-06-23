<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import = "modelo.Usuario" %>
<%@page import = "java.util.List" %>
<%@page import = "java.util.ArrayList" %>
<%@page import = "modelo.TipoUsuario" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Tela de inclusão</title>
</head>
<body>
	<%
		Usuario usr = (Usuario)session.getAttribute("usuarioSelecionado");

		List<TipoUsuario> lista;
		
		lista = (ArrayList<TipoUsuario>)session.getAttribute("listaDeTipos");
		
		String selecao = "";
	%>
	<div>
		<form action="AlterarUsuarioServlet" method="post">
			<input type="hidden" name="id" id="id" value="<%=usr.getId() %>"/>
			<label>Nome : </label>
			<input type="text" name="nome" id="nome" placeholder="Nome do Usuário" size="40" value="<%=usr.getNome()%>"/><br>
			<label>Usuário:</label>
			<input type="text" name="usuario" id="usuario" placeholder="Login para o usuário" size="20" value="<%=usr.getUsuario()%>"/><br>
			<label>Senha:</label>
			<input type="password" name="senha" id="senha" placeholder="Senha" size="20" value="<%=usr.getSenha()%>"/><br>
			<select name="tipoUsuario" id="tipoUsuario">
				<% for(TipoUsuario tipo: lista){ 
				
					if(usr.getTipoUsuario().getId() == tipo.getId()){
						selecao = "selected";
					} else {
						selecao = "";
					}
				%>	
					<option value="<%=tipo.getId()%>" <%=selecao%>><%=tipo.getDescricao() %></option>
				<%} %>
			</select>						
			<input type="submit" value="Gravar"/>
		</form>
	</div>
	<div>
		<nav>
			<ul>
				<li><a href="menu.jsp">Home</a></li>
			</ul>
		</nav>
	</div>	
</body>
</html>