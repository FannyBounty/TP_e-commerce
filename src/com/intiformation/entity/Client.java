package com.intiformation.entity;

public class Client {
	

	//######################Champs##################//
	private Long idClient;
	private String nomClient;
	private String email;
	private String adresse;
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
