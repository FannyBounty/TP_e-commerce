package com.intiformation.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="user")
@Table(name="users")
public class User implements Serializable{

	// ######################Champs##################//
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_user")
	private Long idUser;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="actived")
	private boolean actived;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Role> ListRole;
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
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", userName=" + userName + ", password=" + password + ", actived=" + actived
				+ "]";
	}
}
