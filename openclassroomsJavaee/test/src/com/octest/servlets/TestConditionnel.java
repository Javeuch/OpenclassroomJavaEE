package com.octest.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "OC Java EE Section3 CH4 Les conditions", urlPatterns = { "/TestConditionnel" })
public class TestConditionnel extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TestConditionnel() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/testConditionnel.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
