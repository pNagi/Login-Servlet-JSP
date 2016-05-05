package th.in.nagi.swp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import th.in.nagi.swp.model.User;
import th.in.nagi.swp.service.UserService;

public class LoginController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		User user = UserService.getInstance().find(username, password);
		if (user != null && user.checkPassword(password)) {
	        HttpSession session = request.getSession();
	        session.setAttribute("user", username);
			request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
		} else {
			request.setAttribute("error", "Invalid Username/Password");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
	}
}
