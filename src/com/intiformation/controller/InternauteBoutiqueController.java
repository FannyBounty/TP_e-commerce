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
	
	public String getProdByCat() {
		return "";
	}
	
	public String getProdSelectionnes() {
		return "";
	}
	
	public String getProdByKeyWords() {
		return "";
	}
	
	public String addProdPanier() {
		return "";
	}
	
	public String suppProdPanier() {
		return "";
	}

}