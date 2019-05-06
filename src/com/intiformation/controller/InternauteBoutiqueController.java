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
	/**
	 * M�thode gestionnaire pour l'affichage global des produits pour le client
	 * @return
	 */
	@RequestMapping(value="/eboutique/liste", method=RequestMethod.GET)
	public String index(ModelMap modeleDonnees) {
		
		// 1. R�cup�ration de la liste des produits
		List<Produit> listeProduits = internauteManager.listProduits();
		
		// 2. Donn�es � retourner vers la vue
		modeleDonnees.addAttribute("liste_produits_attribut", listeProduits);
		
		// 3. Renvoi du nom logique de la vue
		//		R�solution : /WEB-INF/views/index_eboutique.jsp
		return "index_eboutique";
	}
	
	/**
	 * Permet de r�cup�rer les produits de la BDD par cat�gorie.
	 * @return
	 */
	@RequestMapping(value="/eboutique/listeParCat", method=RequestMethod.POST)
	public String getProdByCat(@RequestParam("catid") Long IdCat, ModelMap donneesVue) {
		
		// 1. R�cup�ration de la liste des produits
		List<Produit> listeProduitsParCat = internauteManager.getProduitsParCategorie(IdCat);
		
		// 2. Donn�es � retourner vers la vue
		donneesVue.addAttribute("liste_produits_cat_attribut", listeProduitsParCat);
		
		// 3. Renvoi du nom logique de la vue
		//		R�solution : /WEB-INF/views/recherche_produits.jsp
		return "recherche_produits";
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
	@RequestMapping(value="/eboutique/listeParMotCle", method=RequestMethod.POST)
	public String getProdByKeyWords(@RequestParam("catmc") String MotCle, ModelMap donneesVue) {
		
		// 1. R�cup�ration de la liste des produits
		List<Produit> listeProduitsParCat = internauteManager.getProduitsParMotCle(MotCle);
		
		// 2. Donn�es � retourner vers la vue
		donneesVue.addAttribute("liste_produits_mc_attribut", listeProduitsParCat);
		
		// 3. Renvoi du nom logique de la vue
		//		R�solution : /WEB-INF/views/recherche_produits.jsp
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