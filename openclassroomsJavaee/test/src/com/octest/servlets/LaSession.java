package com.octest.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LaSession
 */
@WebServlet("/LaSession")
public class LaSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//Constructor
    public LaSession() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/WEB-INF/formulaireDeSession.jsp").forward(request, response);
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Récupération des données du formulaire:
		String prenomRecupereDuForm = request.getParameter("inputPrenom");
		String nomRecupereDuForm = request.getParameter("inputNom");
		
		// Initialisation de la session sur le serveur:
		HttpSession maSession = request.getSession();	
		
		// mise en mémoire des infos de session:
		maSession.setAttribute("keyPrenom", prenomRecupereDuForm);
		maSession.setAttribute("keyNom", nomRecupereDuForm);
			
// ACTIVEZ EN DECOMMENTANT POUR LA CONNEXION ISSUE DU POST !!!		
		this.getServletContext().getRequestDispatcher("/WEB-INF/formulaireDeSession.jsp").forward(request, response);
	}

}
