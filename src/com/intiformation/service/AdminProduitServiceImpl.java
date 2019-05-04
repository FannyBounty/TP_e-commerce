package com.intiformation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.dao.IAdminProduitMetier;
import com.intiformation.entity.Categorie;
import com.intiformation.entity.Client;
import com.intiformation.entity.Commande;
import com.intiformation.entity.Panier;
import com.intiformation.entity.Produit;

@Service
public class AdminProduitServiceImpl implements IAdminProduitService {

	/* ========== Attributs ========== */
	// déclaration du dao pour injection spring
	@Autowired
	private IAdminProduitMetier adminProduitDao;

	/* ========== Setters ========== */
	/**
	 * Setter pour injection spring
	 * @param adminProduitDao
	 */
	public void setAdminProduitDao(IAdminProduitMetier adminProduitDao) {
		this.adminProduitDao = adminProduitDao;
	}

	/* ========== Méthodes implémentées ========== */
	@Override
	public List<Categorie> listCategories() {
		return adminProduitDao.listerCategories();
	}

	@Override
	public Categorie getCategorie(Long idCat) {
		return adminProduitDao.trouverCategorie(idCat);
	}

	@Override
	public List<Produit> listProduits() {
		return adminProduitDao.listerProduits();
	}

	@Override
	public List<Produit> getProduitsParMotCle(String mc) {
		return adminProduitDao.trouverProduitsParMotCle(mc);
	}

	@Override
	public List<Produit> getProduitsParCategorie(Long idCat) {
		return adminProduitDao.trouverProduitsParCategorie(idCat);
	}

	@Override
	public List<Produit> getProduitsSelectionnes() {
		return adminProduitDao.trouverProduitsSelectionnes();
	}

	@Override
	public Produit getProduitById(Long idProd) {
		return adminProduitDao.trouverProduit(idProd);
	}

	@Override
	public Commande saveCommande(Panier panier, Client client) {
		return adminProduitDao.enregistrerCommande(panier, client);
	}

	@Override
	public Long addProduit(Produit prod, Long idCat) {
		return adminProduitDao.ajouterProduit(prod, idCat);
	}

	@Override
	public void deleteProduit(Long idProd) {
		adminProduitDao.supprimerProduit(idProd);
	}

	@Override
	public void updateProduit(Produit prod) {
		adminProduitDao.modifierProduit(prod);
	}

}
