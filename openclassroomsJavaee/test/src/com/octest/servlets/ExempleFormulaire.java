package com.octest.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "OC Section4 CH1 Les Forms", urlPatterns = { "/ExempleFormulaire" })
public class ExempleFormulaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ExempleFormulaire() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		this.getServletContext().getRequestDispatcher("/WEB-INF/exempleFormulaire.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nomEcritDansForm = request.getParameter("inputNom");
		request.setAttribute("keyNom", nomEcritDansForm);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/exempleFormulaire.jsp").forward(request, response);
	}

}
