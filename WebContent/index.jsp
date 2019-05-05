<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
	<!--  taglib -->
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Eboutique FLY Bienvenue | Fanny Louis-Marie Yannick</title>
</head>
<body>

	<!-- Affichage de la liste des produits
			> R�cup�ration de la liste via le mod�le de donn�es renvoy� par le contr�leur InternauteBoutiqueController -->

	<div align="center">
		<h1 style="background-color: lightblue; color: darkblue;">
			Produits disponibles
		</h1>
		
		<table border="1" width="60%" cellpadding="3" cellspacing="0">
		
			<!--  SECTION PROVISOIRE AVANT AJOUT SECURITY/LOGIN -->
			<tr>
				<td colspan="2" align="left">
					<a href="${pageContext.request.contextPath}/categories/liste" style="background-color: lightblue;">
					Page Admin Cat�gories
					</a> 
				</td>

				<td colspan="2" align="left">
					<a href="${pageContext.request.contextPath}/produits/liste" style="background-color: lightblue;">
					Page Admin Produits
					</a> 
				</td>
			</tr>
			
			<!--  Section liste des produits disponibles dans la BDD -->
			<tr bgcolor="grey" style="color: white;">
				<th>D�signation</th>
				<th>Description</th>
				<th>Prix</th>
				<th>Aper�u</th>
			</tr>
			
			<c:forEach items="${liste_produits_attribut}" var="prod">
				<tr>
					<!-- champs cach�s -->
					<tr>
						<td><form:hidden path="idProduit" /></td>
						<td><form:hidden path="ListCategorie" /></td>
					</tr>
					
					<!-- champs pouvant �tre modifi�s par l'utilisateur -->
					<td>${prod.designation}</td>
					<td>${prod.description}</td>
					<td>${prod.prix}</td>
					<td> <!-- photo � g�rer --> </td>
				</tr>
				<tr>
					<td colspan="2"><form:label path="quantite">Quantit� : </form:label><form:input path="quantite" /></td>
					<td colspan="2"><input type="submit" value="Ajouter au panier" /></td>
				</tr>
			</c:forEach>
			
		</table>	
	</div>


</body>
</html>