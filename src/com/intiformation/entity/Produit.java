package com.intiformation.entity;

public class Produit {
	
	//######################Champs##################//
	private Long idProduit;
	private String designation;
	private String description;
	private String photo;
	private int quantite;
	private double prix;
	private boolean selectionne;
	

	
	//#################Constructeur###############//
	//constructeur vide 
	public Produit() {
		super();
	}
	
	//constructeur sans idProduit
	public Produit(String designation, String description, String photo, int quantite, double prix,
			boolean selectionne) {
		super();
		this.designation = designation;
		this.description = description;
		this.photo = photo;
		this.quantite = quantite;
		this.prix = prix;
		this.selectionne = selectionne;
	}
	
	//Constructeur chargé
	public Produit(Long idProduit, String designation, String description, String photo, int quantite, double prix,
			boolean selectionne) {
		super();
		this.idProduit = idProduit;
		this.designation = designation;
		this.description = description;
		this.photo = photo;
		this.quantite = quantite;
		this.prix = prix;
		this.selectionne = selectionne;
	}
	
	//#################Encapsulation#############//
	
	public Long getIdProduit() {
		return idProduit;
	}
	
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
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
	public boolean isSelectionne() {
		return selectionne;
	}
	public void setSelectionne(boolean selectionne) {
		this.selectionne = selectionne;
	}

	
	//#################ToString###################//
	
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", designation=" + designation + ", description=" + description
				+ ", photo=" + photo + ", quantite=" + quantite + ", prix=" + prix + ", selectionne=" + selectionne
				+ "]";
	}
	

	
}//Fin classe
