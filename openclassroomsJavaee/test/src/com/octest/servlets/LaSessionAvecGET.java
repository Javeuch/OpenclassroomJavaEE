package com.octest.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LaSessionAvecGET
 */
@WebServlet("/LaSessionAvecGET")
public class LaSessionAvecGET extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//Constructor
    public LaSessionAvecGET() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Initialisation de la session sur le serveur:
		HttpSession maSession = request.getSession();
		
		// Récupération des données du formulaire:
		String prenomRecupereDuForm = (String) maSession.getAttribute("inputPrenom"); // on cast pour définir le type
		String nomRecupereDuForm = (String) maSession.getAttribute("inputNom");
		
		// Set les infos de session dans la requête:
		request.setAttribute("keyPrenom", prenomRecupereDuForm);
		request.setAttribute("keyNom", nomRecupereDuForm);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/formulaireDeSessionAvecGET.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			
		this.getServletContext().getRequestDispatcher("/WEB-INF/formulaireDeSessionAvecGGET.jsp").forward(request, response);
	}

}
