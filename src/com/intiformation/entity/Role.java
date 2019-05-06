package com.intiformation.entity;


import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="role")
@Table(name="roles")

public class Role implements Serializable{

	// ######################Champs##################//
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_role")
	private Long idRole;
	
	@Column(name="role_name")
	private String roleName;
	
	@ManyToOne
	// Côté porteur de la clé FK => @JoinColumn
	@JoinColumn(name = "user_id", referencedColumnName = "id_user" )
	  private User user; 

	// #################Constructeur###############//
	// constructeur vide
	public Role() {
		super();
	}
	
	// Constructeur chargé
	public Role(String roleName) {
		super();
		this.roleName = roleName;
	}


	public Role(Long idRole, String roleName) {
		super();
		this.idRole = idRole;
		this.roleName = roleName;
	}
	//constructeur avec user

	public Role(Long idRole, String roleName, User user) {
		super();
		this.idRole = idRole;
		this.roleName = roleName;
		this.user = user;
	}
	
	// #################Encapsulation#############//
	public Long getIdRole() {
		return idRole;
	}
	

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	// #################ToString#################//
	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", roleName=" + roleName + "]";
	}
	
	
}
