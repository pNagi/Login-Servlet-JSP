package th.in.nagi.swp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class View {

	private HttpServletRequest request;
	private HttpServletResponse response;
	
	public View(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}

	public void navigate() throws ServletException, IOException {
		String path = "/WEB-INF" + request.getPathInfo() + ".jsp";
		request.getRequestDispatcher(path).forward(request, response);
	}
}
