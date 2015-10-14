package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Questao1
 */
@WebServlet("/Questao1")
public class Questao1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Questao1() {
        super();
       }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		String number = request.getParameter("number");
		int numberconvertido = Integer.parseInt(number);
		
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
	        "<li class='active'><a href='questao1.html'>Voltar</a></li>" + 
		  "</ul>" +
	    "</div>" +
	  "</nav>"
		);
		
		saida.println("<table class='striped'>");
		saida.println("<thead>" +
		"<tr>" +
				"<th data-field='operacao'>Operação</th>" +
				"<th data-field='resultado'>Resultado</th>" +
		"<tr>" +
		"<thead>" 	
		);
		saida.println("<tbody>");
		
		
		for (int i = 0; i < 11; i++){
			
			
			saida.println("<tr>");
				saida.println("<td>" +  i  + "  X  " +  numberconvertido  + "</td>" + "<td colspan=''>" + i*numberconvertido + "</td>");
			saida.println("</tr>");
			
			
		}
		saida.println("</tbody>");
		saida.println("</table>");
		saida.println("<script src='https://code.jquery.com/jquery-2.1.1.min.js'></script>");
		saida.println("<script src='js/materialize.js'></script>");
		saida.println("<script src='js/init.js'></script>");
		saida.println("</body>");
		saida.println("</html>");
		
	}

}
