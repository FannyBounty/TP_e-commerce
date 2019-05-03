package com.intiformation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="role")
@Table(name="roles")
public class Role {

	// ######################Champs##################//
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_role")
	private Long idRole;
	
	@Column(name="role_name")
	private String roleName;
	

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
	

	
	// #################ToString#################//
	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", roleName=" + roleName + "]";
	}
	
	
}
