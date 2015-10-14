package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Questao2
 */
@WebServlet("/Questao2")
public class Questao2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Questao2() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
			        "<li class='active'><a href='questao2.html'>Voltar</a></li>" + 
				  "</ul>" +
			    "</div>" +
			  "</nav>"
				);
		
		
		String peso = request.getParameter("peso");
		String altura = request.getParameter("altura");
		
		
		Float pesoconvertido = Float.parseFloat(peso);
		Float alturaconvertido = Float.parseFloat(altura);
		
		Float imc = (pesoconvertido/alturaconvertido)/alturaconvertido;
		
		saida.println("<div class='container'>");
		saida.println("<div class='divider'></div>");
		saida.println("<div class='row'>");
			saida.println("<div class='waves-effect col s12'>");
				saida.println("<h4>Peso:</h4>" + 
			    "<p>" + peso + "</p>");
			saida.println("</div>");
		saida.println("</div>");
		
		saida.println("<div class='divider'></div>");
		saida.println("<div class='row'>");
			saida.println("<div class='waves-effect col s12'>");
				saida.println("<h4>Altura:</h4>" + 
				"<p>" + altura + "</p>");
			saida.println("</div>");
		saida.println("</div>");
		
		saida.println("<div class='divider'></div>");
		saida.println("<div class='row'>");
			saida.println("<div class='waves-effect col s12'>");
				saida.println("<h4>IMC :</h4>" + 
				"<p>" + imc + "</p>");
			saida.println("</div>");
		saida.println("</div>");
		
		if(imc < 18.5){
			saida.println("<p class='red center-align white-text'>Abaixo do peso</p>");
		}else if(imc >= 18.5 && imc <= 24.9){
			saida.println("<p class='green center-align white-text'>Peso Normal</p>");
		}else if(imc >= 25.0 && imc <= 29.9){
			saida.println("<p class='red center-align white-text'>Sobreposto</p>");
		}else if(imc >= 30.0 && imc <=34.9){
			saida.println("<p class='red center-align white-text'>Obesidade Grau I</p>");
		}else if(imc >= 35.0 && imc <=39.9){
			saida.println("<p class='red center-align white-text'>Obesidade Grau II</p>");
		}else{
			saida.println("<p class='red center-align white-text'>Obesidade Grau III</p>");
		}
		saida.println("</div>");
		
		saida.println("<script src='https://code.jquery.com/jquery-2.1.1.min.js'></script>");
		saida.println("<script src='js/materialize.js'></script>");
		saida.println("<script src='js/init.js'></script>");
		saida.println("</body>");
		saida.println("</html>");
		
	}

}
