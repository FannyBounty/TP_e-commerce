package com.intiformation.dao;

import com.intiformation.entity.Categorie;
import com.intiformation.entity.Role;
import com.intiformation.entity.User;
import com.intiformation.service.IAdminProduitService;

public interface IAdminCategoriesMetier extends IAdminProduitService {
	
	public Long ajouterCategorie(Categorie cat);
	
	public void supprimerCategorie(Long idCat);
	
	public void modifierCategorie(Categorie cat);
	
	public void ajouterUser(User user);
	
	public void attribuerRole(Role role, Long userID);

}
