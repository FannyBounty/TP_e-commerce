package com.intiformation.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="client")
@Table(name="clients")
public class Client implements Serializable{
	

	//######################Champs##################//
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_client")
	private Long idClient;
	
	@Column(name="nom_client")
	private String nomClient;
	
	@Column(name="email_client")
	private String email;
	
	@Column(name="adresse")
	private String adresse;
	
	@Column(name="tel")
	private String tel;
	
	//@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    //private List<Commande> ListCommande;
	
	//#################Constructeur###############//
	//constructeur vide 
	public Client() {
		super();
	}
	
	//constructeur sans idClient
	
	public Client(String nomClient, String email, String adresse, String tel) {
		super();
		this.nomClient = nomClient;
		this.email = email;
		this.adresse = adresse;
		this.tel = tel;
	}
	
	//Constructeur chargé
	
	public Client(Long idClient, String nomClient, String email, String adresse, String tel) {
		super();
		this.idClient = idClient;
		this.nomClient = nomClient;
		this.email = email;
		this.adresse = adresse;
		this.tel = tel;
	}
	//constructeur avec le client 


	public Client(Long idClient, String nomClient, String email, String adresse, String tel,
			List<Commande> listCommande) {
		super();
		this.idClient = idClient;
		this.nomClient = nomClient;
		this.email = email;
		this.adresse = adresse;
		this.tel = tel;
		this.ListCommande = listCommande;
	}
	
	//#################Encapsulation#############//
	
	public Long getIdClient() {
		return idClient;
	}
	
	

	public List<Commande> getListCommande() {
		return ListCommande;
	}

	public void setListCommande(List<Commande> listCommande) {
		ListCommande = listCommande;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
	//#################ToString#################//
	
	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nomClient=" + nomClient + ", email=" + email + ", adresse=" + adresse
				+ ", tel=" + tel + "]";
	}


}//Fin class
