<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
	<!--  taglib -->
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FLY Admin - Catégories</title>
</head>
<body>

	<!-- Affichage de la liste des catégories
			> Récupération de la liste via le modèle de données renvoyé par le contrôleur AdminCategoriesController -->

	<div align="center">
		<h1 style="background-color: lightblue; color: darkblue;">
			Liste des catégories
		</h1>
		
		<table border="1" width="60%" cellpadding="3" cellspacing="0">
		
			<!--  Section ajout d'une catégorie -->
			<tr>
				<td colspan="4" align="left">
					<a href="${pageContext.request.contextPath}/addCategorie" style="background-color: lightblue;">
					Ajouter une nouvelle catégorie
					</a> 
				</td>
			</tr>
			
			<!--  Section liste des catégories existantes dans la BDD -->
			<tr bgcolor="grey" style="color: white;">
				<th>N°</th>
				<th>Nom</th>
				<th>Photo</th>
				<th>Description</th>
			</tr>
			
			<c:forEach items="${liste_categories_attribut}" var="cat">
				<tr>
					<td>${cat.idCategorie}</td>
					<td>${cat.nomCategorie}</td>
					<td> <!-- photos à gérer --> </td>
					<td>${cat.description}</td>
					
					<!-- Colonne modification -->
					<td>
						<a href="${pageContext.request.contextPath}/updateCategorie?catid=${cat.idCategorie}">Modifier</a>
							<!--  envoi requête HTTP en GET vers setUpFormulaireModifCat() 
									du contrôleur AdminCategoriesController -->
					</td>
					
					<!-- Colonne suppression -->
					<td>
						<a href="${pageContext.request.contextPath}/categorie/delete/${cat.idCategorie}">Supprimer</a>
					</td>
				</tr>
			</c:forEach>
		</table>	
	</div>

</body>
</html>