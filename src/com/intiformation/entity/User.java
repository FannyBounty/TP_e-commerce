package com.intiformation.entity;

public class User {

	// ######################Champs##################//
	private Long idUser;
	private String userName;
	private String password;
	private boolean actived;
	
	
	// #################Constructeur###############//
	// constructeur vide
	
	public User() {
		super();
	}
	// constructeur sans idUser
	public User(String userName, String password, boolean actived) {
		super();
		this.userName = userName;
		this.password = password;
		this.actived = actived;
	}

	// Constructeur chargé
	public User(Long idUser, String userName, String password, boolean actived) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.password = password;
		this.actived = actived;
	}
	// #################Encapsulation#############//
	
	public Long getIdUser() {
		return idUser;
	}
	
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActived() {
		return actived;
	}
	public void setActived(boolean actived) {
		this.actived = actived;
	}
	

	// #################ToString#################//

}
