package com.octest.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octest.forms.ConnectionForm;

@WebServlet("/ExempleLogin")
public class ExempleLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ExempleLogin() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/WEB-INF/exempleLogin.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			ConnectionForm myForm = new ConnectionForm(); // Création d'une instance de ConnectionForm
			
			String resultatConnexion = myForm.verififierIdentifiants(request); // = resultat (connecté ou pas)
			
			request.setAttribute("keyConnexion", resultatConnexion); // On définit l'attribut keyConnexion avec le résultat récupéré
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/exempleLogin.jsp").forward(request, response);
	}

}
