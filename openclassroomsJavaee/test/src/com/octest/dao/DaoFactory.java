	package com.octest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoFactory {

	// Variables de connexion à la BDD
    private String url;
    private String username;
    private String password;

    // Constructor
    DaoFactory(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }
 
    // Obtention d'un Objet connecté (appelé "instance") à la BDD MySQL via JDBC
    public static DaoFactory getInstance() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {

        }

        DaoFactory instance = new DaoFactory("jdbc:mysql://localhost:3306/javaee", "root", "mdpRoot");
        return instance;
    }

    // Méthode de connexion
    public Connection getConnection() throws SQLException {
//        return DriverManager.getConnection(url, username, password); /* Sans gestion d'erreur dans le DAO */
        Connection connexion = DriverManager.getConnection(url, username, password);
        connexion.setAutoCommit(false); /* Gestion manuel de l'enregistrement des transactions */
        return connexion; 
    }

    // Récupération du Dao
    public UtilisateurDao getUtilisateurDao() {
        return new UtilisateurDaoImpl(this);
    }
}
