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
	// d�claration du service
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

	/* ========== M�thodes ========= */
	/**
	 * M�thode gestionnaire pour l'affichage de la liste des cat�gories
	 * @return
	 */
	@RequestMapping(value="/categories/liste", method=RequestMethod.GET)
	public String index(ModelMap modeleDonnees) {
		
		// 1. R�cup�ration de la liste des cat�gories
		List<Categorie> listeCategories = adminCategoriesManager.listCategories();
		
		// 2. Donn�es � retourner vers la vue
		modeleDonnees.addAttribute("liste_categories_attribut", listeCategories);
		
		// 3. Renvoi du nom logique de la vue
		//		R�solution : /WEB-INF/views/categories.jsp
		return "categories";
	}
	
	/**
	 * Permet d'ajouter une cat�gorie � la BDD via le formulaire 'ajouterCategorie.jsp'<br />
	 * URL d'invocation : 
	 * @return
	 */
	@RequestMapping(value="/categorie/add", method=RequestMethod.GET)
	public String saveCat(@ModelAttribute("categorieCommand") Categorie pCat,
							ModelMap donneesVue) {
		
		// 1. Ajout de la cat�gorie dans la bdd via le service
		adminCategoriesManager.addCategorie(pCat);
		
		// 2. R�cup�ration de la nouvelle liste des cat�gories dans la bdd
		donneesVue.addAttribute("liste_categories_attribut", adminCategoriesManager.listCategories());
		
		// 3. Redirection vers la page categories.jsp via l'URL categorie/add
		return "redirect:/categories/liste";
	}
	
	/**
	 * Permet d'afficher le formulaire d'ajout d'une cat�gorie, m�thode invoqu�e au clic<br />
	 * sur le lien 'Ajouter' de la page 'categories.jsp' sur une requ�te HTTP GET.<br />
	 * URL d'invocation : 
	 * @return
	 */
	@RequestMapping(value="/addCategorie", method=RequestMethod.GET)
	public ModelAndView setUpFormulaireAjoutCat() {
		
		// 1. Donn�es � retourner vers la vue
		Map<String, Object> data = new HashMap<>();
		
		// 2. D�finition de l'objet de commande (objet � lier au formulaire de la vue)
		Categorie categorie = new Categorie();
		String objetCommandeCategorie = "categorieCommand";
		
		// 3. Association entre l'objet et le nom de commande
		data.put(objetCommandeCategorie, categorie);
		
		// 4. Nom logique de la vue
		//		R�solution : /WEB-INF/views/ajouterCategorie.jsp
		String nomVue = "ajouterCategorie";
		
		// 5. Renvoi objet anonyme
		return new ModelAndView(nomVue, data);
	}
	
	public byte[] getPhoto() {
		return null;
	}
	
	/**
	 * Permet de supprimer une cat�gorie de la BDD via son id.<br />
	 * URL d'invocation : 
	 * @return
	 */
	@RequestMapping(value="categorie/delete/{categorieID}",
					method=RequestMethod.GET)
	public String suppCat(@PathVariable("categorieID") Long pIdCategorie, ModelMap donneesVue) {
		
		// 1. Suppression de la cat�gorie via le service
		adminCategoriesManager.deleteCategorie(pIdCategorie);
		
		// 2. R�cup�ration de la liste des cat�gories mise � jour
		List<Categorie> listeCategories = adminCategoriesManager.listCategories();
		
		// 3. Donn�es � retourner vers la vue categories.jsp
		donneesVue.addAttribute("liste_categories_attribut", listeCategories);
		
		// 4. Redirection vers la page 'categories.jsp'	
		return "redirect:/categories/liste";
	}
	
	/**
	 * Permet de modifier une cat�gorie de la BDD via le formulaire de la page 'modifierCategorie.jsp'.<br />
	 * URL d'invocation : 
	 * @return
	 */
	@RequestMapping(value="/categories/update", method=RequestMethod.POST)
	public String editCat(@ModelAttribute("categorieUpdateCommand") Categorie categorie,
				ModelMap donneesVue) {
		
		// 1. Mise � jour de la cat�gorie dans la BDD via le service
		adminCategoriesManager.updateCategorie(categorie);
		
		// 2. R�cup�ration de la nouvelle liste des cat�gories
		donneesVue.addAttribute("liste_categories_attribut", adminCategoriesManager.listCategories());
		
		// 3. Redirection vers categories.jsp
		return "redirect:/categories/liste";
	}
	
	/**
	 * Permet d'afficher le formulaire de modification d'une cat�gorie, m�thode invoqu�e au clic<br />
	 * sur le lien 'Modifier' de la page 'categories.jsp' sur une requ�te HTTP GET.<br />
	 * URL d'invocation : 
	 * @return
	 */
	@RequestMapping(value="/updateCategorie", method=RequestMethod.GET)
	public ModelAndView setUpFormulaireModifCat(@RequestParam("catid") Long IdCategorie) {
		
		// 1. R�cup�ration de la cat�gorie � modifier via son id pass� en param�tre de la requ�te
		Categorie categorie = adminCategoriesManager.getCategorie(IdCategorie);
		
		// 2. Renvoi du mod�le de donn�es (cat�gorie) + nom logique de la vue
		//		new ModelAndView( nom de la vue , nom de l'objet de commande , l'objet de commande )
		//		R�solution de la vue : /WEB-INF/views/modifierCategorie.jsp
		return new ModelAndView("modifierCategorie", "categorieUpdateCommand", categorie);
	}

}
