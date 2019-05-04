package com.intiformation.dao;

import java.util.List;

import com.intiformation.entity.Categorie;
import com.intiformation.entity.Client;
import com.intiformation.entity.Commande;
import com.intiformation.entity.Panier;
import com.intiformation.entity.Produit;

public interface IInternauteBoutique {
	
	public List<Categorie> listerCategories();
	
	public Categorie trouverCategorie(Long idCat);
	
	public List<Produit> listerProduits();
	
	public List<Produit> trouverProduitsParMotCle(String mc);
	
	public List<Produit> trouverProduitsParCategorie(Long idCat);
	
	public List<Produit> trouverProduitsSelectionnes();
	
	public Produit trouverProduit(Long idProd);
	
	public Commande enregistrerCommande(Panier panier, Client client);

}
