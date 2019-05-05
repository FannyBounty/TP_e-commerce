<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
	<!--  taglib -->
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin - Produits</title>
</head>
<body>

	<!-- Affichage de la liste des produits
			> Récupération de la liste via le modèle de données renvoyé par le contrôleur AdminProduitController -->

	<div align="center">
		<h1 style="background-color: lightblue; color: darkblue;">
			Liste des produits
		</h1>
		
		<table border="1" width="60%" cellpadding="3" cellspacing="0">
		
			<!--  Section ajout d'un produit -->
			<tr>
				<td colspan="4" align="left">
					<a href="${pageContext.request.contextPath}/addProduit" style="background-color: lightblue;">
					Ajouter un nouveau produit
					</a> 
				</td>
			</tr>
			
			<!--  Section liste des produits existants dans la BDD -->
			<tr bgcolor="grey" style="color: white;">
				<th>N°</th>
				<th>Désignation</th>
				<th>Description</th>
				<th>Prix</th>
				<th>Photo</th>
			</tr>
			
			<c:forEach items="${liste_produits_attribut}" var="prod">
				<tr>
					<td>${prod.idProduit}</td>
					<td>${prod.designation}</td>
					<td>${prod.description}</td>
					<td>${prod.prix}</td>
					<td> <!-- photo à gérer --> </td>
					
					<!-- Colonne modification -->
					<td>
						<a href="${pageContext.request.contextPath}/updateProduit?prodid=${prod.idProduit}">Modifier</a>
							<!--  envoi requête HTTP en GET vers setUpFormulaireModifProd() 
									du contrôleur AdminProduitController -->
					</td>
					
					<!-- Colonne suppression -->
					<td>
						<a href="${pageContext.request.contextPath}/produit/delete/${prod.idProduit}">Supprimer</a>
					</td>
				</tr>
			</c:forEach>
		</table>	
	</div>

</body>
</html>