package com.intiformation.entity;

import java.util.List;

public class Panier{

	// ######################Champs##################//
    private List<LigneCommande> ListLigneCommande;
	
	//#################Encapsulation#############//
	public List<LigneCommande> getListLigneCommande() {
		return ListLigneCommande;
	}

	public void setListLigneCommande(List<LigneCommande> listLigneCommande) {
		ListLigneCommande = listLigneCommande;
	}

}
