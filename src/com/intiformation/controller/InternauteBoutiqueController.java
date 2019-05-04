package com.intiformation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.intiformation.service.IInternauteService;

@Controller
public class InternauteBoutiqueController {
	
	/* ========== Attributs ========= */
	// déclaration du service
	@Autowired
	private IInternauteService internauteManager;

	/* ========== Setters ========= */
	/**
	 * Setter pour injection
	 * @param adminCategoriesManager
	 */
	public void setInternauteManager(IInternauteService internauteManager) {
		this.internauteManager = internauteManager;
	}

	/* ========== Méthodes ========= */
	public String index() {
		return "";
	}
	
	/**
	 * Permet de récupérer les produits de la BDD par catégorie.
	 * @return
	 */
	public String getProdByCat() {
		return "";
	}
	
	/**
	 * Permet de récupérer la liste des produits sélectionnés
	 * @return
	 */
	public String getProdSelectionnes() {
		return "";
	}
	
	/**
	 * Permet de récupérer les produits correspondant au mot-clé
	 * @return
	 */
	public String getProdByKeyWords() {
		return "";
	}
	
	/**
	 * Permet d'ajouter un produit au panier
	 * @return
	 */
	public String addProdPanier() {
		return "";
	}
	
	/**
	 * Permet de supprimer un produit du panier
	 * @return
	 */
	public String suppProdPanier() {
		return "";
	}

}