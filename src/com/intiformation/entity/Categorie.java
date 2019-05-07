package com.intiformation.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="categorie")
@Table(name="categories")
public class Categorie{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_categorie")
	private Long idCategorie;
	
	@Column(name="nom_categorie")
	private String nomCategorie;
	
	@Column(name="photo")
	private byte photo;
	
	@Column(name="description")
	private String description;
	
	@ManyToOne
	// Côté porteur de la clé FK => @JoinColumn
	@JoinColumn(name = "produit_id", referencedColumnName = "id_produit" )
	  private Produit produit; 
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
	//constructeur avec Produit
	public Categorie(Long idCategorie, String nomCategorie, byte photo, String description, Produit produit) {
		super();
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
		this.photo = photo;
		this.description = description;
		this.produit = produit;
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
	
	
	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	// #################ToString#################//
	@Override
	public String toString() {
		return "Categorie [idCategorie=" + idCategorie + ", nomCategorie=" + nomCategorie + ", photo=" + photo
				+ ", description=" + description + "]";
	}
	
}
