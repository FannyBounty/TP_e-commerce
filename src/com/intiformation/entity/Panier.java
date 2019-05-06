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

@Entity(name="panier")
@Table(name="paniers")
public class Panier{

	// ######################Champs##################//
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_panier")
	private Long idPanier;
	
	@OneToMany(mappedBy = "panier", cascade = CascadeType.ALL)
    private List<LigneCommande> ListLigneCommande;
	
	//#################Constructeur###############//
	//constructeur vide 
	public Panier() {
		super();
	}
	
	//constructeur chargé
	public Panier(Long idPanier) {
		super();
		this.idPanier = idPanier;
	}
	
	//#################Encapsulation#############//
	public Long getIdPanier() {
		return idPanier;
	}

	public void setIdPanier(Long idPanier) {
		this.idPanier = idPanier;
	}
	
}
