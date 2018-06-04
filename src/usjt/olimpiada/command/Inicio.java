package usjt.olimpiada.command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Inicio implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("menu", "inicio");
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/Home.jsp");
		view.forward(request, response);
		
	}

}