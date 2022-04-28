package com.octest.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octest.beans.Utilisateur;
import com.octest.dao.DaoFactory;
import com.octest.dao.UtilisateurDao;

@WebServlet("/TestDAO")
public class TestDAO extends HttpServlet {
	
	// Ajout d'une variable UtilisateurDAO
	private static final long serialVersionUID = 1L;
    private UtilisateurDao utilisateurDao;
    
    // Méthode permettant d'initialiser un UtilisateurDAO connecté à la BDD (se place avant doGet et doPost)
    public void init() throws ServletException {
        DaoFactory daoFactory = DaoFactory.getInstance();
        this.utilisateurDao = daoFactory.getUtilisateurDao();
    }
	
    // Constructor vide
    public TestDAO() {
        super();
        
    }	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 request.setAttribute("utilisateurs", utilisateurDao.lister());
	     this.getServletContext().getRequestDispatcher("/WEB-INF/testDAO.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom(request.getParameter("nom"));
        utilisateur.setPrenom(request.getParameter("prenom"));
        
        utilisateurDao.ajouter(utilisateur);
        
        request.setAttribute("utilisateurs", utilisateurDao.lister());
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/testDAO.jsp").forward(request, response);
    
	}

}
