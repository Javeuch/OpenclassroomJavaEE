
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login et mdp</title>
</head>
<body>

	<!-- Création du formulaire d'authentification par Login/mdp -->

	<form method="post" action="exempleLogin">

		<label for="login">Entrez votre Login :</label> 
		<input type="text" id="login" name="inputLogin" /> 	<br />
		
		<label for="pass">Entrez votre mot de passe :</label>
		<input type="password" id="pass" name="inputPass" />
		
		<input type="submit" value="Valider le formulaire" />

	</form>
	
	<c:if test="${!empty keyConnexion}" >
	<c:out value="${keyConnexion}" ></c:out>
	
	</c:if>

</body>
</html>