package com.intiformation.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="produit")
@Table(name="produits")
public class Produit{
	
	//######################Champs##################//
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_produit")
	private Long idProduit;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="description")
	private String description;
	
	@Column(name="photo")
	private String photo;
	
	@Column(name="quantite")
	private int quantite;
	
	@Column(name="prix")
	private double prix;
	
	@Column(name="selectionne")
	private boolean selectionne;
	
	@OneToMany(mappedBy = "produit", cascade = CascadeType.ALL)
    private List<Categorie> ListCategorie;
	
	
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
	//Constructeur avec la categorie
	public Produit(Long idProduit, String designation, String description, String photo, int quantite, double prix,
			boolean selectionne, List<Categorie> listCategorie) {
		super();
		this.idProduit = idProduit;
		this.designation = designation;
		this.description = description;
		this.photo = photo;
		this.quantite = quantite;
		this.prix = prix;
		this.selectionne = selectionne;
		ListCategorie = listCategorie;
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

	public List<Categorie> getListCategorie() {
		return ListCategorie;
	}

	public void setListCategorie(List<Categorie> listCategorie) {
		ListCategorie = listCategorie;
	}
	
	//#################ToString###################//
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", designation=" + designation + ", description=" + description
				+ ", photo=" + photo + ", quantite=" + quantite + ", prix=" + prix + ", selectionne=" + selectionne
				+ "]";
	}
	

	
}//Fin classe
