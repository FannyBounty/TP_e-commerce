package com.intiformation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.intiformation.entity.Produit;
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
	/**
	 * Méthode gestionnaire pour l'affichage global des produits pour le client
	 * @return
	 */
	@RequestMapping(value="/eboutique/liste", method=RequestMethod.GET)
	public String index(ModelMap modeleDonnees) {
		
		// 1. Récupération de la liste des produits
		List<Produit> listeProduits = internauteManager.listProduits();
		
		// 2. Données à retourner vers la vue
		modeleDonnees.addAttribute("liste_produits_attribut", listeProduits);
		
		// 3. Renvoi du nom logique de la vue
		//		Résolution : /WEB-INF/views/index_eboutique.jsp
		return "index_eboutique";
	}
	
	/**
	 * Permet de récupérer les produits de la BDD par catégorie.
	 * @return
	 */
	@RequestMapping(value="/eboutique/listeParCat", method=RequestMethod.POST)
	public String getProdByCat(@RequestParam("catid") Long IdCat, ModelMap donneesVue) {
		
		// 1. Récupération de la liste des produits
		List<Produit> listeProduitsParCat = internauteManager.getProduitsParCategorie(IdCat);
		
		// 2. Données à retourner vers la vue
		donneesVue.addAttribute("liste_produits_cat_attribut", listeProduitsParCat);
		
		// 3. Renvoi du nom logique de la vue
		//		Résolution : /WEB-INF/views/recherche_produits.jsp
		return "recherche_produits";
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
	@RequestMapping(value="/eboutique/listeParMotCle", method=RequestMethod.POST)
	public String getProdByKeyWords(@RequestParam("catmc") String MotCle, ModelMap donneesVue) {
		
		// 1. Récupération de la liste des produits
		List<Produit> listeProduitsParCat = internauteManager.getProduitsParMotCle(MotCle);
		
		// 2. Données à retourner vers la vue
		donneesVue.addAttribute("liste_produits_mc_attribut", listeProduitsParCat);
		
		// 3. Renvoi du nom logique de la vue
		//		Résolution : /WEB-INF/views/recherche_produits.jsp
		return "recherche_produits";
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