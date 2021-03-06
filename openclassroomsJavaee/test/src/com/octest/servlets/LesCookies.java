package com.octest.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
	
@WebServlet("/LesCookies")
public class LesCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LesCookies() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Création d'un tableau "cookies" de cookie(s):
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("prenom")) {
					request.setAttribute("prenom", cookie.getValue());
				}
			}
		}

		this.getServletContext().getRequestDispatcher("/WEB-INF/lesCookies.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String prenom = request.getParameter("prenom");
		String nom = request.getParameter("nom");

		Cookie cookie = new Cookie("prenom", prenom); // On crée un cookie de la Classe Cookie
		 cookie.setMaxAge(60 * 60 * 24 * 30); // On lui donne une durée d'existence de 30j soit 1 mois

		response.addCookie(cookie);
		this.getServletContext().getRequestDispatcher("/WEB-INF/lesCookies.jsp").forward(request, response);
	}

}
