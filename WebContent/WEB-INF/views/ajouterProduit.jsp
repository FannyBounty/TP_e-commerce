<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <!--  ajout de la bibliothèque de balises (taglib) de Spring MVC -->
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FLY Admin - Produits / Formulaire d'ajout</title>
</head>
<body>

	<!--  Formulaire pour l'ajout d'un produit -->
	
	<div align="center">
		<h1 style="background-color: lightblue; color: darkblue">Ajout d'un nouveau produit</h1>
		
		<table> 
			<!-- Formulaire Spring MVC -->
			<form:form modelAttribute="produitCommand" action="produit/add" method="post">
				<tr>
					<td><form:label path="designation">Nom : </form:label></td>
					<td><form:input path="designation" /></td>
				</tr>
				<tr>
					<td><form:label path="prix">Prix unitaire : </form:label></td>
					<td><form:input path="prix" /></td>
				</tr>
				<tr>
					<td><form:label path="description">Description : </form:label></td>
					<td><form:input path="description" /></td>
				</tr>
				<tr>
					<td><form:label path="photo">Photo : </form:label></td>
					<td> Import photo à gérer</td>
				</tr>
				<tr>
					<td><input type="submit" value="Soumettre" /></td>
				</tr>
			</form:form>
		</table>
	</div>

</body>
</html>