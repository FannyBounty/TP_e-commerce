package com.intiformation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="ligneCommande")
@Table(name="ligneCommandes")
public class LigneCommande{

	// ######################Champs##################//
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_lignecommande")
	private Long idLigneCommande;

	@Column(name="quantite")
	private int quantite;
	
	@Column(name="prix")
	private double prix;
	
	// #################Constructeur###############//
	
	// constructeur vide
	public LigneCommande() {
		super();
	}

	// Constructeur chargé
	public LigneCommande(Long idLigneCommande, int quantite, double prix) {
		this.idLigneCommande = idLigneCommande;
		this.quantite = quantite;
		this.prix = prix;
	}

	
	// #################Encapsulation#############//
	public Long getIdLigneCommande() {
		return idLigneCommande;
	}
	
	public void setIdLigneCommande(Long idLigneCommande) {
		this.idLigneCommande = idLigneCommande;
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

	// #################ToString#################//
	@Override
	public String toString() {
		return "LigneCommande [quantite=" + quantite + ", prix=" + prix + "]";
	}
	
}
