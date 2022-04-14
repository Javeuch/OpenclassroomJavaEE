package com.octest.beans;

public class Auteur {
	private String nom;
	private String prenom;
	private boolean actif;

	// Comme les attributs sont déclarés private, on génère les accesseurs:
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;

	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public boolean isActif() { // bonne pratique plutôt que getActif
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

}
