package com.intiformation.dao;

import java.util.List;

import com.intiformation.entity.Categorie;
import com.intiformation.entity.Client;
import com.intiformation.entity.Commande;
import com.intiformation.entity.Panier;
import com.intiformation.entity.Produit;
import com.intiformation.entity.Role;
import com.intiformation.entity.User;

public class BoutiqueMetierImpl implements IAdminCategoriesMetier {

	@Override
	public void supprimerProduit(Long idProd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierProduit(Produit prod) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long ajouterCategorie(Categorie cat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categorie> listeCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie trouverCategorie(Long idCat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifierCategorie(Long idCat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long ajouterProduit(Produit prod, Long idCat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> listerProduits() {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Commande enregistrerCommande(Panier p, Client c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerCategorie(Long idCat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierCategorie(Categorie cat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attribuerRole(Role role, Long userID) {
		// TODO Auto-generated method stub
		
	}

}
