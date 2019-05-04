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

	/* ========== Méthodes ========= */
	/**
	 * Méthode gestionnaire pour l'affichage de la liste des catégories
	 * @return
	 */
	@RequestMapping(value="/categories/liste", method=RequestMethod.GET)
	public String index(ModelMap modeleDonnees) {
		
		// 1. Récupération de la liste des catégories
		List<Categorie> listeCategories = adminCategoriesManager.listCategories();
		
		// 2. Données à retourner vers la vue
		modeleDonnees.addAttribute("liste_categories_attribut", listeCategories);
		
		// 3. Renvoi du nom logique de la vue
		//		Résolution : /WEB-INF/views/categories.jsp
		return "categories";
	}
	
	/**
	 * Permet d'ajouter une catégorie à la BDD via le formulaire 'ajouterCategorie.jsp'<br />
	 * URL d'invocation : 
	 * @return
	 */
	@RequestMapping(value="/categorie/add", method=RequestMethod.GET)
	public String saveCat(@ModelAttribute("categorieCommand") Categorie pCat,
							ModelMap donneesVue) {
		
		// 1. Ajout de la catégorie dans la bdd via le service
		adminCategoriesManager.addCategorie(pCat);
		
		// 2. Récupération de la nouvelle liste des catégories dans la bdd
		donneesVue.addAttribute("liste_categories_attribut", adminCategoriesManager.listCategories());
		
		// 3. Redirection vers la page categories.jsp via l'URL categorie/add
		return "redirect:/categories/liste";
	}
	
	/**
	 * Permet d'afficher le formulaire d'ajout d'une catégorie, méthode invoquée au clic<br />
	 * sur le lien 'Ajouter' de la page 'categories.jsp' sur une requête HTTP GET.<br />
	 * URL d'invocation : 
	 * @return
	 */
	@RequestMapping(value="/addCategorie", method=RequestMethod.GET)
	public ModelAndView setUpFormulaireAjoutCat() {
		
		// 1. Données à retourner vers la vue
		Map<String, Object> data = new HashMap<>();
		
		// 2. Définition de l'objet de commande (objet à lier au formulaire de la vue)
		Categorie categorie = new Categorie();
		String objetCommandeCategorie = "categorieCommand";
		
		// 3. Association entre l'objet et le nom de commande
		data.put(objetCommandeCategorie, categorie);
		
		// 4. Nom logique de la vue
		//		Résolution : /WEB-INF/views/ajouterCategorie.jsp
		String nomVue = "ajouterCategorie";
		
		// 5. Renvoi objet anonyme
		return new ModelAndView(nomVue, data);
	}
	
	public byte[] getPhoto() {
		return null;
	}
	
	/**
	 * Permet de supprimer une catégorie de la BDD via son id.<br />
	 * URL d'invocation : 
	 * @return
	 */
	@RequestMapping(value="categorie/delete/{categorieID}",
					method=RequestMethod.GET)
	public String suppCat(@PathVariable("categorieID") Long pIdCategorie, ModelMap donneesVue) {
		
		// 1. Suppression de la catégorie via le service
		adminCategoriesManager.deleteCategorie(pIdCategorie);
		
		// 2. Récupération de la liste des catégories mise à jour
		List<Categorie> listeCategories = adminCategoriesManager.listCategories();
		
		// 3. Données à retourner vers la vue categories.jsp
		donneesVue.addAttribute("liste_categories_attribut", listeCategories);
		
		// 4. Redirection vers la page 'categories.jsp'	
		return "redirect:/categories/liste";
	}
	
	/**
	 * Permet de modifier une catégorie de la BDD via le formulaire de la page 'modifierCategorie.jsp'.<br />
	 * URL d'invocation : 
	 * @return
	 */
	@RequestMapping(value="/categories/update", method=RequestMethod.POST)
	public String editCat(@ModelAttribute("categorieUpdateCommand") Categorie categorie,
				ModelMap donneesVue) {
		
		// 1. Mise à jour de la catégorie dans la BDD via le service
		adminCategoriesManager.updateCategorie(categorie);
		
		// 2. Récupération de la nouvelle liste des catégories
		donneesVue.addAttribute("liste_categories_attribut", adminCategoriesManager.listCategories());
		
		// 3. Redirection vers categories.jsp
		return "redirect:/categories/liste";
	}
	
	/**
	 * Permet d'afficher le formulaire de modification d'une catégorie, méthode invoquée au clic<br />
	 * sur le lien 'Modifier' de la page 'categories.jsp' sur une requête HTTP GET.<br />
	 * URL d'invocation : 
	 * @return
	 */
	@RequestMapping(value="/updateCategorie", method=RequestMethod.GET)
	public ModelAndView setUpFormulaireModifCat(@RequestParam("catid") Long IdCategorie) {
		
		// 1. Récupération de la catégorie à modifier via son id passé en paramètre de la requête
		Categorie categorie = adminCategoriesManager.getCategorie(IdCategorie);
		
		// 2. Renvoi du modèle de données (catégorie) + nom logique de la vue
		//		new ModelAndView( nom de la vue , nom de l'objet de commande , l'objet de commande )
		//		Résolution de la vue : /WEB-INF/views/modifierCategorie.jsp
		return new ModelAndView("modifierCategorie", "categorieUpdateCommand", categorie);
	}

}
