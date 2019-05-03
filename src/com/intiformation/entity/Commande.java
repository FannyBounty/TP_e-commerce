package com.intiformation.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity(name="commande")
@Table(name="commandes")
public class Commande {

	// ######################Champs##################//
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_commande")
	private Long idCommande;
	
	@Column(name="date_commande")
	private Date dateCommande;
	
	@ManyToOne
	// Côté porteur de la clé FK => @JoinColumn
	@JoinColumn(name = "client_id", referencedColumnName = "id_client" )
	  private Client client; 
	
	
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

	//Constructeur avec le client 
	public Commande(Long idCommande, Date dateCommande, Client client) {
		super();
		this.idCommande = idCommande;
		this.dateCommande = dateCommande;
		this.client = client;
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

	

	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	// #################ToString#################//
	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", dateCommande=" + dateCommande + "]";
	}
	
	
}
