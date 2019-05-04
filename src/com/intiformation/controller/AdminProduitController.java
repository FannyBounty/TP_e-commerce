package com.intiformation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.intiformation.service.IAdminProduitService;

@Controller
public class AdminProduitController {
	
	/* ========== Attributs ========= */
	// d�claration du service
	@Autowired
	private IAdminProduitService adminProduitManager;

	/* ========== Setters ========= */
	/**
	 * Setter pour injection
	 * @param adminCategoriesManager
	 */
	public void setAdminProduitManager(IAdminProduitService adminProduitManager) {
		this.adminProduitManager = adminProduitManager;
	}

	/* ========== M�thodes ========= */
	/**
	 * M�thode gestionnaire pour la r�cup�ration de la liste des produits dans la BDD
	 * @return
	 */
	public String index() {
		return "";
	}
	
	/**
	 * Permet d'ajouter un produit � la BDD.
	 * @return
	 */
	public String saveProd() {
		return "";
	}
	
	public byte[] photoCat() {
		return null;
	}
	
	/**
	 * Permet de supprimer un produit de la BDD.
	 * @return
	 */
	public String suppProd() {
		return "";
	}
	
	/**
	 * Permet de modifier un produit de la BDD.
	 * @return
	 */
	public String editProd() {
		return "";
	}

}