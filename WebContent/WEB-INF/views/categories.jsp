<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
	<!--  taglib -->
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FLY Admin - Cat�gories</title>
</head>
<body>

	<!-- Affichage de la liste des cat�gories
			> R�cup�ration de la liste via le mod�le de donn�es renvoy� par le contr�leur AdminCategoriesController -->

	<div align="center">
		<h1 style="background-color: lightblue; color: darkblue;">
			Liste des cat�gories
		</h1>
		
		<table border="1" width="60%" cellpadding="3" cellspacing="0">
		
			<!--  Section ajout d'une cat�gorie -->
			<tr>
				<td colspan="4" align="left">
					<a href="${pageContext.request.contextPath}/addCategorie" style="background-color: lightblue;">
					Ajouter une nouvelle cat�gorie
					</a> 
				</td>
			</tr>
			
			<!--  Section liste des cat�gories existantes dans la BDD -->
			<tr bgcolor="grey" style="color: white;">
				<th>N�</th>
				<th>Nom</th>
				<th>Photo</th>
				<th>Description</th>
			</tr>
			
			<c:forEach items="${liste_categories_attribut}" var="cat">
				<tr>
					<td>${cat.idCategorie}</td>
					<td>${cat.nomCategorie}</td>
					<td> <!-- photos � g�rer --> </td>
					<td>${cat.description}</td>
					
					<!-- Colonne modification -->
					<td>
						<a href="${pageContext.request.contextPath}/updateCategorie?catid=${cat.idCategorie}">Modifier</a>
							<!--  envoi requ�te HTTP en GET vers setUpFormulaireModifCat() 
									du contr�leur AdminCategoriesController -->
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