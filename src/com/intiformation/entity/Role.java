package com.intiformation.entity;

public class Role {

	// ######################Champs##################//
	
	private Long idRole;
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
