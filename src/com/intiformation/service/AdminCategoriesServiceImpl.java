package com.intiformation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.dao.IAdminCategoriesMetier;
import com.intiformation.entity.Categorie;
import com.intiformation.entity.Client;
import com.intiformation.entity.Commande;
import com.intiformation.entity.Panier;
import com.intiformation.entity.Produit;
import com.intiformation.entity.Role;
import com.intiformation.entity.User;

@Service
public class AdminCategoriesServiceImpl implements IAdminCategoriesService {

	/* ========== Attributs ========== */
	// déclaration du dao pour injection spring
	@Autowired
	private IAdminCategoriesMetier adminCategoriesDao;

	/* ========== Setters ========== */
	/**
	 * Setter pour injection spring
	 * @param fonctionnaireDao
	 */
	public void setAdminCategoriesDao(IAdminCategoriesMetier adminCategoriesDao) {
		this.adminCategoriesDao = adminCategoriesDao;
	}

	/* ========== Méthodes implémentées ========== */
	@Override
	public Long addProduit(Produit prod, Long idCat) {
		return adminCategoriesDao.ajouterProduit(prod, idCat);
	}

	@Override
	public void deleteProduit(Long idProd) {
		adminCategoriesDao.supprimerProduit(idProd);
	}

	@Override
	public void updateProduit(Produit prod) {
		adminCategoriesDao.supprimerProduit(prod);
	}

	@Override
	public List<Categorie> listCategories() {
		return adminCategoriesDao.listerCategories();
	}

	@Override
	public Categorie getCategorie(Long idCat) {
		return adminCategoriesDao.trouverCategorie(idCat);
	}

	@Override
	public List<Produit> listProduits() {
		return adminCategoriesDao.listerProduits();
	}

	@Override
	public List<Produit> getProduitsParMotCle(String mc) {
		return adminCategoriesDao.trouverProduitsParMotCle(mc);
	}

	@Override
	public List<Produit> getProduitsParCategorie(Long idCat) {
		return adminCategoriesDao.trouverProduitsParCategorie(idCat);
	}

	@Override
	public List<Produit> getProduitsSelectionnes() {
		return adminCategoriesDao.trouverProduitsSelectionnes();
	}

	@Override
	public Produit getProduitById(Long idProd) {
		return adminCategoriesDao.trouverProduit(idProd);
	}

	@Override
	public Commande saveCommande(Panier panier, Client client) {
		return adminCategoriesDao.enregistrerCommande(panier, client);
	}

	@Override
	public Long addCategorie(Categorie cat) {
		return adminCategoriesDao.ajouterCategorie(cat);
	}

	@Override
	public void deleteCategorie(Long idCat) {
		adminCategoriesDao.supprimerCategorie(idCat);
	}

	@Override
	public void updateCategorie(Categorie cat) {
		adminCategoriesDao.modifierCategorie(cat);
	}

	@Override
	public void addUser(User user) {
		adminCategoriesDao.ajouterUser(user);
	}

	@Override
	public void assignRole(Role role, Long userID) {
		adminCategoriesDao.attribuerRole(role, userID);
	}

}
