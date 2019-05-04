package com.intiformation.service;

import com.intiformation.entity.Categorie;
import com.intiformation.entity.Role;
import com.intiformation.entity.User;

public interface IAdminCategoriesService extends IAdminProduitService{
	
	public Long addCategorie(Categorie cat);
	
	public void deleteCategorie(Long idCat);
	
	public void updateCategorie(Categorie cat);
	
	public void addUser(User user);
	
	public void assignRole(Role role, Long userID);

}
