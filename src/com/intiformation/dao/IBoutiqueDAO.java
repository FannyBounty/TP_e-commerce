package com.intiformation.dao;

import java.util.List;

import com.intiformation.entity.Categorie;
import com.intiformation.entity.Client;
import com.intiformation.entity.Commande;
import com.intiformation.entity.Panier;
import com.intiformation.entity.Produit;
import com.intiformation.entity.User;

public interface IBoutiqueDAO {
	
	public Long ajouterCategorie(Categorie cat);
	
	public List<Categorie> listeCategories();
	
	public Categorie trouverCategorie(Long idCat);
	
	public void supprimerCategorie(Long idCat);
	
	public void modifierCategorie(Long idCat);
	
	public Long ajouterProduit(Produit prod, Long idCat);
	
	public List<Produit> listerProduits();
	
	public List<Produit> trouverProduitsParMotCle(String mc);
	
	public List<Produit> trouverProduitsParCategorie(Long idCat);
	
	public List<Produit> trouverProduitsSelectionnes();
	
	public Produit trouverProduit(Long idProd);
	
	public void supprimerProduit(Long idProd);
	
	public void modifierProduit(Produit prod);
	
	public void ajouterUser(User user);
	
	public Commande enregistrerCommande(Panier p, Client c);

}
