package com.intiformation.dao;

import com.intiformation.entity.Produit;

public interface IAdminProduitMetier extends IBoutiqueDAO {
	
	public Long ajouterProduit(Produit prod, Long idCat);
	
	public void supprimerProduit(Long idProd);
	
	public void modifierProduit(Produit prod);

}
