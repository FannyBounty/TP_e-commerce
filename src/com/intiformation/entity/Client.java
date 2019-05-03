package com.intiformation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="client")
@Table(name="clients")
public class Client {
	

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
	
	
	//#################Encapsulation#############//
	
	public Long getIdClient() {
		return idClient;
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
