package com.intiformation.entity;

public class Categorie {
	
	private Long idCategorie;
	private String nomCategorie;
	private byte photo;
	private String description;
	
	
	// ######################Champs##################//

	// #################Constructeur###############//
	// constructeur vide
	public Categorie() {
		super();
	}
	// constructeur sans idCategorie
	
	public Categorie(String nomCategorie, byte photo, String description) {
		super();
		this.nomCategorie = nomCategorie;
		this.photo = photo;
		this.description = description;
	}
	

	// Constructeur chargé
	
	public Categorie(Long idCategorie, String nomCategorie, byte photo, String description) {
		super();
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
		this.photo = photo;
		this.description = description;
	}
	
	// #################Encapsulation#############//

	public Long getIdCategorie() {
		return idCategorie;
	}
	
	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}
	public String getNomCategorie() {
		return nomCategorie;
	}
	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}
	public byte getPhoto() {
		return photo;
	}
	public void setPhoto(byte photo) {
		this.photo = photo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	// #################ToString#################//
	@Override
	public String toString() {
		return "Categorie [idCategorie=" + idCategorie + ", nomCategorie=" + nomCategorie + ", photo=" + photo
				+ ", description=" + description + "]";
	}
	
}
