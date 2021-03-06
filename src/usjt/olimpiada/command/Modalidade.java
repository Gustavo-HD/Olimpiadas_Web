package usjt.olimpiada.command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import usjt.olimpiada.service.ModalidadeService;


public class Modalidade implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ModalidadeService ms = new ModalidadeService();
		
		request.setAttribute("modalidades", ms.buscaModalidades());
		
		request.setAttribute("menu", "modalidade");
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/Modalidades.jsp");
		view.forward(request, response);
	}

}
