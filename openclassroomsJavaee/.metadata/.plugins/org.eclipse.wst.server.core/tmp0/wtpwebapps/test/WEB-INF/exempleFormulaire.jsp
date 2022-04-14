<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulaire</title>
</head>
<body>

	<!-- Formulaire à destination de la vue ExempleFormulaire en passant
	par la méthode doPost de sa Servlet -->
	<form method="post" action="ExempleFormulaire">

		<label for="nom">Votre Nom :</label> 
		<input type="text" id="nom" name="inputNom" /> 
		
		<!-- Bouton envoyer -->
		<input type="submit" />
		

	</form>

	<!-- Retour du nom après l'envoi via méthode doPost -->

	<c:if test="${!empty keyNom}">	<!--  ${ keyNom != null }-->
		<p>
			<c:out value=" Bonjour ${keyNom} et bienvenu sur cet OpenClassroom JavaEE"></c:out>
		<p>
	</c:if>
</html>
