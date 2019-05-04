package com.intiformation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.intiformation.service.IAdminCategoriesService;

@Controller
public class AdminCategoriesController {
	
	/* ========== Attributs ========= */
	// déclaration du service
	@Autowired
	private IAdminCategoriesService adminCategoriesManager;

	/* ========== Setters ========= */
	/**
	 * Setter pour injection
	 * @param adminCategoriesManager
	 */
	public void setAdminCategoriesManager(IAdminCategoriesService adminCategoriesManager) {
		this.adminCategoriesManager = adminCategoriesManager;
	}
	

}
