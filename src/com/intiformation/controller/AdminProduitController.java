package com.intiformation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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
	

}