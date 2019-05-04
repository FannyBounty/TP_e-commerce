package com.intiformation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.dao.IBoutiqueDAO;
import com.intiformation.entity.Categorie;
import com.intiformation.entity.Client;
import com.intiformation.entity.Commande;
import com.intiformation.entity.Panier;
import com.intiformation.entity.Produit;
import com.intiformation.entity.User;

@Service
public class BoutiqueServiceImpl implements IBoutiqueService {

	/* ========== Attributs ========== */
	// déclaration du dao pour injection spring
	@Autowired
	private IBoutiqueDAO boutiqueDao;

	/* ========== Setters ========== */
	/**
	 * Setter pour injection spring
	 * @param boutiqueDao
	 */
	public void setBoutiqueDao(IBoutiqueDAO boutiqueDao) {
		this.boutiqueDao = boutiqueDao;
	}

	/* ========== Méthodes implémentées ========== */
	@Override
	public Long addCategorie(Categorie cat) {
		return boutiqueDao.ajouterCategorie(cat);
	}

	@Override
	public List<Categorie> listCategories() {
		return boutiqueDao.listerCategories();
	}

	@Override
	public Categorie getCategorie(Long idCat) {
		return boutiqueDao.trouverCategorie(idCat);
	}

	@Override
	public void deleteCategorie(Long idCat) {
		boutiqueDao.supprimerCategorie(idCat);
	}

	@Override
	public void updateCategorie(Categorie cat) {
		boutiqueDao.modifierCategorie(cat);
	}

	@Override
	public Long addProduit(Produit prod, Long idCat) {
		return boutiqueDao.ajouterProduit(prod, idCat);
	}

	@Override
	public List<Produit> listProduits() {
		return boutiqueDao.listerProduits();
	}

	@Override
	public List<Produit> getProduitsParMotCle(String mc) {
		return boutiqueDao.trouverProduitsParMotCle(mc);
	}

	@Override
	public List<Produit> getProduitsParCategorie(Long idCat) {
		return boutiqueDao.trouverProduitsParCategorie(idCat);
	}

	@Override
	public List<Produit> getProduitsSelectionnes() {
		return boutiqueDao.trouverProduitsSelectionnes();
	}

	@Override
	public Produit getProduitById(Long idProd) {
		return boutiqueDao.trouverProduit(idProd);
	}

	@Override
	public void deleteProduit(Long idProd) {
		boutiqueDao.supprimerProduit(idProd);
	}

	@Override
	public void updateProduit(Produit prod) {
		boutiqueDao.modifierProduit(prod);
	}

	@Override
	public void addUser(User user) {
		boutiqueDao.ajouterUser(user);
	}

	@Override
	public Commande saveCommande(Panier panier, Client client) {
		return boutiqueDao.enregistrerCommande(panier, client);
	}

}
