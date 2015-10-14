package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Agenda;
import Model.Usuario;

@WebServlet("/Questao3")
public class Questao3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Questao3() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String tipo = request.getParameter("tipo");
		String operadora = request.getParameter("operadora");
		String email = request.getParameter("email");
		
		Usuario usuario = new Usuario(nome,email,telefone,tipo,operadora);
		Agenda agenda = new Agenda();
		
		PrintWriter saida = response.getWriter(); 
		
		saida.println("<html>");
		saida.println("<head>");
		saida.println("<link href='css/materialize.css' type='text/css' rel='stylesheet' media='screen,projection'/>");
		saida.println("<link href='css/style.css' type='text/css' rel='stylesheet' media='screen,projection'/>");
		saida.println("</head>");
		saida.println("<body>");
		saida.println("<nav>" +
				  "<div class='blue nav-wrapper'>" +
			      "<a href='index.html' class='brand-logo'>Prova NP1</a>" +
			      "<a href='#' data-activates='mobile-demo' class='button-collapse'><i class='material-icons'>menu</i></a>" +
			      "<ul id='nav-mobile' class='right hide-on-med-and-down'>" +
			        "<li class='active'><a href='questao3.html'>Voltar</a></li>" + 
				  "</ul>" +
			    "</div>" +
			  "</nav>"
				);
		
		
		
		agenda.cadastrarUsuario(usuario);
		saida.println("Inserido com sucesso");
	
		
		ArrayList<Usuario> lista = agenda.listar();
		//tamanho da lista
		saida.println(lista.size());
		
		Usuario usumostrar;
		
		for (int i = 0; i < lista.size(); i++) {
			
			usumostrar = lista.get(i);
			
			saida.println(usumostrar.nome);
			saida.println(usumostrar.operadora);
			saida.println(usumostrar.telefone);
			saida.println(usumostrar.tipo);
			saida.println(usumostrar.email);
		}
		
		saida.println("<script src='https://code.jquery.com/jquery-2.1.1.min.js'></script>");
		saida.println("<script src='js/materialize.js'></script>");
		saida.println("<script src='js/init.js'></script>");
		saida.println("</body>");
		saida.println("</html>");
		
	}
	
}
