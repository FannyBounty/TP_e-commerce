package com.intiformation.entity;

import java.util.Date;

public class Commande {

	// ######################Champs##################//
	private Long idCommande;
	private Date dateCommande;
	
	
	// #################Constructeur###############//
	// constructeur vide
	
	public Commande() {
		super();
	}
	

	// constructeur sans idCommande
	
	public Commande(Date dateCommande) {
		super();
		this.dateCommande = dateCommande;
	}


	
	// Constructeur chargé
	
	public Commande(Long idCommande, Date dateCommande) {
		super();
		this.idCommande = idCommande;
		this.dateCommande = dateCommande;
	}


	
	
	// #################Encapsulation#############//
	
	public Long getIdCommande() {
		return idCommande;
	}


	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}


	public Date getDateCommande() {
		return dateCommande;
	}


	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}


	// #################ToString#################//
	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", dateCommande=" + dateCommande + "]";
	}
	
	
}
