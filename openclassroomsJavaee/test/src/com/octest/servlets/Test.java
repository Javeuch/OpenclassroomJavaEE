package com.octest.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octest.beans.Auteur;

@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// constructor
	public Test() {
		super();
		
	}

	// méthode doGet
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String message = "Au revoir !";	
		String salutation = "jour"; // Si on met autre chose que "jour", on passe ds le Else de la JSP => bonsoir
		
		Auteur auteur = new Auteur();
		auteur.setNom("Nebra");
		auteur.setPrenom("Mathieu");
		auteur.setActif(false);
		
		
		
		request.setAttribute("key", message);
		request.setAttribute("keyHeure", salutation);
		request.setAttribute("keyAuteur", auteur);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
	}

	// méthode doPost
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	}

}
