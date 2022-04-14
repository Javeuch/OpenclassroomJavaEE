	package com.octest.servlets;
	
	import java.io.IOException;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	
	@WebServlet("/Accueil")
	public class Accueil extends HttpServlet {
		private static final long serialVersionUID = 1L;
	
	    public Accueil() {
	        super();
	       
	    }
	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			// On récupère le(s) paramatètre(s) contenu(s) dans l'URL
			String name = request.getParameter("name");
			
			// Création d'un tableau de noms:
			String[]noms = {"Mathieu", "René", "François"};
			
			// On set un attribut de l'objet request en lui donnant une clef keyName et sa valeur name (K, V)
			request.setAttribute("keyName", name);
			
			// On set un attribut de l'objet request en lui donnant une clef keyNoms et sa valeur noms
			request.setAttribute("keyNoms", noms);
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);
		}
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		}
	
	}
