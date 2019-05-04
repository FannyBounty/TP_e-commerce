package com.intiformation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.intiformation.service.IInternauteService;

@Controller
public class InternauteBoutiqueController {
	
	/* ========== Attributs ========= */
	// d�claration du service
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

	/* ========== M�thodes ========= */
	public String index() {
		return "";
	}
	
	/**
	 * Permet de r�cup�rer les produits de la BDD par cat�gorie.
	 * @return
	 */
	public String getProdByCat() {
		return "";
	}
	
	/**
	 * Permet de r�cup�rer la liste des produits s�lectionn�s
	 * @return
	 */
	public String getProdSelectionnes() {
		return "";
	}
	
	/**
	 * Permet de r�cup�rer les produits correspondant au mot-cl�
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