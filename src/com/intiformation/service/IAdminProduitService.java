package com.intiformation.service;

import com.intiformation.entity.Produit;

public interface IAdminProduitService extends IInternauteService {
	
	public Long addProduit(Produit prod, Long idCat);
	
	public void deleteProduit(Long idProd);
	
	public void updateProduit(Produit prod);

}

