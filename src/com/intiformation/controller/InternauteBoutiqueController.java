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
	

}