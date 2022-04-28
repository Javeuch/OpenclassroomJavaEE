package com.octest.beans;

public class Utilisateur {
	private String nom;
	private String prenom;

	public String getNom() {
		return nom;
	}

	// Le formulaire affichera une exception si prénom a plus de 10 caractères
	public void setNom(String nom) throws BeanException {
		
		// Vérifie si le nom comporte moins de 10 caractères
		if (nom.length() > 10) {
			throw new BeanException("Le nom est trop grand ! (10 caractères maximum)");
			
		// Vérifie s'il n'y a pas de caractère
		} else if (nom.length() == 0) {
			throw new BeanException("Le champs Nom n'a pas été  complété !");
		}
		// Sinon, on enregistre
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) throws BeanException {
		
		// Vérifie s'il n'y a pas de caractère
		if (prenom.length() == 0) {
			throw new BeanException("Le champs Prénom n'a pas été  complété !");
			}else {
		this.prenom = prenom;
			}
	}
}
