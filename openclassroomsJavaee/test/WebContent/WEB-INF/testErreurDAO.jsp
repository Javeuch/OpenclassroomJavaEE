<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test Erreur DAO</title>
</head>
<body>

<c:if test="${ !empty erreur }"><p style="color:red;"><c:out value="${ erreur }" /></p></c:if>

<form method="post" action="testErreurDAO">
		<p>
			<label for="nom">Nom : </label> 
			<input type="text" name="nom" id="nom" />
		</p>
		<p>
			<label for="prenom">Prénom : </label> 
			<input type="text" name="prenom" id="prenom" />
		</p>

		<input type="submit" />
	</form>

<p style="color:grey; font-style:italic;"> Liste des utilisateurs présents dans notre BDD MySQL via JDBC avec un Design Pattern DAO "Data Access Object" gérant les exceptions: </p>
	<ul>
		<c:forEach var="utilisateur" items="${ utilisateurs }">
			<li>
			<c:out value="${ utilisateur.prenom }" /> 
			<c:out value="${ utilisateur.nom }" />
			</li>
		</c:forEach>
	</ul>
</body>
</html>