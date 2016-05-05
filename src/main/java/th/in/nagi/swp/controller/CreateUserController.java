package th.in.nagi.swp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import th.in.nagi.swp.model.User;
import th.in.nagi.swp.service.UserService;

public class CreateUserController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		User user = UserService.getInstance().addUser(new User(username, password));
		if (user == null) {
	        HttpSession session = request.getSession();
	        session.setAttribute("user", username);
			response.sendRedirect("/app/");
		} else {
			request.setAttribute("error", "Username has already been taken.");
			request.getRequestDispatcher("/WEB-INF/views/register.jsp").forward(request, response);
		}
	}
}