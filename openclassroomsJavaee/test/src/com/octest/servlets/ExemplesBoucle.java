package com.octest.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "OC Java EE Section3 CH5 Boucles", urlPatterns = { "/ExemplesBoucle" })
public class ExemplesBoucle extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ExemplesBoucle() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Tableau de titres:
		
		String[]titres = {"Bel Ami", "La Peste", "Rhinocéros"};
		request.setAttribute("keyTitres", titres);

		this.getServletContext().getRequestDispatcher("/WEB-INF/exemplesBoucle.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
