package com.octest.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octest.beans.Auteur;

@WebServlet(description = "OC Section3 Chap3 variables", urlPatterns = { "/ExemplesJSTL" })
public class ExemplesJSTL extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ExemplesJSTL() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Auteur auteur = new Auteur();
		auteur.setNom("Nebra");
		auteur.setPrenom("Mathieu");
		auteur.setActif(false);
		
		request.setAttribute("keyAuteur", auteur);

		this.getServletContext().getRequestDispatcher("/WEB-INF/exemplesJSTL.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
