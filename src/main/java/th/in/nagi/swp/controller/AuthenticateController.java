package th.in.nagi.swp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticateController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (username.equalsIgnoreCase("admin") && password.equals("1234")) {
			request.setAttribute("user", username);
			request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
		} else {
			request.setAttribute("error", "Invalid Username/Password");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
	}
}
