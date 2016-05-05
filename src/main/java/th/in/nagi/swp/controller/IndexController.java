package th.in.nagi.swp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class IndexController implements Controller {

	public IndexController() {
		System.out.println("LoginController");
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(false);

		if (session != null && session.getAttribute("user") != null) {
			request.setAttribute("user", session.getAttribute("user"));
			request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);			
		}
	}
}
