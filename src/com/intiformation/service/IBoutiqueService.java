package com.intiformation.service;

import java.util.List;

import com.intiformation.entity.Categorie;
import com.intiformation.entity.Client;
import com.intiformation.entity.Commande;
import com.intiformation.entity.Panier;
import com.intiformation.entity.Produit;
import com.intiformation.entity.User;

public interface IBoutiqueService {
	
	public Long addCategorie(Categorie cat);
	
	public List<Categorie> listCategories();
	
	public Categorie getCategorie(Long idCat);
	
	public void deleteCategorie(Long idCat);
	
	public void updateCategorie(Categorie cat);
	
	public Long addProduit(Produit prod, Long idCat);
	
	public List<Produit> listProduits();
	
	public List<Produit> getProduitsParMotCle(String mc);
	
	public List<Produit> getProduitsParCategorie(Long idCat);
	
	public List<Produit> getProduitsSelectionnes();
	
	public Produit getProduitById(Long idProd);
	
	public void deleteProduit(Long idProd);
	
	public void updateProduit(Produit prod);
	
	public void addUser(User user);
	
	public Commande saveCommande(Panier p, Client c);

}
