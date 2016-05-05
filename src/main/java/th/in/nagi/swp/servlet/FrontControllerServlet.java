package th.in.nagi.swp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import th.in.nagi.swp.controller.Controller;
import th.in.nagi.swp.controller.ControllerFactory;

@WebServlet(urlPatterns = "/app/*")
public class FrontControllerServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Controller action = ControllerFactory.getInstance().getAction(request);
		try {
			action.execute(request, response);
		} catch (NullPointerException e) {
			response.sendRedirect("/app/");
		}
	}
}
