package com.intiformation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.intiformation.dao.IInternauteBoutique;
import com.intiformation.entity.Categorie;
import com.intiformation.entity.Client;
import com.intiformation.entity.Commande;
import com.intiformation.entity.Panier;
import com.intiformation.entity.Produit;

public class InternauteServiceImpl implements IInternauteService {
	
	// déclaration du dao pour injection spring
	@Autowired
	private IInternauteBoutique internauteBoutiqueDao;

	/**
	 * Setter pour injection spring
	 * @param internauteBoutiqueDao
	 */
	public void setInternauteBoutiqueDao(IInternauteBoutique internauteBoutiqueDao) {
		this.internauteBoutiqueDao = internauteBoutiqueDao;
	}

	@Override
	public List<Categorie> listCategories() {
		return internauteBoutiqueDao.listerCategories();
	}

	@Override
	public Categorie getCategorie(Long idCat) {
		return internauteBoutiqueDao.trouverCategorie(idCat);
	}

	@Override
	public List<Produit> listProduits() {
		return internauteBoutiqueDao.listerProduits();
	}

	@Override
	public List<Produit> getProduitsParMotCle(String mc) {
		return internauteBoutiqueDao.trouverProduitsParMotCle(mc);
	}

	@Override
	public List<Produit> getProduitsParCategorie(Long idCat) {
		return internauteBoutiqueDao.trouverProduitsParCategorie(idCat);
	}

	@Override
	public List<Produit> getProduitsSelectionnes() {
		return internauteBoutiqueDao.trouverProduitsSelectionnes();
	}

	@Override
	public Produit getProduitById(Long idProd) {
		return internauteBoutiqueDao.trouverProduit(idProd);
	}

	@Override
	public Commande saveCommande(Panier panier, Client client) {
		return internauteBoutiqueDao.enregistrerCommande(panier, client);
	}

}
