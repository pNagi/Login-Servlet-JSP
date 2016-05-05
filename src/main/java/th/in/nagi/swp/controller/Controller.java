package th.in.nagi.swp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import th.in.nagi.swp.View;

public interface Controller {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
