package com.intiformation.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.intiformation.entity.Categorie;
import com.intiformation.entity.Client;
import com.intiformation.entity.Commande;
import com.intiformation.entity.Panier;
import com.intiformation.entity.Produit;
import com.intiformation.entity.User;

/**
 * Implémentation concrète de IBoutiqueDAO
 * @author IN-MP-019
 *
 */
@Repository
public class BoutiqueDAOImpl implements IBoutiqueDAO {
	
	// déclaration de la session factory d'hibernate
	@Autowired
	private SessionFactory sf;
	
	/**
	 * Setter pour injection spring
	 * @param sf
	 */
	public void setSessionFactory(SessionFactory sf) {
		this.sf = sf;
	}

	@Transactional
	@Override
	public Long ajouterCategorie(Categorie cat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(readOnly=true)
	@Override
	public List<Categorie> listeCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(readOnly=true)
	@Override
	public Categorie trouverCategorie(Long idCat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public void supprimerCategorie(Long idCat) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void modifierCategorie(Long idCat) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public Long ajouterProduit(Produit prod, Long idCat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(readOly=true)
	@Override
	public List<Produit> listerProduits() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(readOnly=true)
	@Override
	public List<Produit> trouverProduitsParMotCle(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(readOnly=true)
	@Override
	public List<Produit> trouverProduitsParCategorie(Long idCat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(readOnly=true)
	@Override
	public List<Produit> trouverProduitsSelectionnes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(readOnly=true)
	@Override
	public Produit trouverProduit(Long idProd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public void supprimerProduit(Long idProd) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void modifierProduit(Produit prod) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void ajouterUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public Commande enregistrerCommande(Panier p, Client c) {
		// TODO Auto-generated method stub
		return null;
	}

}
