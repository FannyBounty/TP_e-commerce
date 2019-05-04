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
import com.intiformation.entity.Role;
import com.intiformation.entity.User;

@Repository
public class BoutiqueMetierImpl implements IAdminCategoriesMetier {
	
	private IBoutiqueDAO dao;
	
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

	@Override
	public Long ajouterCategorie(Categorie cat) {
		sf.getCurrentSession().save(cat);
		return cat.getIdCategorie();
	}

	@Override
	public void supprimerCategorie(Long idCat) {
		sf.getCurrentSession().delete(trouverCategorie(idCat));
	}

	@Override
	public void modifierCategorie(Categorie cat) {
		sf.getCurrentSession().update(cat);
	}

	@Override
	public void ajouterUser(User user) {
		sf.getCurrentSession().save(user);
	}

	@Override
	public void attribuerRole(Role role, Long userID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long ajouterProduit(Produit prod, Long idCat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerProduit(Long idProd) {
		sf.getCurrentSession().delete(trouverProduit(idProd));
	}

	@Override
	public void modifierProduit(Produit prod) {
		sf.getCurrentSession().update(prod);
	}

	@Override
	public List<Categorie> listerCategories() {
		return sf.getCurrentSession().createQuery("FROM categories").list();
	}

	@Override
	public Categorie trouverCategorie(Long idCat) {
		return sf.getCurrentSession().get(Categorie.class, idCat);
	}

	@Override
	public List<Produit> listerProduits() {
		return sf.getCurrentSession().createQuery("FROM produits").list();
	}

	@Override
	public List<Produit> trouverProduitsParMotCle(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> trouverProduitsParCategorie(Long idCat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> trouverProduitsSelectionnes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit trouverProduit(Long idProd) {
		return sf.getCurrentSession().get(Produit.class, idProd);
	}

	@Override
	public Commande enregistrerCommande(Panier panier, Client client) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
