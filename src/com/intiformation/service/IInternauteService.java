package com.intiformation.service;

import java.util.List;

import com.intiformation.entity.Categorie;
import com.intiformation.entity.Client;
import com.intiformation.entity.Commande;
import com.intiformation.entity.Panier;
import com.intiformation.entity.Produit;

public interface IInternauteService {
	
	public List<Categorie> listCategories();
	
	public Categorie getCategorie(Long idCat);
	
	public List<Produit> listProduits();
	
	public List<Produit> getProduitsParMotCle(String mc);
	
	public List<Produit> getProduitsParCategorie(Long idCat);
	
	public List<Produit> getProduitsSelectionnes();
	
	public Produit getProduitById(Long idProd);
	
	public Commande saveCommande(Panier panier, Client client);

}
