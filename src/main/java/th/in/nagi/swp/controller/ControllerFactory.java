package th.in.nagi.swp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class ControllerFactory {

	private Map<String, Controller> actions;
	private static ControllerFactory instance;

	private ControllerFactory() {
		actions = new HashMap<String, Controller>();
		actions.put("GET/", new IndexController());
		actions.put("GET/register", new RegisterController());
		actions.put("POST/", new LoginController());
		actions.put("POST/create", new CreateUserController());
		actions.put("POST/logout", new LogoutController());
	}

	public static ControllerFactory getInstance() {
		if (instance == null) {
			return new ControllerFactory();
		} else {
			return instance;
		}
	}

	public Controller getAction(HttpServletRequest request) {
		System.out.println("get_action: " + request.getMethod() + request.getPathInfo());
		return actions.get(request.getMethod() + request.getPathInfo());
	}
}