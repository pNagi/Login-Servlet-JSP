package th.in.nagi.swp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController implements Controller {

	public LoginController() {
		System.out.println("LoginController");
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// String username = request.getParameter("username");
		// String password = request.getParameter("password");
		// User user = userService.find(username, password);

		// if (user != null) {
		// request.getSession().setAttribute("user", user);
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		// } else {
		// request.setAttribute("error", "Unknown username/password. Please try
		// again.");
		// return "login";
		// }

	}
}
