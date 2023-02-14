package com.prospect.prospect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Prospect {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_prospect;
	
	private String nom_prospect;
	private int siret_prospect;
	private String adresse_prospect;
	private int codePostal_prospect;
	private String ville_prospect;
	
	public Prospect(int id, String nom, int siret, String adresse, int codePostal, String ville) {
		this.id_prospect = id;
		this.nom_prospect = nom;
		this.siret_prospect = siret;
		this.adresse_prospect = adresse;
		this.codePostal_prospect = codePostal;
		this.ville_prospect = ville;
	}
	public Prospect(String nom, int siret, String adresse, int codePostal, String ville) {
		this.nom_prospect = nom;
		this.siret_prospect = siret;
		this.adresse_prospect = adresse;
		this.codePostal_prospect = codePostal;
		this.ville_prospect = ville;
	}

	public String getNom() {
		return nom_prospect;
	}

	public void setNom(String nom) {
		this.nom_prospect = nom;
	}

	public int getSiret() {
		return siret_prospect;
	}

	public void setSiret(int siret) {
		this.siret_prospect = siret;
	}

	public String getAdresse() {
		return adresse_prospect;
	}

	public void setAdresse(String adresse) {
		this.adresse_prospect = adresse;
	}

	public int getCodePostal() {
		return codePostal_prospect;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal_prospect = codePostal;
	}

	public String getVille() {
		return ville_prospect;
	}

	public void setVille(String ville) {
		this.ville_prospect = ville;
	}

	@Override
	public String toString() {
		return "Prospect = nom : " + nom_prospect + ", siret: " + siret_prospect + ", adresse: " + adresse_prospect + ", codePostal: " + codePostal_prospect
				+ ", ville: " + ville_prospect + "\n";
	}
	
}
