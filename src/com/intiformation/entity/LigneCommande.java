package com.intiformation.entity;

public class LigneCommande {

	// ######################Champs##################//
	
	private int quantite;
	private double prix;
	
	
	
	// #################Constructeur###############//
	
	// constructeur vide
	public LigneCommande() {
		super();
	}

	// Constructeur chargé
	public LigneCommande(int quantite, double prix) {
		super();
		this.quantite = quantite;
		this.prix = prix;
	}

	
	// #################Encapsulation#############//
	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	

	// #################ToString#################//
	@Override
	public String toString() {
		return "LigneCommande [quantite=" + quantite + ", prix=" + prix + "]";
	}
	
}
