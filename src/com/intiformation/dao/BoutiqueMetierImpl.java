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

	@Transactional
	@Override
	public void supprimerProduit(Long idProd) {
		sf.getCurrentSession().delete(trouverProduit(idProd));
	}

	@Transactional
	@Override
	public void modifierProduit(Produit prod) {
		sf.getCurrentSession().update(prod);
	}

	@Transactional
	@Override
	public Long ajouterCategorie(Categorie cat) {
		sf.getCurrentSession().save(cat);
		return cat.getIdCategorie();
	}

	@Transactional(readOnly=true)
	@Override
	public List<Categorie> listeCategories() {
		return sf.getCurrentSession().createQuery("FROM categories").list();
	}

	@Transactional(readOnly=true)
	@Override
	public Categorie trouverCategorie(Long idCat) {
		return sf.getCurrentSession().get(Categorie.class, idCat);
	}

	@Transactional
	@Override
	public Long ajouterProduit(Produit prod, Long idCat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(readOnly=true)
	@Override
	public List<Produit> listerProduits() {
		return sf.getCurrentSession().createQuery("FROM produits").list();
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
		return sf.getCurrentSession().get(Produit.class, idProd);
	}

	@Transactional
	@Override
	public Commande enregistrerCommande(Panier p, Client c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerCategorie(Long idCat) {
		sf.getCurrentSession().delete(trouverCategorie(idCat));
	}

	@Transactional
	@Override
	public void modifierCategorie(Categorie cat) {
		sf.getCurrentSession().update(cat);
	}

	@Transactional
	@Override
	public void ajouterUser(User user) {
		sf.getCurrentSession().save(user);
	}

	@Transactional
	@Override
	public void attribuerRole(Role role, Long userID) {
		User user = sf.getCurrentSession().get(User.class, userID);
		role.setUser(user);
		sf.getCurrentSession().update(role);
	}

}
