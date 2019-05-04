package com.intiformation.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.intiformation.entity.Categorie;
import com.intiformation.entity.Produit;
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
	@RequestMapping(value="/produits/liste", method=RequestMethod.GET)
	public String index(ModelMap modeleDonnees) {
		
		// 1. R�cup�ration de la liste des produits
		List<Produit> listeProduits = adminProduitManager.listProduits();
		
		// 2. Donn�es � retourner vers la vue
		modeleDonnees.addAttribute("liste_produits_attribut", listeProduits);
		
		// 3. Renvoi du nom logique de la vue
		//		R�solution : /WEB-INF/views/produits.jsp
		return "produits";
	}
	
	/**
	 * Permet d'ajouter un produit � la BDD via le formulaire 'ajouterProduit.jsp'<br />
	 * URL d'invocation : 
	 * @return
	 */
	@RequestMapping(value="/produit/add/{categorieID}", method=RequestMethod.GET)
	public String saveProd(@ModelAttribute("produitCommand") Produit pProd,
			@PathVariable("categorieID") Long idCat,
			ModelMap donneesVue) {
		
		// 1. Ajout du produit dans la bdd via le service
		adminProduitManager.addProduit(pProd, idCat);
		
		// 2. R�cup�ration de la nouvelle liste des produits dans la bdd
		donneesVue.addAttribute("liste_produits_attribut", adminProduitManager.listProduits());
		
		// 3. Redirection vers la page produits.jsp via l'URL produit/add
		return "redirect:/produits/liste";
	}
	
	/**
	 * Permet d'afficher le formulaire d'ajout d'un produit, m�thode invoqu�e au clic<br />
	 * sur le lien 'Ajouter' de la page 'produits.jsp' sur une requ�te HTTP GET.<br />
	 * URL d'invocation : 
	 * @return
	 */
	@RequestMapping(value="/addProduit", method=RequestMethod.GET)
	public ModelAndView setUpFormulaireAjoutProd() {
		
		// 1. Donn�es � retourner vers la vue
		Map<String, Object> data = new HashMap<>();
		
		// 2. D�finition de l'objet de commande (objet � lier au formulaire de la vue)
		Produit produit = new Produit();
		String objetCommandeProduit = "produitCommand";
		
		// 3. Association entre l'objet et le nom de commande
		data.put(objetCommandeProduit, produit);
		
		// 4. Nom logique de la vue
		//		R�solution : /WEB-INF/views/ajouterProduit.jsp
		String nomVue = "ajouterProduit";
		
		// 5. Renvoi objet anonyme
		return new ModelAndView(nomVue, data);
	}
	
	public byte[] photoCat() {
		return null;
	}
	
	/**
	 * Permet de supprimer un produit de la BDD via son Id.<br />
	 * URL d'invocation : 
	 * @return
	 */
	@RequestMapping(value="produit/delete/{produitID}",
			method=RequestMethod.GET)
	public String suppProd(@PathVariable("produitID") Long pIdProduit, ModelMap donneesVue) {
		
		// 1. Suppression du produit via le service
		adminProduitManager.deleteProduit(pIdProduit);
		
		// 2. R�cup�ration de la liste des produits mise � jour
		List<Produit> listeProduits = adminProduitManager.listProduits();
		
		// 3. Donn�es � retourner vers la vue produits.jsp
		donneesVue.addAttribute("liste_produits_attribut", listeProduits);
		
		// 4. Redirection vers la page 'produits.jsp'	
		return "redirect:/produits/liste";
	}
	
	/**
	 * Permet de modifier un produit de la BDD via le formulaire de la page 'modifierProduit.jsp'.<br />
	 * URL d'invocation : 
	 * @return
	 */
	@RequestMapping(value="/produits/update", method=RequestMethod.POST)
	public String editProd(@ModelAttribute("produitUpdateCommand") Produit produit,
			ModelMap donneesVue) {
		
	// 1. Mise � jour du produit dans la BDD via le service
	adminProduitManager.updateProduit(produit);
	
	// 2. R�cup�ration de la nouvelle liste des produits
	donneesVue.addAttribute("liste_produits_attribut", adminProduitManager.listProduits());
	
	// 3. Redirection vers produits.jsp
	return "redirect:/produits/liste";
	}
	
	/**
	 * Permet d'afficher le formulaire de modification d'un produit, m�thode invoqu�e au clic<br />
	 * sur le lien 'Modifier' de la page 'produits.jsp' sur une requ�te HTTP GET.<br />
	 * URL d'invocation : 
	 * @return
	 */
	@RequestMapping(value="/updateProduit", method=RequestMethod.GET)
	public ModelAndView setUpFormulaireModifProd(@RequestParam("prodid") Long IdProduit) {
		
		// 1. R�cup�ration du produit � modifier via son id pass� en param�tre de la requ�te
		Produit produit = adminProduitManager.getProduitById(IdProduit);
		
		// 2. Renvoi du mod�le de donn�es (produit) + nom logique de la vue
		//		new ModelAndView( nom de la vue , nom de l'objet de commande , l'objet de commande )
		//		R�solution de la vue : /WEB-INF/views/modifierProduit.jsp
		return new ModelAndView("modifierProduit", "produitUpdateCommand", produit);
	}

}