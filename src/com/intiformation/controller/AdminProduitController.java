package com.intiformation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.intiformation.service.IAdminProduitService;

@Controller
public class AdminProduitController {
	
	/* ========== Attributs ========= */
	// déclaration du service
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

	/* ========== Méthodes ========= */
	/**
	 * Méthode gestionnaire pour la récupération de la liste des produits dans la BDD
	 * @return
	 */
	public String index() {
		return "";
	}
	
	/**
	 * Permet d'ajouter un produit à la BDD.
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