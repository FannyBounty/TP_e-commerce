package com.intiformation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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
	public String index() {
		return "";
	}
	
	public String saveProd() {
		return "";
	}
	
	public byte[] photoCat() {
		return null;
	}
	
	public String suppProd() {
		return "";
	}
	
	public String editProd() {
		return "";
	}

}