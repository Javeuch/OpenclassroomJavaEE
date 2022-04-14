package com.octest.forms;

import javax.servlet.http.HttpServletRequest;

public class ConnectionForm {

	// On crée une variable resultat indiquant l'état de l'authentification:
	private String resultat;

	// On crée les accesseurs:
	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}

	/*
	 * On conçoit une méthode permettant de comparer les paramètres reçus de l'objet
	 * request au résultat attendus
	 */
	public String verififierIdentifiants(HttpServletRequest request) {

		String loginRecupDuForm = request.getParameter("inputLogin");
		String passRecupDuForm = request.getParameter("inputPass");

		if (passRecupDuForm.equals(loginRecupDuForm + "123")) {
			resultat = "Vous êtes bien connecté !";
		} else {
			resultat = "Identifiants incorrects !";
		}
		return resultat;
	}
}