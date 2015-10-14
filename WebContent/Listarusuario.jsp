<%@page import="java.util.ArrayList"%>
<%@page import="Dao.Agenda"%>
<%@page import="Model.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>listar usuario</title>
</head>
<body>
		   <% 
				Agenda lista = new Agenda();
				ArrayList<Usuario> usuarios = lista.listar();
				Usuario usu = usuarios.get(0);
				
			%>
			<p><%=usu.nome%></p>
			<%  %>

</body>
</html>