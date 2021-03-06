<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <!--  ajout de la biblioth�que de balises (taglib) de Spring MVC -->
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FLY Admin - Cat�gories / Formulaire de modification</title>
</head>
<body>

	<!--  Formulaire pour la mise � jour d'une cat�gorie -->
	
	<div align="center">
	
		<h1 style="background-color: lightblue; color: darkblue">Modification d'une cat�gorie</h1>
		
		<table>
			<!-- formulaire spring mvc -->
			<form:form modelAttribute="categorieUpdateCommand" action="categorie/update" method="post">
				<!-- champ cach� pour r�cup�rer l'id de la cat�gorie � modifier -->
				<tr>
					<td><form:hidden path="id" /></td>
				</tr>
				
				<!-- champs pouvant �tre modifi�s par l'utilisateur -->
				<tr>
					<td> <form:label path="nom">Nom :</form:label> </td>
					<td> <form:input path="nom" /> </td>
				</tr>
				<tr>
					<td><form:label path="photo">Photo : </form:label></td>
					<td> Import nouvelle photo � g�rer</td>
				</tr>
				<tr>
					<td><form:label path="description">Description : </form:label></td>
					<td><form:input path="description" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Soumettre" /></td>
				</tr>
			</form:form>
			
		</table>
		
	</div>
	
</body>
</html>